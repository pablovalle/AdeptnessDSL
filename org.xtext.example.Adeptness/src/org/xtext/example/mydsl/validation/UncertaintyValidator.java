
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.List;
//import org.xtext.example.mydsl.adeptness.UncertaintyProb;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.adeptness.AbstractElement2;
import org.xtext.example.mydsl.adeptness.AdeptnessPackage;
import org.xtext.example.mydsl.adeptness.AlternativeMeasure;
import org.xtext.example.mydsl.adeptness.BeliefInterval;
import org.xtext.example.mydsl.adeptness.BernoulliDistribution;
import org.xtext.example.mydsl.adeptness.Checks;
import org.xtext.example.mydsl.adeptness.ConstDeg;
import org.xtext.example.mydsl.adeptness.DissonanceMeasure;
import org.xtext.example.mydsl.adeptness.Distribution;
import org.xtext.example.mydsl.adeptness.FuzzyInterval;
import org.xtext.example.mydsl.adeptness.FuzzyLogic;
import org.xtext.example.mydsl.adeptness.FuzzySet;
import org.xtext.example.mydsl.adeptness.FuzzySetCut;
import org.xtext.example.mydsl.adeptness.FuzzySetCutLam;
import org.xtext.example.mydsl.adeptness.GammaDistribution;
import org.xtext.example.mydsl.adeptness.IntervalValuedFuzzySet;
import org.xtext.example.mydsl.adeptness.IntuitionisticFuzzySet;
import org.xtext.example.mydsl.adeptness.LFuzzySet;
import org.xtext.example.mydsl.adeptness.Signal;
import org.xtext.example.mydsl.adeptness.TriangularFuzzyNumber;
import org.xtext.example.mydsl.adeptness.U_Uncertainty;
import org.xtext.example.mydsl.adeptness.UniformDistribution;
import org.xtext.example.mydsl.adeptness.VagueSet;
import org.xtext.example.mydsl.adeptness.XPeaks;
import org.xtext.example.mydsl.adeptness.MembershipDegree;
import org.xtext.example.mydsl.adeptness.MembershipDegreeValue;
import org.xtext.example.mydsl.adeptness.MonitoringFile;
import org.xtext.example.mydsl.adeptness.MonitoringVariable;
import org.xtext.example.mydsl.adeptness.NormalDistribution;
import org.xtext.example.mydsl.adeptness.PignisticDistribution;
import org.xtext.example.mydsl.adeptness.PossibleDistribution;
import org.xtext.example.mydsl.adeptness.RoughSet;
import org.xtext.example.mydsl.adeptness.ShannonEntropy;
import org.xtext.example.mydsl.adeptness.Sharpness;


public class UncertaintyValidator extends AbstractAdeptnessValidator{
	
	List<MonitoringVariables> monitoringVariableList;
	List<String> monitoringVariableNames;
	double UncerValue;
	OperationalDataConnector opCon = new OperationalDataConnector();
	
	@Check
	public void validateSomething(Signal CPS) {
		System.out.println("From uncertainty validator");
	}
	
	@Check
	public void checkCheckSignal(Checks check) {
		// Left part in check must contain at least a variable name
		List<AbstractElement2> elems = check.getEm().getElements();
		boolean anyVar = false;
		for (AbstractElement2 elem : elems) {
			if (elem.getName() != null || elem.getUncer1()!= null || elem.getUncer2()!= null || elem.getUncer3()!= null) {
				anyVar = true;
				break;
			}
		}
		if (!anyVar) {
			error("Checks' left part must represent a signal, can not be a value.",
					AdeptnessPackage.Literals.CHECKS__EM);
		}
	}
	
	
	
	// GET MONITORING VARIABLES
		@Check
		public void getImportedMonitoringVariables(Signal CPS) {
			// TODO Executed on every change. Ideal scenario: execute this function the
			// first time a change within this CPS is done.
			monitoringVariableList = new ArrayList<>();
//			monitoringVariables =  new HashMap<String, MonitoringVariables>();

			String type, name;
			double min, max;
			for (int i = 0; i < CPS.getSuperType().getMonitoringPlan().size(); i++) {
				MonitoringVariable monitor = CPS.getSuperType().getMonitoringPlan().get(i).getMonitoringVariables();
				name = monitor.getName().toString();
				type = monitor.getMonitoringVariableDatatype().getSig_type().toString();
				if (type.equals("boolean")) {
					max = 1;
					min = 0;
				} else {
					max = monitor.getMax().getDVal();
					min = monitor.getMin().getDVal();
				}
				MonitoringVariables monitoringVar = new MonitoringVariables(name, type, max, min);
				// if no data was retrieved, opData will be null
				monitoringVar.setOpData(opCon.getVariableOpData(name));

				monitoringVariableList.add(monitoringVar);
//				monitoringVariables.put(name, monitoringVar);
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
	public void checkMonitoringVariablesNormalDistribution(NormalDistribution var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.NORMAL_DISTRIBUTION__NAME);
		}
	}
	
