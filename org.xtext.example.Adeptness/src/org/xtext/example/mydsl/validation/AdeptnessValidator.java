/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.xtext.example.mydsl.adeptness.AbstractElement2;
import org.xtext.example.mydsl.adeptness.AdeptnessPackage;
import org.xtext.example.mydsl.adeptness.CustomOracle;
import org.xtext.example.mydsl.adeptness.Description;
import org.xtext.example.mydsl.adeptness.ExpressionsModel;
import org.xtext.example.mydsl.adeptness.Library;
import org.xtext.example.mydsl.adeptness.MonitoringFile;
import org.xtext.example.mydsl.adeptness.MonitoringInferVariables;
import org.xtext.example.mydsl.adeptness.MonitoringVariable;
import org.xtext.example.mydsl.adeptness.Oracle;
import org.xtext.example.mydsl.adeptness.Signal;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators = { OracleAssesment.class })
public class AdeptnessValidator extends AbstractAdeptnessValidator {

	public static String DUPLICATED_NAME = "Duplicated Name";

	double cantHigh;
	double cantTime;
	double cantDeg;
	double cantXPeak;

	List<String> oracleNames;
	List<String> monitoringVariableNames;
	List<String> inferenceVariableNames;

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

		for (int i = 0; i < CPS.getSuperType().getMonitoringInferVariables().size(); i++) {
			MonitoringInferVariables monitor = CPS.getSuperType().getMonitoringInferVariables().get(i);
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
		inferenceVariableNames = new ArrayList<>();
		for (int i = 0; i < file.getMonitoringPlan().size(); i++) {
			monitoringVariableNames.add(file.getMonitoringPlan().get(i).getMonitoringVariables().getName().toString());
		}
		for (int i = 0; i < file.getMonitoringInferVariables().size(); i++) {
			inferenceVariableNames.add(file.getMonitoringInferVariables().get(i).getName().toString());
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
		for (int i = 0; i < inferenceVariableNames.size(); i++) {
			if (inferenceVariableNames.get(i).toString().equals(name)) {
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
	public void checkDuplicatedInferenceVariableNames(MonitoringInferVariables variable) {
		String name = variable.getName().toString();
		int cont = 0;
		for (int i = 0; i < monitoringVariableNames.size(); i++) {
			if (monitoringVariableNames.get(i).toString().equals(name)) {
				cont++;
				if (cont > 1) {
					error("Monitoring Variables' name must be unique",
							AdeptnessPackage.Literals.MONITORING_INFER_VARIABLES__NAME, DUPLICATED_NAME);
					break;
				}
			}
		}
		for (int i = 0; i < inferenceVariableNames.size(); i++) {
			if (inferenceVariableNames.get(i).toString().equals(name)) {
				cont++;
				if (cont > 1) {
					error("Monitoring Variables' name must be unique",
							AdeptnessPackage.Literals.MONITORING_INFER_VARIABLES__NAME, DUPLICATED_NAME);
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
	public void checkBooleanMinMaxValidation(MonitoringInferVariables monitoringVariable) {
		if (monitoringVariable.getMonitoringVariableDatatype().getSig_type().toString().equals("boolean")
				&& (monitoringVariable.getMax() != null || monitoringVariable.getMin() != null)) {
			error("A boolean type signal can't have max and min values",
					AdeptnessPackage.Literals.MONITORING_INFER_VARIABLES__MONITORING_VARIABLE_DATATYPE);

		} else if ((monitoringVariable.getMonitoringVariableDatatype().getSig_type().toString().equals("int")
				|| monitoringVariable.getMonitoringVariableDatatype().getSig_type().toString().equals("double"))
				&& (monitoringVariable.getMax() == null || monitoringVariable.getMin() == null)) {
			error("An int or double type signal must have max and min values",
					AdeptnessPackage.Literals.MONITORING_INFER_VARIABLES__MONITORING_VARIABLE_DATATYPE);
		}
	}

	@Check
	public void checkMinMaxValues(MonitoringVariable monitoringVariable) {
		if (monitoringVariable.getMax().getDVal() < monitoringVariable.getMin().getDVal()) {
			error("Max value must be higher than min value", AdeptnessPackage.Literals.MONITORING_VARIABLE__MAX);
		}
	}

	@Check
	public void checkMinMaxValues(MonitoringInferVariables monitoringVariable) {
		if (monitoringVariable.getMax().getDVal() < monitoringVariable.getMin().getDVal()) {
			error("Max value must be higher than min value", AdeptnessPackage.Literals.MONITORING_INFER_VARIABLES__MAX);
		}
	}

	@Check
	public void checkEmptyDescription(MonitoringInferVariables monitoringVariable) {
		if (!monitoringVariable.getModel().endsWith(".tflite")) {
			error("Model must be of type TensorFlow Lite.",
					AdeptnessPackage.Literals.MONITORING_INFER_VARIABLES__MODEL);
		}
	}

	@Check
	public void checkIndepentVariablesInMonitoringFile(MonitoringInferVariables monitoringVariable) {
		checkVariablesInMonitoringPlan(monitoringVariable.getVariables(), "Independent variables list cannot be empty.",
				AdeptnessPackage.Literals.MONITORING_INFER_VARIABLES__VARIABLES);
	}

	@Check
	public void checkEmptyDescription(Description desc) {
		if (desc.getValue() == null) {
			error("Description cannot be empty", AdeptnessPackage.Literals.DESCRIPTION__VALUE);
		}
	}

	@Check
	public void checkCustomOracle(CustomOracle cuOr) {
		checkVariablesInMonitoringPlan(cuOr.getCheckInputs(), "Checks input variables list cannot be empty.",
				AdeptnessPackage.Literals.MONITORING_INFER_VARIABLES__VARIABLES);
		checkVariablesInMonitoringPlan(cuOr.getPredInputs(), "Precondition input variables list cannot be empty.",
				AdeptnessPackage.Literals.CUSTOM_ORACLE__PRED_INPUTS);

	}

	@Check
	public void checkMathLibrary(ExpressionsModel exp) {
		boolean mathFound = false;
		boolean signalFound = false;
		String library = "";
		int frontParenthesis = 0;
		int backParenthesis = 0;
		// error if comparison or logical operator
		for (int i = 0; i < exp.getElements().size(); i++) {
			AbstractElement2 el = exp.getElements().get(i);
			if (el.getMath() != null) {
				// Math libraries cannot be used recursively
				if (mathFound) {
					error("Mathematical functions cannot be used recursively.",
							AdeptnessPackage.Literals.EXPRESSIONS_MODEL__ELEMENTS);
				}
				mathFound = true;
				library = getLibrary(el.getMath().getLibrary());
				if (library.equals("unknown")) {
					error("Unknown mathematical library.",
							AdeptnessPackage.Literals.EXPRESSIONS_MODEL__ELEMENTS);
					return;
				}
				// Math must be followed by a front parenthesis
				if (exp.getElements().get(i + 1) == null
						|| exp.getElements().get(i + 1).getFrontParentheses().size() == 0) {
					error("The expression to apply " + library
							+ " must be surrounded by parenthesis.",
							AdeptnessPackage.Literals.EXPRESSIONS_MODEL__ELEMENTS);
				}
			} 
			
			if (mathFound) {
				frontParenthesis += el.getFrontParentheses().size();
				if (el.getName() != null) {
					signalFound = true;
				} 
				if (el.getOp() != null) {
					for (int j = 0; j < el.getOp().size(); j++) {
						if (mathFound && el.getOp().get(j).getComparation() != null) {
							error("Mathematical functions does not allow comparison operators.",
									AdeptnessPackage.Literals.EXPRESSIONS_MODEL__ELEMENTS);
						} 
						if (mathFound && el.getOp().get(j).getLogicOperator() != null) {
							error("Mathematical functions does not allow logical operators.",
									AdeptnessPackage.Literals.EXPRESSIONS_MODEL__ELEMENTS);
						} 
						if (mathFound && el.getOp().get(j).getBackParentheses() != null) {
							backParenthesis++;
							if (frontParenthesis == backParenthesis) {
								if (!signalFound) {
									error("Mathematical functions must be applied to at least one signal.",
											AdeptnessPackage.Literals.EXPRESSIONS_MODEL__ELEMENTS);
								}
								mathFound = false;
								frontParenthesis = 0;
								backParenthesis = 0;
								signalFound = false;
							}
						}
					}
				}
			} 
			
		}
		if (mathFound && frontParenthesis != backParenthesis) {
			error("The expression to apply " + library
					+ " must be surrounded by parenthesis.",
					AdeptnessPackage.Literals.EXPRESSIONS_MODEL__ELEMENTS);
		}
	}
	
	

	// PRIVATE FUNCTIONS
	private String getLibrary(Library lib) {
		if (lib == null) {
			return "unknown";
		}else if (lib.getCos() != null) {
			return "cosine";
		}else if (lib.getSin() != null) {
			return "sine";
		}else if (lib.getDerivative() != null) {
			return "devirative";
		}else if (lib.getModulus() != null) {
			return "modulus";
		}
		return "unknown";
	}
	
	private void checkVariablesInMonitoringPlan(EList<String> variables, String emptyErrorMessage,
			EAttribute reference) {
		if (variables.size() == 0) {
			error(emptyErrorMessage, reference);
		}
		boolean found;
		for (int i = 0; i < variables.size(); i++) {
			String varName = variables.get(i);
			found = false;
			for (int j = 0; j < monitoringVariableNames.size(); j++) {
				if (monitoringVariableNames.get(j).equals(varName)) {
					found = true;
				}
			}
			if (!found) {
				error("Variable " + varName + " is not in the monitoring plan", reference);
			}
		}
	}

}
