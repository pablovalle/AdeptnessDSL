/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.xtext.example.mydsl.adeptness.AdeptnessPackage;
import org.xtext.example.mydsl.adeptness.DOUBLE;
import org.xtext.example.mydsl.adeptness.Description;
import org.xtext.example.mydsl.adeptness.MonitoringFile;
import org.xtext.example.mydsl.adeptness.MonitoringVariable;
import org.xtext.example.mydsl.adeptness.Oracle;
import org.xtext.example.mydsl.adeptness.Signal;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators= { UncertaintyValidator.class, OracleAssesment.class })
public class AdeptnessValidator extends AbstractAdeptnessValidator {

	public static String DUPLICATED_NAME = "Duplicated Name";

	double cantHigh;
	double cantTime;
	double cantDeg;
	double cantXPeak;

	List<String> oracleNames;
	List<String> monitoringVariableNames;

	MonitoringVariables monitoringVariables;

	// GET MONITORING VARIABLES
	@Check
	public void getImportedMonitoringVariables(Signal CPS) {
		monitoringVariables = MonitoringVariables.getInstance(CPS.getName());

		String type, name;
		double min, max;
		Set<String> monitoringVars = new HashSet<String>();
		for (int i = 0; i < CPS.getSuperType().getMonitoringPlan().size(); i++) {
			MonitoringVariable monitor = CPS.getSuperType().getMonitoringPlan().get(i).getMonitoringVariables();
			name = monitor.getName().toString();
			monitoringVars.add(name);
			type = monitor.getMonitoringVariableDatatype().getSig_type().toString();
			if (type.equals("boolean")) {
				max = 1;
				min = 0;
			} else {
				max = monitor.getMax().getDVal();
				min = monitor.getMin().getDVal();
			}
			monitoringVariables.addVariable(CPS.getName(), name, type, max, min);
		}

		// remove unused vars
		Set<String> varNames = new HashSet<>(monitoringVariables.getVarNames());
		for (String varName : varNames) {
			if (!monitoringVars.contains(varName)) {
				monitoringVariables.removeVariable(varName);
			}
		}
	}

	@Check
	public void getMonitoringVariablesNames(MonitoringFile file) {
		monitoringVariableNames = new ArrayList<>();
		for (int i = 0; i < file.getMonitoringPlan().size(); i++) {
			monitoringVariableNames.add(file.getMonitoringPlan().get(i).getMonitoringVariables().getName().toString());
		}
	}

	@Check
	public void checkDuplicatedMonitoringVariableNames(MonitoringVariable variable) {
		String name = variable.getName().toString();
		int cont = 0;
		for (int i = 0; i < monitoringVariableNames.size(); i++) {
			if (monitoringVariableNames.get(i).toString().equals(name)) {
				cont++;
				if (cont > 1) {
					error("Monitoring Variables' name must be unique",
							AdeptnessPackage.Literals.MONITORING_VARIABLE__NAME, DUPLICATED_NAME);
					break;
				}
			}
		}
	}

	@Check
	public void getOraclesNames(Signal CPS) {
		oracleNames = new ArrayList<>();
		for (int i = 0; i < CPS.getOracle().size(); i++) {
			oracleNames.add(CPS.getOracle().get(i).getName().toString());
		}
	}

	@Check
	public void checkDuplicatedOracleNames(Oracle oracle) {
		String name = oracle.getName().toString();
		int cont = 0;
		for (int i = 0; i < oracleNames.size(); i++) {
			if (oracleNames.get(i).toString().equals(name)) {
				cont++;
			}
		}
		if (cont > 1) {
			error("Oracle's name must be unique", AdeptnessPackage.Literals.ORACLE__NAME);
		}
	}

	@Check
	public void checkBooleanMinMaxValidation(MonitoringVariable monitoringVariable) {
		if (monitoringVariable.getMonitoringVariableDatatype().getSig_type().toString().equals("boolean")
				&& (monitoringVariable.getMax() != null || monitoringVariable.getMin() != null)) {
			error("A boolean type signal can't have max and min values",
					AdeptnessPackage.Literals.MONITORING_VARIABLE__MONITORING_VARIABLE_DATATYPE);

		} else if ((monitoringVariable.getMonitoringVariableDatatype().getSig_type().toString().equals("int")
				|| monitoringVariable.getMonitoringVariableDatatype().getSig_type().toString().equals("double"))
				&& (monitoringVariable.getMax() == null || monitoringVariable.getMin() == null)) {
			error("An int or double type signal must have max and min values",
					AdeptnessPackage.Literals.MONITORING_VARIABLE__MONITORING_VARIABLE_DATATYPE);
		}
	}

	@Check
	public void checkMinMaxValues(MonitoringVariable monitoringVariable) {
		if (monitoringVariable.getMax().getDVal() < monitoringVariable.getMin().getDVal()) {
			error("Max value must be higher than min value", AdeptnessPackage.Literals.MONITORING_VARIABLE__MAX);
		}
	}

	@Check
	public void checkValues(DOUBLE value) {
		if (value.getDVal() > 9999999 || value.getDVal() < -9999999) {
			error("This is an invalid value, must be bigger than -9999999 and lower than 9999999",
					AdeptnessPackage.Literals.DOUBLE__DVAL);
		}
	}

	@Check
	public void checkEmptyDescription(Description desc) {
		if (desc.getValue() == null) {
			error("Description cannot be empty", AdeptnessPackage.Literals.DESCRIPTION__VALUE);
		}
	}
}
