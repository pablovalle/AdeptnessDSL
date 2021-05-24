
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.List;
//import org.xtext.example.mydsl.adeptness.UncertaintyProb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.adeptness.AdeptnessPackage;
import org.xtext.example.mydsl.adeptness.AlternativeMeasure;
import org.xtext.example.mydsl.adeptness.BeliefInterval;
import org.xtext.example.mydsl.adeptness.BernoulliDistribution;
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
import org.xtext.example.mydsl.adeptness.MembershipDegree;
import org.xtext.example.mydsl.adeptness.MembershipDegreeValue;
import org.xtext.example.mydsl.adeptness.NormalDistribution;
import org.xtext.example.mydsl.adeptness.PignisticDistribution;
import org.xtext.example.mydsl.adeptness.PossibleDistribution;
import org.xtext.example.mydsl.adeptness.RoughSet;
import org.xtext.example.mydsl.adeptness.ShannonEntropy;
import org.xtext.example.mydsl.adeptness.Sharpness;

public class UncertaintyValidator extends AbstractAdeptnessValidator {

	MonitoringVariables monitoringVariables;

	@Check
	public void init(Signal CPS) {
		monitoringVariables = MonitoringVariables.getInstance(CPS.getName());
	}

	double UncerValue;

	@Check
	public void checkMonitoringVariablesNormalDistribution(NormalDistribution var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.NORMAL_DISTRIBUTION__NAME);
	}

	@Check
	public void checkMonitoringVariablesBernoulliDistribution(BernoulliDistribution var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.BERNOULLI_DISTRIBUTION__NAME);
	}

	@Check
	public void checkMonitoringVariablesGammaDistribution(GammaDistribution var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.GAMMA_DISTRIBUTION__NAME);
	}

	@Check
	public void checkMonitoringVariablesUniformDistribution(UniformDistribution var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.UNIFORM_DISTRIBUTION__NAME);
	}
	
	@Check
	public void checkMonitoringVariablesPercentage(UniformDistribution var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.PERCENTAGE__NAME);
	}

	@Check
	public void checkMonitoringVariablesFuzzySetCut(FuzzySetCut var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.FUZZY_SET_CUT__NAME);
	}

	@Check
	public void checkMonitoringVariablesFuzzyLogic(FuzzyLogic var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.FUZZY_LOGIC__NAME);
	}

	@Check
	public void checkMonitoringVariablesFuzzySet(FuzzySet var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.FUZZY_SET__NAME);
	}

	@Check
	public void checkMonitoringVariablesIntervalValuedFuzzySet(IntervalValuedFuzzySet var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.INTERVAL_VALUED_FUZZY_SET__NAME);
	}

	@Check
	public void checkMonitoringVariablesLFuzzySet(LFuzzySet var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.LFUZZY_SET__NAME);
	}

	@Check
	public void checkMonitoringVariablesIntuitionisticFuzzySet(IntuitionisticFuzzySet var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.INTUITIONISTIC_FUZZY_SET__NAME);
	}

	@Check
	public void checkMonitoringVariablesVagueSet(VagueSet var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.VAGUE_SET__NAME);
	}

	@Check
	public void checkMonitoringVariablesMembershipDegree(MembershipDegree var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.MEMBERSHIP_DEGREE__NAME);
	}

	@Check
	public void checkMonitoringVariablesFuzzyInterval(FuzzyInterval var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.FUZZY_INTERVAL__NAME);
	}

	@Check
	public void checkMonitoringVariablesTriangularFuzzyNumber(TriangularFuzzyNumber var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.TRIANGULAR_FUZZY_NUMBER__NAME);
	}

	@Check
	public void checkMonitoringVariablesRoughSet(RoughSet var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.ROUGH_SET__NAME);
	}

	@Check
	public void checkMonitoringVariablesSharpness(Sharpness var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.SHARPNESS__NAME);
	}

	@Check
	public void checkMonitoringVariablesShannonEntropy(ShannonEntropy var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.SHANNON_ENTROPY__NAME);
	}

	@Check
	public void checkMonitoringVariablesAlternativeMeasure(AlternativeMeasure var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.ALTERNATIVE_MEASURE__NAME);
	}

	@Check
	public void checkMonitoringVariablesU_Uncertainty(U_Uncertainty var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.UUNCERTAINTY__NAME);
	}

	@Check
	public void checkMonitoringVariablesDissonanceMeasure(DissonanceMeasure var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.DISSONANCE_MEASURE__NAME);
	}

	@Check
	public void checkMonitoringVariablesDistribution(Distribution var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.DISTRIBUTION__NAME);
	}

	@Check
	public void checkMonitoringVariablesBeliefInterval(BeliefInterval var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.BELIEF_INTERVAL__NAME);
	}

	@Check
	public void checkMonitoringVariablesPignisticDistribution(PignisticDistribution var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.PIGNISTIC_DISTRIBUTION__NAME);
	}

	@Check
	public void checkMonitoringVariablesPossibleDistribution(PossibleDistribution var) {
		checkNameInMonitoringVariablesFile(var.getName(), AdeptnessPackage.Literals.POSSIBLE_DISTRIBUTION__NAME);
	}

	private void checkNameInMonitoringVariablesFile(String name, EAttribute reference) {
		if (name == null) {
			error("Must specify a variable name from the monitoring plan", reference);
			return;
		}
		MonitoringVar emVar = monitoringVariables.getVariables().get(name);
		if (emVar == null) {
			error("Variable " + name + " is not in the monitoring plan", reference);
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
				error("The value of Membership Degree must be between 0 and 1",
						AdeptnessPackage.Literals.MEMBERSHIP_DEGREE_VALUE__EQUAL_VALUE);
			}
		}

	}

	@Check
	public void checkMembershipDegreeValue2(MembershipDegreeValue MDV) {
		if (MDV != null) {
			UncerValue = MDV.getValu().getDVal();
			if (UncerValue <= 0 || UncerValue >= 1) {
				error("The value of Membership Degree must be between 0 and 1",
						AdeptnessPackage.Literals.MEMBERSHIP_DEGREE_VALUE__VALU);
			}
		}

	}

	@Check
	public void checkFuzzySetCutLambda(FuzzySetCutLam FSCL) {
		if (FSCL != null) {
			UncerValue = FSCL.getLamEqualValue().getBound_upp().getValue().getDVal();
			if (UncerValue <= 0 || UncerValue >= 1) {
				error("The lambda of Fuzzy Set Cut must be between 0 and 1",
						AdeptnessPackage.Literals.FUZZY_SET_CUT_LAM__LAM_EQUAL_VALUE);
			}
		}

	}

	@Check
	public void checkFuzzySetCutLambda2(FuzzySetCutLam FSCL) {
		if (FSCL != null) {
			UncerValue = FSCL.getLamValu().getDVal();
			if (UncerValue <= 0 || UncerValue >= 1) {
				error("The lambda of Fuzzy Set Cut must be between 0 and 1",
						AdeptnessPackage.Literals.FUZZY_SET_CUT_LAM__LAM_VALU);
			}
		}

	}

}