	@Check
	public void checkMonitoringVariablesBernoulliDistribution(BernoulliDistribution var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.BERNOULLI_DISTRIBUTION__NAME);
		}
	}
	
	@Check
	public void checkMonitoringVariablesGammaDistribution(GammaDistribution var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.GAMMA_DISTRIBUTION__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesUniformDistribution(UniformDistribution var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.UNIFORM_DISTRIBUTION__NAME);
		}
	}
	
	
	
	
	@Check
	public void checkMonitoringVariablesFuzzySetCut(FuzzySetCut var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.FUZZY_SET_CUT__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesFuzzyLogic(FuzzyLogic var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.FUZZY_LOGIC__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesFuzzySet(FuzzySet var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.FUZZY_SET__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesIntervalValuedFuzzySet(IntervalValuedFuzzySet var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.INTERVAL_VALUED_FUZZY_SET__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesLFuzzySet(LFuzzySet var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.LFUZZY_SET__NAME);
		}
	}
	
	@Check
	public void checkMonitoringVariablesIntuitionisticFuzzySet(IntuitionisticFuzzySet var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.INTUITIONISTIC_FUZZY_SET__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesVagueSet(VagueSet var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.VAGUE_SET__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesMembershipDegree(MembershipDegree var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.MEMBERSHIP_DEGREE__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesFuzzyInterval(FuzzyInterval var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.FUZZY_INTERVAL__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesTriangularFuzzyNumber(TriangularFuzzyNumber var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.TRIANGULAR_FUZZY_NUMBER__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesRoughSet(RoughSet var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.ROUGH_SET__NAME);
		}
	}
	
	@Check
	public void checkMonitoringVariablesSharpness(Sharpness var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.SHARPNESS__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesShannonEntropy(ShannonEntropy var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.SHANNON_ENTROPY__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesAlternativeMeasure(AlternativeMeasure var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.ALTERNATIVE_MEASURE__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesU_Uncertainty(U_Uncertainty var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.UUNCERTAINTY__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesDissonanceMeasure(DissonanceMeasure var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.DISSONANCE_MEASURE__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesDistribution(Distribution var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.DISTRIBUTION__NAME);
		}
	}
	
	
	@Check
	public void checkMonitoringVariablesBeliefInterval(BeliefInterval var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.BELIEF_INTERVAL__NAME);
		}
	}
	
	@Check
	public void checkMonitoringVariablesPignisticDistribution(PignisticDistribution var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.PIGNISTIC_DISTRIBUTION__NAME);
		}
	}
	
	@Check
	public void checkMonitoringVariablesPossibleDistribution(PossibleDistribution var) {
		String checkName = var.getName().toString();
		boolean is = false;
		for (int i = 0; i < monitoringVariableList.size(); i++) {
			System.out.println(monitoringVariableList.get(i).getName());
			if (checkName.equals(monitoringVariableList.get(i).getName())) {
				System.out.println(checkName + "      " + monitoringVariableList.get(i).getName());
				is = true;

				break;
			}
		}
		if (!is) {
			error("This variable is not in the monitoring plan", AdeptnessPackage.Literals.POSSIBLE_DISTRIBUTION__NAME);
		}
	}
	
	
	
	
	
	
//	@Check
//	public void checkMembershipDegreeValue(MembershipDegreeValue MDValue) {
//		if (MDValue != null) {
//			UncerValue = MDValue.getMvalue().getDVal();
//			if (UncerValue < 0 || UncerValue > 1) {
//				error("The MembershipDegree value must be between 0 and 1", AdeptnessPackage.Literals.MEMBERSHIP_DEGREE__MEMBERSHIP_DEGREE_VALUE);
//			}
//		}
//
//	}
	
	
//	@Check
//	public void checkMembershipDegreeValue(MembershipDegreeValue EqualValue) {
//		if (EqualValue != null) {
//			UncerValue = EqualValue.getEqualValue().getEv().getDVal();
//			if (UncerValue < -1 || UncerValue > 0) {
//				error("The cvalue must be between -1 and 0", AdeptnessPackage.Literals.MEMBERSHIP_DEGREE_VALUE__EQUAL_VALUE);
//			}
//		}
//
//	}
	
	
	@Check
	public void checkMembershipDegreeValue(MembershipDegreeValue MDV) {
		if (MDV != null) {
			UncerValue = MDV.getEqualValue().getBound_upp().getValue().getDVal();
			if (UncerValue <= 0 || UncerValue >= 1) {
				error("The value of Membership Degree must be between 0 and 1", AdeptnessPackage.Literals.MEMBERSHIP_DEGREE_VALUE__EQUAL_VALUE);
			}
		}

	}
	
	
	@Check
	public void checkMembershipDegreeValue2(MembershipDegreeValue MDV) {
		if (MDV != null) {
			UncerValue = MDV.getValu().getDVal();
			if (UncerValue <= 0 || UncerValue >= 1) {
				error("The value of Membership Degree must be between 0 and 1", AdeptnessPackage.Literals.MEMBERSHIP_DEGREE_VALUE__VALU);
			}
		}

	}
	
	
	@Check
	public void checkFuzzySetCutLambda(FuzzySetCutLam FSCL) {
		if (FSCL != null) {
			UncerValue = FSCL.getLamEqualValue().getBound_upp().getValue().getDVal();
			if (UncerValue <= 0 || UncerValue >= 1) {
				error("The lambda of Fuzzy Set Cut must be between 0 and 1", AdeptnessPackage.Literals.FUZZY_SET_CUT_LAM__LAM_EQUAL_VALUE);
			}
		}

	}
	
	
	@Check
	public void checkFuzzySetCutLambda2(FuzzySetCutLam FSCL) {
		if (FSCL != null) {
			UncerValue = FSCL.getLamValu().getDVal();
			if (UncerValue <= 0 || UncerValue >= 1) {
				error("The lambda of Fuzzy Set Cut must be between 0 and 1", AdeptnessPackage.Literals.FUZZY_SET_CUT_LAM__LAM_VALU);
			}
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
