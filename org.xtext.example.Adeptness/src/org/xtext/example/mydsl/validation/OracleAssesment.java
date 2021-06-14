package org.xtext.example.mydsl.validation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.ScriptException;
import com.oracle.truffle.js.scriptengine.GraalJSEngineFactory;
import com.oracle.truffle.js.scriptengine.GraalJSScriptEngine;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.xtext.example.mydsl.adeptness.AbstractElement2;
import org.xtext.example.mydsl.adeptness.AdeptnessPackage;
import org.xtext.example.mydsl.adeptness.At_least;
import org.xtext.example.mydsl.adeptness.At_most;
import org.xtext.example.mydsl.adeptness.Bound_Down;
import org.xtext.example.mydsl.adeptness.Bound_up;
import org.xtext.example.mydsl.adeptness.Checks;
import org.xtext.example.mydsl.adeptness.DOUBLE;
import org.xtext.example.mydsl.adeptness.Exactly;
import org.xtext.example.mydsl.adeptness.ExpressionsModel;
import org.xtext.example.mydsl.adeptness.FailReason;
import org.xtext.example.mydsl.adeptness.Gap;
import org.xtext.example.mydsl.adeptness.HighPeak;
import org.xtext.example.mydsl.adeptness.HighTime;
import org.xtext.example.mydsl.adeptness.Library;
import org.xtext.example.mydsl.adeptness.Lower;
import org.xtext.example.mydsl.adeptness.NotSame;
import org.xtext.example.mydsl.adeptness.Operators;
import org.xtext.example.mydsl.adeptness.Oracle;
import org.xtext.example.mydsl.adeptness.Range;
import org.xtext.example.mydsl.adeptness.Reason;
import org.xtext.example.mydsl.adeptness.Same;
import org.xtext.example.mydsl.adeptness.Signal;
import org.xtext.example.mydsl.adeptness.TimeType;
import org.xtext.example.mydsl.adeptness.Upper;
import org.xtext.example.mydsl.adeptness.Wait;
import org.xtext.example.mydsl.adeptness.When;
import org.xtext.example.mydsl.adeptness.While;

public class OracleAssesment extends AbstractAdeptnessValidator {

	MonitoringVariables monitoringVariables;

	@Check
	public void init(Signal CPS) {
		monitoringVariables = MonitoringVariables.getInstance(CPS.getName());
	}

	@Check
	public void checkMath(Library lib) {
		errorDetected = true;
	}

	private Oracle oracle;
	private Constants.PRECONDS precond;
	private boolean whenPrecondMet = false;
	// precond timestamp
	private int savedTimestamp = 0;
	private int aWDuration = 0;

	private Constants.PATTERNS pattern;
	private Constants.TIMING_PATTERNS tpattern;
	private int duration;

	private double signalMax;
	private double signalMin;

	private boolean errorDetected = false;

	private Set<Constants.FAILREASONS> failReasons = new HashSet<Constants.FAILREASONS>();

	@Check
	public void resetOracle(Oracle oracle) {
		resetParameters();
		this.oracle = oracle;
	}

	@Check
	public void checkEmptyOracleName(Oracle or) {
		if (or.getName() == null) {
			error("Oracles must be given a name", AdeptnessPackage.Literals.ORACLE__NAME);
			errorDetected = true;
		}
	}

	// DETECT ERRORS WITHIN EXPRESSIONS
	@Check
	public void checkExpressionModelVarsInMonitoringVariablesFile(AbstractElement2 elem) {
		if (elem.getUncer1() != null || elem.getUncer2() != null || elem.getUncer3() != null) {
			// TODO: check with operational data when uncertainty type checks is set
			errorDetected = true;
			return;
		}
		if (elem.getName() == null)
			return;
		checkNameInMonitoringVariablesFile(elem.getName(), AdeptnessPackage.Literals.ABSTRACT_ELEMENT2__NAME);
	}

	@Check
	public void checkCheckNameInMonitoringVariablesFile(Checks check) {
		if (check.getName() == null)
			return;
		checkNameInMonitoringVariablesFile(check.getName(), AdeptnessPackage.Literals.CHECKS__NAME);
	}

	private void checkNameInMonitoringVariablesFile(String name, EAttribute reference) {
		MonitoringVar emVar = monitoringVariables.getVariables().get(name);
		if (emVar == null) {
			error("Variable " + name + " is not in the monitoring plan", reference);
			errorDetected = true;
		} else {
			if (emVar.getOpData() == null) {
				// Not operational data registered. Prevent operational data checks.
				errorDetected = true;
			}
		}

	}

	@Check
	public void checkExpressions(ExpressionsModel data) {
		int conOpenPar = 0, conClosePar = 0;
		boolean uncer = false;

		for (int i = 0; i < data.getElements().size(); i++) {
			AbstractElement2 elements = data.getElements().get(i);

			if (elements.getUncer1() != null || elements.getUncer2() != null || elements.getUncer3() != null) {
				uncer = true;
			}

			conOpenPar = conOpenPar + elements.getFrontParentheses().size();

			// current element (which is not the first one) contains name or value,
			// and preceding element also contains name or value.
			if (i > 0 && (elements.getName() != null || elements.getValue() != null)
					&& (data.getElements().get(i - 1).getName() != null
							|| data.getElements().get(i - 1).getValue() != null)) {
				// preceding element does not contain operation.
				// Example: "var 1" or "var ( var"
				if (data.getElements().get(i - 1).getOp().size() == 0) {
					error("Two values or signals cannot be concatenated without an operator",
							AdeptnessPackage.Literals.EXPRESSIONS_MODEL__ELEMENTS);
					errorDetected = true;
				}
			}

			for (int j = 0; j < elements.getOp().size(); j++) {
				if (elements.getOp().get(j).getBackParentheses() != null) {
					conClosePar++;
				}

				// Hemen elemento baten barnean ea parentesia eta operazionala dagoen begiratzen
				// dugu.
				// Adeptness.xtext-en AbstractElement2 begiratzen baduzu op lista bat da non
				// operazionalak,logikoak eta parentesiak dauden
				// ordun parentesi baten aurretik parentesia ez den elementu bat badago errorea
				// ematen du
				// Adibideak: <) edo &&) eta holakoak errorea ematea
				if (j > 0 && elements.getOp().get(j).getBackParentheses() != null
						&& elements.getOp().get(j - 1).getBackParentheses() == null) {
					error("Operators cannot be concatenated this way",
							AdeptnessPackage.Literals.EXPRESSIONS_MODEL__ELEMENTS);
					errorDetected = true;
				}
				// Hemen aurrekoan berdina begiratzen da baina parentesiak ez badira, adibidez +
				// && errorea eman beharko luke
				if (j > 0 && elements.getOp().get(j).getBackParentheses() == null
						&& elements.getOp().get(j - 1).getBackParentheses() == null) {
					error("Operators cannot be concatenated this way",
							AdeptnessPackage.Literals.EXPRESSIONS_MODEL__ELEMENTS);
					errorDetected = true;
				}
			}
		}
		if (conOpenPar != conClosePar) {
			error("Parentheses are not correctly opened and closed",
					AdeptnessPackage.Literals.EXPRESSIONS_MODEL__ELEMENTS);
			errorDetected = true;
		}

		// Check if expression model is correctly evaluated otherwise is not well
		// formated.
		if (!uncer && evalExpression(getExpression("basic", data.getElements())) == null) {
			error("Incorrect expression.", AdeptnessPackage.Literals.EXPRESSIONS_MODEL__ELEMENTS);
			errorDetected = true;
		}
	}

	// PRECONDITION CHECKS AND INFORMATION GATHERING
	@Check
	public void checkWhileConditions(While whi) {
		this.precond = Constants.PRECONDS.WHILE;
		checkComparison(whi.getEm(), AdeptnessPackage.Literals.WHILE__EM);
	}

	@Check
	public void checkWhenConditions(When whe) {
		if (whe.getAw() != null) {
			this.precond = Constants.PRECONDS.WHENAFTERWHEN;
		} else {
			this.precond = Constants.PRECONDS.WHEN;
		}
		checkComparison(whe.getEm(), AdeptnessPackage.Literals.WHEN__EM);
	}

	private void checkComparison(ExpressionsModel expr, EReference reference) {
		if (expr == null) {
			error("Condition cannot be empty.", reference);
			errorDetected = true;
			return;
		}

		int contLogicOp = 0, contCompOp = 0;
		boolean mathFound = false;
		int frontParenthesis = 0, backParenthesis = 0;
		for (int i = 0; i < expr.getElements().size(); i++) {
			AbstractElement2 element = expr.getElements().get(i);
			if (element.getMath() != null) {
				mathFound = true;
			}
			if (mathFound) {
				frontParenthesis += element.getFrontParentheses().size();
			}
			for (int j = 0; j < element.getOp().size(); j++) {
				if (mathFound && element.getOp().get(j).getBackParentheses() != null) {
					backParenthesis++;
					if (frontParenthesis == backParenthesis) {
						mathFound = false;
						frontParenthesis = 0;
						backParenthesis = 0;
					}
				}
				if (!mathFound && element.getOp().get(j).getLogicOperator() != null) {
					contLogicOp++;
				} else if (!mathFound && element.getOp().get(j).getComparation() != null) {
					contCompOp++;
				}
			}
		}
		if (contLogicOp + 1 < contCompOp) {
			error("Conditions must be concatenated by logical operators.", reference);
			errorDetected = true;
			return;
		} else if (contLogicOp + 1 != contCompOp) {
			error("Expression must be a condition.", reference);
			errorDetected = true;
			return;
		}
	}

	@Check
	public void checkAfterWhenEmptyValues(Wait wait) {
		if (wait.getUnit() == null) {
			error("Enter a time unit (milliseconds, seconds, minutes or hours).", AdeptnessPackage.Literals.WAIT__UNIT);
			errorDetected = true;
			return;
		}

		// there is no way to detect empty wait.getTime() -> takes 0.0 value by default
		// automatic validation detects it anyway -> EDOUBLE cannot be null
		double dur = wait.getTime().getDVal();
		if (dur < 0) {
			error("Duration must be positive.", AdeptnessPackage.Literals.WAIT__TIME);
			errorDetected = true;
			return;
		}
		aWDuration = getDurationInSeconds(dur, wait.getUnit().getTime());
	}

	// CHECKS STATEMENT CHECKS AND INFORMATION GATHERING
	@Check
	public void checkCheckSignal(Checks check) {
		// Left part in check must contain at least a variable name
		if (check.getName() == null && check.getEm() == null) {
			error("Checks' left part must represent a signal, cannot be empty.", AdeptnessPackage.Literals.CHECKS__EM);
			errorDetected = true;
			return;
		}

		List<AbstractElement2> elems = check.getEm().getElements();
		boolean anyVar = false;
		for (AbstractElement2 elem : elems) {
			if (elem.getName() != null || elem.getUncer1() != null || elem.getUncer2() != null
					|| elem.getUncer3() != null) {
				anyVar = true;
				break;
			}
		}
		if (!anyVar) {
			error("Checks' left part must represent a signal, cannot be a value.",
					AdeptnessPackage.Literals.CHECKS__EM);
			errorDetected = true;
			return;
		}

	}

	@Check
	public void checkReferenceBetweenMonitoringVariableMinMax(Checks check) {
		if (check.getEm() != null) {
			System.out.println(
					"TODO Check if expressionsModel within Checks statement is correct according to min, max variable values in monitoring plan");
			return;
		}

		MonitoringVar checkVar = monitoringVariables.getVariables().get(check.getName().toString());
		if (checkVar == null)
			return;

		double max = checkVar.getMax();
		double min = checkVar.getMin();

		Bound_up bound_up = null;
		Bound_Down bound_down = null;
		if (check.getReference().getUpper() != null) {
			bound_up = check.getReference().getUpper().getBound_upp();
		} else if (check.getReference().getLower() != null) {
			bound_down = check.getReference().getLower().getBound_lower();
		} else if (check.getReference().getRange() != null) {
			bound_down = check.getReference().getRange().getBound_lower();
			bound_up = check.getReference().getRange().getBound_upp();
		} else if (check.getReference().getGap() != null) {
			bound_down = check.getReference().getGap().getBound_lower();
			bound_up = check.getReference().getGap().getBound_upp();
		} else if (check.getReference().getSame() != null) {
			bound_up = check.getReference().getSame().getBound_upp();
		} else if (check.getReference().getNotsame() != null) {
			bound_up = check.getReference().getNotsame().getBound_upp();
		}

		Double boundup = null, boundown = null;
		if (bound_up != null) {
			if (bound_up.getEm() != null) {
				System.out.println(
						"TODO Check if expressionsModel within Upper bound statement is correct according to min, max variable values in monitoring plan");
			}
			boundup = bound_up.getValue().getDVal();
			if (boundup > max) {
				error("Check " + check.getName() + " with value: " + boundup + " does not comply max value: " + max
						+ " specified in the validation plan", AdeptnessPackage.Literals.CHECKS__REFERENCE);
				errorDetected = true;
			}
			if (boundup < min) {
				error("Check " + check.getName() + " with value: " + boundup + " does not comply min value: " + min
						+ " specified in the validation plan", AdeptnessPackage.Literals.CHECKS__REFERENCE);
				errorDetected = true;
			}
		}
		if (bound_down != null) {
			if (bound_down.getEm() != null) {
				System.out.println(
						"TODO Check if expressionsModel within Lower bound statement is correct according to min, max variable values in monitoring plan");
			}
			boundown = bound_down.getValue().getDVal();
			if (boundown > max) {
				error("Check " + check.getName() + " with value: " + boundown + " does not comply max value: " + max
						+ " specified in the validation plan", AdeptnessPackage.Literals.CHECKS__REFERENCE);
				errorDetected = true;
			}
			if (boundown < min) {
				error("Check " + check.getName() + " with value: " + boundown + " does not comply min value: " + min
						+ " specified in the validation plan", AdeptnessPackage.Literals.CHECKS__REFERENCE);
				errorDetected = true;
			}
		}
	}

	@Check
	public void checkChecksCondition(Checks check) {
		for (int i = 0; i < check.getEm().getElements().size(); i++) {
			AbstractElement2 element = check.getEm().getElements().get(i);
			for (int j = 0; j < element.getOp().size(); j++) {
				if (element.getOp().get(j).getLogicOperator() != null) {
					error("Operator: " + element.getOp().get(j).getLogicOperator().getOp().toString()
							+ " is not available for checks", AdeptnessPackage.Literals.CHECKS__EM);
					errorDetected = true;
				} else if (element.getOp().get(j).getComparation() != null) {
					error("Operator: " + element.getOp().get(j).getComparation().getOp().toString()
							+ " is not available for checks", AdeptnessPackage.Literals.CHECKS__EM);
					errorDetected = true;
				}
			}
		}
	}

	@Check
	public void checkEmptyLowerValue(Lower lower) {
		this.pattern = Constants.PATTERNS.ABOVE_REFERENCE;
		checkBound(lower.getBound_lower().getValue(), lower.getBound_lower().getEm(), "Lower",
				AdeptnessPackage.Literals.LOWER__BOUND_LOWER);
		checkTempCondWithPrecond(lower.getAtleast() != null, AdeptnessPackage.Literals.LOWER__ATLEAST);
		checkTempCondWithPrecond(lower.getAtmost() != null, AdeptnessPackage.Literals.LOWER__ATMOST);
		checkTempCondWithPrecond(lower.getExactly() != null, AdeptnessPackage.Literals.LOWER__EXACTLY);
	}

	@Check
	public void checkEmptyUpperValue(Upper upper) {
		this.pattern = Constants.PATTERNS.BELOW_REFERENCE;
		checkBound(upper.getBound_upp().getValue(), upper.getBound_upp().getEm(), "Upper",
				AdeptnessPackage.Literals.UPPER__BOUND_UPP);
		checkTempCondWithPrecond(upper.getAtleast() != null, AdeptnessPackage.Literals.UPPER__ATLEAST);
		checkTempCondWithPrecond(upper.getAtmost() != null, AdeptnessPackage.Literals.UPPER__ATMOST);
		checkTempCondWithPrecond(upper.getExactly() != null, AdeptnessPackage.Literals.UPPER__EXACTLY);
	}

	@Check
	public void checkBoundValues(Range range) {
		this.pattern = Constants.PATTERNS.RANGE;
		checkBound(range.getBound_lower().getValue(), range.getBound_lower().getEm(), "Lower",
				AdeptnessPackage.Literals.RANGE__BOUND_LOWER);
		checkBound(range.getBound_upp().getValue(), range.getBound_upp().getEm(), "Upper",
				AdeptnessPackage.Literals.RANGE__BOUND_UPP);
		checkDownBoundLower(range.getBound_lower().getValue(), range.getBound_upp().getValue(),
				AdeptnessPackage.Literals.RANGE__BOUND_LOWER);

		checkTempCondWithPrecond(range.getAtleast() != null, AdeptnessPackage.Literals.RANGE__ATLEAST);
		checkTempCondWithPrecond(range.getAtmost() != null, AdeptnessPackage.Literals.RANGE__ATMOST);
		checkTempCondWithPrecond(range.getExactly() != null, AdeptnessPackage.Literals.RANGE__EXACTLY);

	}

	@Check
	public void checkBoundValues(Gap gap) {
		this.pattern = Constants.PATTERNS.GAP;
		checkBound(gap.getBound_lower().getValue(), gap.getBound_lower().getEm(), "Lower",
				AdeptnessPackage.Literals.GAP__BOUND_LOWER);
		checkBound(gap.getBound_upp().getValue(), gap.getBound_upp().getEm(), "Upper",
				AdeptnessPackage.Literals.GAP__BOUND_UPP);
		checkDownBoundLower(gap.getBound_lower().getValue(), gap.getBound_upp().getValue(),
				AdeptnessPackage.Literals.GAP__BOUND_LOWER);
		checkTempCondWithPrecond(gap.getAtleast() != null, AdeptnessPackage.Literals.GAP__ATLEAST);
		checkTempCondWithPrecond(gap.getAtmost() != null, AdeptnessPackage.Literals.GAP__ATMOST);
		checkTempCondWithPrecond(gap.getExactly() != null, AdeptnessPackage.Literals.GAP__EXACTLY);
	}

	@Check
	public void checkEmptyLowerValue(Same same) {
		this.pattern = Constants.PATTERNS.SAME_REFERENCE;
		checkBound(same.getBound_upp().getValue(), same.getBound_upp().getEm(), "Upper",
				AdeptnessPackage.Literals.SAME__BOUND_UPP);
		checkTempCondWithPrecond(same.getAtleast() != null, AdeptnessPackage.Literals.SAME__ATLEAST);
		checkTempCondWithPrecond(same.getAtmost() != null, AdeptnessPackage.Literals.SAME__ATMOST);
		checkTempCondWithPrecond(same.getExactly() != null, AdeptnessPackage.Literals.SAME__EXACTLY);
	}

	@Check
	public void checkEmptyLowerValue(NotSame notSame) {
		this.pattern = Constants.PATTERNS.NOTSAME_REFERENCE;
		checkBound(notSame.getBound_upp().getValue(), notSame.getBound_upp().getEm(), "Upper",
				AdeptnessPackage.Literals.NOT_SAME__BOUND_UPP);
		checkTempCondWithPrecond(notSame.getAtleast() != null, AdeptnessPackage.Literals.NOT_SAME__ATLEAST);
		checkTempCondWithPrecond(notSame.getAtmost() != null, AdeptnessPackage.Literals.NOT_SAME__ATMOST);
		checkTempCondWithPrecond(notSame.getExactly() != null, AdeptnessPackage.Literals.NOT_SAME__EXACTLY);
	}

	private void checkBound(DOUBLE value, ExpressionsModel em, String type, EReference reference) {
		if (value == null && em == null) {
			error(type + " bound must be a value or an expression", reference);
			errorDetected = true;
		}
	}

	private void checkDownBoundLower(DOUBLE lowerBound, DOUBLE upperBound, EReference reference) {
		if (lowerBound != null && upperBound != null) {
			if (lowerBound.getDVal() > upperBound.getDVal()) {
				error("Lower bound cannot be higher than upper bound", reference);
				errorDetected = true;
			}
		} else {
			System.out.println(
					"TODO: check ExpressionsModel to check if lower bound is really lower than upper bound in a range");
		}
	}

	private void checkTempCondWithPrecond(boolean temp, EReference reference) {
		if (temp && this.precond == null) {
			error("Temporary conditions within assertions should only be used in conjuction with \"while\" or \"when\" preconditions.",
					reference);
			errorDetected = true;
		}
	}

	@Check
	public void checkAtLeastTime(At_least atLeast) {
		this.tpattern = Constants.TIMING_PATTERNS.ATLEAST;
		checkTimeAndDuration(atLeast.getTime(), atLeast.getUnit(), AdeptnessPackage.Literals.AT_LEAST__TIME,
				AdeptnessPackage.Literals.AT_LEAST__UNIT);
	}

	@Check
	public void checkAtMostTimeAndDuration(At_most atMost) {
		this.tpattern = Constants.TIMING_PATTERNS.ATMOST;
		checkTimeAndDuration(atMost.getTime(), atMost.getUnit(), AdeptnessPackage.Literals.AT_MOST__TIME,
				AdeptnessPackage.Literals.AT_MOST__UNIT);
	}

	@Check
	public void checkExactlyTime(Exactly exactly) {
		this.tpattern = Constants.TIMING_PATTERNS.EXACTLY;
		checkTimeAndDuration(exactly.getTime(), exactly.getUnit(), AdeptnessPackage.Literals.EXACTLY__TIME,
				AdeptnessPackage.Literals.EXACTLY__UNIT);
	}

	private void checkTimeAndDuration(DOUBLE time, TimeType timeUnit, EReference timeReference,
			EReference unitReference) {
		if (time.getDVal() < 0) {
			error("Duration must be positive.", timeReference);
			errorDetected = true;
			return;
		} else if (time.getDVal() == 0) {
			error("Duration cannot be zero.", timeReference);
			errorDetected = true;
			return;
		}

		if (timeUnit == null) {
			error("Enter time unit (milliseconds, seconds, minutes or hours).", unitReference);
			errorDetected = true;
			return;
		}

		Double dur = time != null ? time.getDVal() : null;
		String unit = timeUnit != null ? timeUnit.toString() : null;
		if (dur != null && timeUnit != null) {
			duration = getDurationInSeconds(dur, unit);
		}
	}

	// FAILS IF STATEMENTS CHECKS AND INFORMATION GATHERING
	@Check
	public void checkHighTimeAndHighPeak(Checks check) {
		boolean HT = false;
		boolean HP = false;
		int numHT = 0, numHP = 0;
		for (int i = 0; i < check.getFailReason().size(); i++) {
			if (check.getFailReason().get(i).getReason().getHighTime() != null) {
				HT = true;
				numHT = i;
			} else if (check.getFailReason().get(i).getReason().getHighPeak() != null) {
				HP = true;
				numHP = i;
			}
		}
		if (HT && HP) {
			HighTime Ht = check.getFailReason().get(numHT).getReason().getHighTime();
			HighPeak Hp = check.getFailReason().get(numHP).getReason().getHighPeak();
			if (Ht.getCant().getDVal() <= Hp.getCant().getDVal()) {
				error("High peak reference's confidence value must be lower than High time out of bound reference's confidence value",
						AdeptnessPackage.Literals.CHECKS__FAIL_REASON);
			}
		}
	}

	@Check
	public void checkFailReasons(FailReason fr) {
		if (fr.getReason() == null) {
			error("Incomplete fails if statement. ", AdeptnessPackage.Literals.FAIL_REASON__REASON);
			return;
		}
	}

	@Check
	public void checkFailReasons(Reason fr) {
		Constants.FAILREASONS frk = null;
		double confidence = 0.0;
		int nSamples = 1, nPeaks = 1;
		EReference reference = null;
		if (fr.getHighPeak() != null) {
			confidence = fr.getHighPeak().getCant().getDVal();
			frk = Constants.FAILREASONS.HIGH_PEAK;
			reference = AdeptnessPackage.Literals.REASON__HIGH_PEAK;
		} else if (fr.getHighTime() != null) {
			confidence = fr.getHighTime().getCant().getDVal();
			nSamples = Utils.getNSamples((int) fr.getHighTime().getTime().getDVal(),
					fr.getHighTime().getUnit().getTime());
			nPeaks = nSamples;
			frk = Constants.FAILREASONS.HIGH_TIME_OUT_BOUNDS;
			reference = AdeptnessPackage.Literals.REASON__HIGH_TIME;
		} else if (fr.getXPeaks() != null) {
			confidence = fr.getXPeaks().getCant().getDVal();
			nPeaks = (int) fr.getXPeaks().getNPeaks().getDVal();
			nSamples = Utils.getNSamples((int) fr.getXPeaks().getTime().getDVal(), fr.getXPeaks().getUnit().getTime());
			frk = Constants.FAILREASONS.X_PEAKS_XSECONDS;
			reference = AdeptnessPackage.Literals.REASON__XPEAKS;
		} else if (fr.getConstDeg() != null) {
			frk = Constants.FAILREASONS.CONSTANT_DEGRADATION;
			reference = AdeptnessPackage.Literals.REASON__CONST_DEG;
		}

		boolean failsError = false;
		// check structural errors.
		if (nSamples <= 0 || nPeaks <= 0) {
			error("Duration or number of peaks cannot be zero or lower.", reference);
			failsError = true;
		}
		if (pattern.equals(Constants.PATTERNS.NOTSAME_REFERENCE) && confidence != 0) {
			error("Confidence value must be zero within 'should not be' clauses or use a 'not in range' clause instead.",
					reference);
			failsError = true;
		}
		if ((frk.equals(Constants.FAILREASONS.HIGH_TIME_OUT_BOUNDS)
				|| frk.equals(Constants.FAILREASONS.X_PEAKS_XSECONDS)) && this.tpattern != null) {
			error("Temporary conditions are either set within the assertion or the failure statement, but not in both.",
					reference);
			failsError = true;
		}
		if (frk.equals(Constants.FAILREASONS.CONSTANT_DEGRADATION)) {
			if (this.precond == Constants.PRECONDS.WHEN || this.precond == Constants.PRECONDS.WHENAFTERWHEN) {
				error("Constant degradation only allows while preconditions or no preconditions at all.", reference);
				failsError = true;
			}
			if (this.tpattern != null) {
				error("Constant degradation does not allow temporary conditions.", reference);
				failsError = true;
			}
		}
		if (!failReasons.add(frk)) {
			error("Duplicated " + frk + " detection.", reference);
			failsError = true;
		}
		if (confidence < -1 || confidence > 0) {
			error("Confidence value must be between -1 and 0", reference);
			failsError = true;
		}

		if (monitoringVariables != null && monitoringVariables.getVariables().size() != 0 && !failsError
				&& !errorDetected)
			this.assesOracle(frk, confidence, nPeaks, nSamples, reference);

	}

	/**
	 * @author aarrieta
	 * @return false if there is risk that the oracle fails, true if there isn't
	 */
	private void assesOracle(Constants.FAILREASONS frk, double confidence, int nPeaks, int nSamples,
			EReference reference) {
		// get any given variables opData to
		Iterator<String> it = monitoringVariables.getVariables().keySet().iterator();
		String key = "";
		while (it.hasNext()) {
			key = it.next();
			if (monitoringVariables.getVariables().get(key).getOpData() != null) {
				break;
			}
		}
		if (key.equals(""))
			return;

		// get signal's max and min values. used on assessment, to recalculate reference
		// according to the confidence value
		findSignalsMaxMinValues();

		int aWDurCount = 0;
		int durCount = 0;
		int peakCount = 0;
		int savedTimestamp = 0;
		for (int timestamp = 0; timestamp < monitoringVariables.getVariables().get(key).getOpData()
				.size(); timestamp++) {
			// 1. check precondition. If a when precondition has been met previously, don't
			// check precondition.

			if (!whenPrecondMet) {
				// check if a precondition is met (true if no precondition has been set)
				if (checkPreconditionIsMet(timestamp)) {
					if (precond != null && (precond.equals(Constants.PRECONDS.WHEN)
							|| precond.equals(Constants.PRECONDS.WHENAFTERWHEN))) {
						whenPrecondMet = true;
						this.savedTimestamp = timestamp;
					}
				} else {
					if (precond.equals(Constants.PRECONDS.WHILE)) {
						durCount = 0;
						peakCount = 0;
						savedTimestamp = 0;
					}
					continue;
				}
			}

			// 2. continue until aWDuration has passed
			if (precond != null && precond.equals(Constants.PRECONDS.WHENAFTERWHEN)) {
				aWDurCount++;
				if (aWDurCount <= aWDuration) {
					continue;
				}
			}

			// 3. check if operational data is out of bounds according to the confidence
			// value of the current fail reason
			Boolean isOutOfBounds = false;
			isOutOfBounds = checkOperationalDataOutOfBounds(confidence, timestamp, reference);
			if (isOutOfBounds == null) {
//				System.out.println("Too high confidence value detected for " + frk
//						+ " fail reason, removed from failure detection according to operational data.");
				return;
			}
			switch (frk) {
			case HIGH_PEAK:
				if (tpattern == null && isOutOfBounds) {
//					System.out.println("HighPeak detected.");
					warning("There is operational data out of bounds.", reference);
					return;
				} else if (tpattern != null) {
					switch (tpattern) {
					case ATLEAST:
						if (durCount <= duration && isOutOfBounds) {
//							System.out
//									.println("Operational data out of bounds detected while a timing condition check.");
							warning("There is operational data out of bounds.", reference);
							return;
						}
						// checking time has expired, reset parameters
						if (timestamp == (this.savedTimestamp + aWDuration + duration)) {
							whenPrecondMet = false;
							timestamp = this.savedTimestamp;
							aWDurCount = 0;
							durCount = 0;
						} else {
							durCount++;
						}
						break;
					case ATMOST:
						if (durCount == 0 && isOutOfBounds) {
//							System.out.println(
//									"Operational data in between bounds detected after a timing condition check.");
							warning("There is operational data out of bounds.", reference);
							return;
						}
						if (timestamp == (this.savedTimestamp + aWDuration + duration + 1) && !isOutOfBounds) {
//							System.out.println(
//									"Operational data in between bounds detected after a timing condition check.");
							warning("There is operational data out of bounds.", reference);
							return;
						}

						if (timestamp > (this.savedTimestamp + aWDuration + duration)) {
							whenPrecondMet = false;
							timestamp = this.savedTimestamp;
							aWDurCount = 0;
							durCount = 0;
						} else {
							durCount++;
						}
						break;
					case EXACTLY:
						if (durCount <= duration && isOutOfBounds) {
//							System.out.println("Operational data out of bounds detected while timing condition check.");
							warning("There is operational data out of bounds.", reference);
							return;
						} else if (durCount > duration && !isOutOfBounds) {
//							System.out.println(
//									"Operational data in between bounds detected after a timing condition check.");
							warning("There is operational data out of bounds.", reference);
							return;
						}

						if (timestamp == (this.savedTimestamp + aWDuration + duration + 1)) {
							whenPrecondMet = false;
							timestamp = this.savedTimestamp;
							aWDurCount = 0;
							durCount = 0;
						} else {
							durCount++;
						}
						break;
					}

				}
				break;
			case HIGH_TIME_OUT_BOUNDS:
				if (isOutOfBounds) {
					peakCount++;
				} else {
					peakCount = 0;
				}
				if (peakCount >= nPeaks) {
//					System.out.println("High Time Out of Bounds detected (during " + nPeaks + " seconds).");
					warning("There is operational data out of bounds.", reference);
					return;
				}

				if (whenPrecondMet && (timestamp == (this.savedTimestamp + nSamples + aWDuration))) {
					whenPrecondMet = false;
					timestamp = this.savedTimestamp;
					aWDurCount = 0;
					peakCount = 0;
					durCount = 0;
				}

				// duration has ended: reset
				if (durCount == nSamples) {
					peakCount = 0;
					durCount = 0;
				}
				// duration hasn't ended and a peak was detected at some point (x_peaks_xseconds
				// or high_time_out_of_bounds)-> continue counting
				else if (peakCount > 0 || whenPrecondMet) {
					durCount++;
				}

				break;
			case X_PEAKS_XSECONDS:
				if (isOutOfBounds) {
					peakCount++;
				}
				if (savedTimestamp == 0) {
					savedTimestamp = timestamp;
				}
				if (peakCount >= nPeaks) {
//					System.out.println(nPeaks + " peaks detected during " + nSamples + " seconds.");
					warning("There is operational data out of bounds.", reference);
					return;
				}

				// previous check haven't detected a failure
				// if whenPrecondMet was set -> reset parameters. if x_peaks_xseconds or
				// high_time_out_of_bounds, continue checking until duration is reached.
				if (whenPrecondMet && (timestamp == (this.savedTimestamp + nSamples + aWDuration))) {
					whenPrecondMet = false;
					timestamp = this.savedTimestamp;
					aWDurCount = 0;
					peakCount = 0;
					durCount = 0;
				}

				// duration has ended: reset
				if (durCount == nSamples) {
					peakCount = 0;
					durCount = 0;
					// if there isn't any precondition to meet, and a peak was detected previously
					// -> reset timestamp. This way it will continue checking from the following
					// timestamp of the first peak detected
					if (this.precond == null && savedTimestamp != 0) {
						timestamp = savedTimestamp;
						savedTimestamp = 0;
					}
				}
				// duration hasn't ended and a peak was detected at some point (x_peaks_xseconds
				// or high_time_out_of_bounds)-> continue counting
				else if (peakCount > 0 || whenPrecondMet) {
					durCount++;
				}
				break;
			default:
			}
		}
	}

	private Boolean checkOperationalDataOutOfBounds(double confidence, int timestamp, EReference reference) {

		boolean outOfBounds = false;

		// Get signal's value in the current timestamp
		double signalVal = 0.0;
		if (this.oracle.getCheck().getEm() != null) {
			// signal is an expression
			// get current signal's value
			signalVal = (Double) evalExpression(
					getExpression("opData", this.oracle.getCheck().getEm().getElements(), timestamp));
		} else {
			// signal is a single variable
			signalVal = monitoringVariables.getVariables().get(this.oracle.getCheck().getName()).getOpData()
					.get(timestamp);
		}

		// Get reference bounds, recalculate according to the confidence value and
		// compare
		double lowerRefBound = 0.0;
		double upperRefBound = 0.0;
		switch (this.pattern) {
		case BELOW_REFERENCE:
			upperRefBound = getUpperRefBound(this.oracle.getCheck().getReference().getUpper().getBound_upp(),
					timestamp);
			// recalculate upperRefBound according to the confidence value
			upperRefBound = Utils.calcUpBound(confidence, signalMax, upperRefBound);

			outOfBounds = Utils.checkUpper(upperRefBound, signalVal);
			break;
		case ABOVE_REFERENCE:
			lowerRefBound = getLowerRefBound(this.oracle.getCheck().getReference().getLower().getBound_lower(),
					timestamp);
			// recalculate lowerRefBound according to the confidence value
			lowerRefBound = Utils.calcDownBound(confidence, signalMin, lowerRefBound);

			outOfBounds = Utils.checkLower(lowerRefBound, signalVal);
			break;
		case RANGE:
			upperRefBound = getUpperRefBound(this.oracle.getCheck().getReference().getRange().getBound_upp(),
					timestamp);
			upperRefBound = Utils.calcUpBound(confidence, signalMax, upperRefBound);

			lowerRefBound = getLowerRefBound(this.oracle.getCheck().getReference().getRange().getBound_lower(),
					timestamp);
			lowerRefBound = Utils.calcDownBound(confidence, signalMin, lowerRefBound);

			if (upperRefBound < lowerRefBound) {
				if (this.oracle.getCheck().getReference().getRange().getBound_upp().getValue() != null
						&& this.oracle.getCheck().getReference().getRange().getBound_lower().getValue() != null) {
					error("Confidence value too high.", reference);
				} else {
					warning("Confidence value too high according to operational data.", reference);
				}

				return null;
			}

			outOfBounds = Utils.checkNotInBetween(lowerRefBound, upperRefBound, signalVal);
			break;
		case GAP:
			upperRefBound = getUpperRefBound(this.oracle.getCheck().getReference().getGap().getBound_upp(), timestamp);
			upperRefBound = Utils.calcGapUpBound(confidence, signalMax, upperRefBound);

			lowerRefBound = getLowerRefBound(this.oracle.getCheck().getReference().getGap().getBound_lower(),
					timestamp);
			lowerRefBound = Utils.calcGapDownBound(confidence, signalMin, lowerRefBound);

			if (upperRefBound < lowerRefBound) {
				if (this.oracle.getCheck().getReference().getGap().getBound_upp().getValue() != null
						&& this.oracle.getCheck().getReference().getGap().getBound_lower().getValue() != null) {
					error("Confidence value is too high.", reference);
				} else {
					warning("Confidence value might be too high according to operational data.", reference);
				}
				return null;
			}

			outOfBounds = Utils.checkInBetween(lowerRefBound, upperRefBound, signalVal);
			break;
		case SAME_REFERENCE:
			upperRefBound = getUpperRefBound(this.oracle.getCheck().getReference().getSame().getBound_upp(), timestamp);
			upperRefBound = Utils.calcUpBound(confidence, signalMax, upperRefBound);
			lowerRefBound = Utils.calcDownBound(confidence, signalMin, upperRefBound);

			if (upperRefBound < lowerRefBound) {
				if (this.oracle.getCheck().getReference().getSame().getBound_upp().getValue() != null) {
					error("Confidence value too high.", reference);
				} else {
					warning("Confidence value might be too high according to operational data.", reference);
				}
				return null;
			}
			outOfBounds = Utils.checkNotInBetween(lowerRefBound, upperRefBound, signalVal);
			break;
		case NOTSAME_REFERENCE:
			upperRefBound = getUpperRefBound(this.oracle.getCheck().getReference().getNotsame().getBound_upp(),
					timestamp);

			outOfBounds = Utils.checkEqual(upperRefBound, signalVal);
			break;
		}

//		if (timestamp == 0) {
//			System.out.println("Checking if signal is " + pattern + " [" + lowerRefBound + "," + upperRefBound + "]");
//		}
//
//		if (outOfBounds) {
//			System.out.println("  signal at " + timestamp + ":" + signalVal + " is out of bounds for reference ["
//					+ lowerRefBound + "," + upperRefBound + "]");
//		}
		return outOfBounds;
	}

	private double getLowerRefBound(Bound_Down down, int timestamp) {
		double lowerRefBound = 0.0;
		if (down.getValue() != null) {
			lowerRefBound = down.getValue().getDVal();
		} else {
			lowerRefBound = (double) evalExpression(getExpression("opData", down.getEm().getElements(), timestamp));
		}

		return lowerRefBound;
	}

	private double getUpperRefBound(Bound_up up, int timestamp) {
		double upperRefBound = 0.0;
		if (up.getValue() != null) {
			upperRefBound = up.getValue().getDVal();
		} else {
			upperRefBound = (double) evalExpression(getExpression("opData", up.getEm().getElements(), timestamp));
		}

		return upperRefBound;
	}

	private List<Double> getMaxMinValueCombinations(EList<AbstractElement2> elements) {
		String expressionWithVars = getExpression("withVars", elements);
		List<String> varNames = diffVarNames(expressionWithVars);
		List<String> exprCombs = new ArrayList<String>();
		List<Double> maxMinValueCombs = new ArrayList<Double>();

		exprCombs = generateCombinations(0, expressionWithVars, varNames, exprCombs);
		for (String expression : exprCombs) {
			maxMinValueCombs.add((Double) evalExpression(expression));
		}
		return maxMinValueCombs;
	}

	private List<String> generateCombinations(int index, String expression, List<String> varNames,
			final List<String> exprCombs) {
		List<String> exC = new ArrayList<String>(exprCombs);

		String replaceVarMin = replaceVar(expression, varNames.get(index),
				monitoringVariables.getVariables().get(varNames.get(index)).getMin());
		String replaceVarMax = replaceVar(expression, varNames.get(index),
				monitoringVariables.getVariables().get(varNames.get(index)).getMax());

		if (index == varNames.size() - 1) {
			exC.add(replaceVarMin);
			exC.add(replaceVarMax);
		} else {
			List<String> minCombs = generateCombinations(index + 1, replaceVarMin, varNames, exprCombs);
			List<String> maxCombs = generateCombinations(index + 1, replaceVarMax, varNames, exprCombs);
			exC.addAll(minCombs);
			exC.addAll(maxCombs);
		}
		return exC;
	}

	private List<String> diffVarNames(String expression) {
		List<String> varNames = new ArrayList<String>();
		Pattern pattern = Pattern.compile("@@([^@]*)@@");
		Matcher matcher = pattern.matcher(expression);
		while (matcher.find()) {
			if (!varNames.stream().anyMatch(matcher.group(1)::equals)) {
				varNames.add(matcher.group(1));
			}
		}

		return varNames;
	}

	private boolean checkPreconditionIsMet(int timestamp) {
		boolean isMet = false;
		if (precond == null)
			return !isMet;

		EList<AbstractElement2> elements = null;
		switch (precond) {
		case WHEN:
		case WHENAFTERWHEN:
			elements = this.oracle.getWhen().getEm().getElements();
			break;
		case WHILE:
			elements = this.oracle.getWhile().getEm().getElements();
			break;
		}
		String expression = getExpression("opData", elements, timestamp);

		isMet = (Boolean) evalExpression(expression);
//		if (isMet) {
//			System.out.println("Precondition met (" + expression + ") at timestamp: " + timestamp);
//		}
		return isMet;
	}

	private String getExpression(String type, EList<AbstractElement2> elements) {
		return getExpression(type, elements, 0);
	}

	private String getExpression(String type, EList<AbstractElement2> elements, int timestamp) {
		String expression = "";
		for (AbstractElement2 element : elements) {
			for (String parenthesis : element.getFrontParentheses()) {
				expression += parenthesis;
			}
			if (element.getName() != null) {
				switch (type) {
				case "basic":
					expression += "1.0";
					break;
				case "opData":
					double value = monitoringVariables.getVariables().get(element.getName()).getOpData().get(timestamp);
					expression += (value < 0 ? "(" : "") + Double.toString(value) + (value < 0 ? ")" : "");
					break;
				case "withVars":
					expression += "@@" + element.getName() + "@@";
					break;
				}
			}
			if (element.getValue() != null) {
				expression += String.valueOf(element.getValue().getDVal());
			}
			if (element.getOp() != null) {
				for (Operators op : element.getOp()) {
					if (op.getOperator() != null) {
						expression += op.getOperator().getOp().toString();
					} else if (op.getComparation() != null) {
						expression += op.getComparation().getOp().toString();
					} else if (op.getLogicOperator() != null) {
						expression += op.getLogicOperator().getOp().toString();
					} else if (op.getBackParentheses() != null) {
						expression += op.getBackParentheses();
					}
				}
			}
		}
		return expression;
	}

	private String replaceVar(String expression, String varName, double value) {
		return expression.replace("@@" + varName + "@@",
				(value < 0 ? "(" : "") + Double.toString(value) + (value < 0 ? ")" : ""));
	}

	private Object evalExpression(String expression) {
		GraalJSScriptEngine engine = new GraalJSEngineFactory().getScriptEngine();
		try {
			Object obj = engine.eval(expression);
			if (obj != null && obj.getClass() == Integer.class) {
				return (double) ((int) obj);
			}
			return obj;
		} catch (ScriptException e) {
			e.printStackTrace();
			return null;
		}
	}

	private int getDurationInSeconds(double duration, String timeUnit) {
		switch (timeUnit) {
		case "milliseconds":
			return (int) duration * 1000;
		case "minutes":
			return (int) duration * 60;
		case "hours":
			return (int) duration * 60 * 60;
		default: // seconds
			return (int) duration;
		}
	}

	private void findSignalsMaxMinValues() {
		HashMap<String, MonitoringVar> morVarList = monitoringVariables.getVariables();
		if (this.oracle.getCheck().getEm() != null) {
			// get signal's variable's max and min value combinations
			List<Double> maxMinValueCombinations = getMaxMinValueCombinations(
					this.oracle.getCheck().getEm().getElements());
			// get signal's max and min possible values
			signalMax = Collections.max(maxMinValueCombinations);
			signalMin = Collections.min(maxMinValueCombinations);
		} else {
			// signal is a single variable
			signalMax = morVarList.get(this.oracle.getCheck().getName()).getMax();
			signalMin = morVarList.get(this.oracle.getCheck().getName()).getMin();
		}
	}

	private void resetParameters() {
		oracle = null;
		precond = null;
		whenPrecondMet = false;
		savedTimestamp = 0;
		aWDuration = 0;
		pattern = null;
		tpattern = null;
		duration = 0;
		signalMax = 0.0;
		signalMin = 0.0;
		failReasons = new HashSet<Constants.FAILREASONS>();
		errorDetected = false;
	}

	// Avoids duplicated calls to @Check functions.
	@Override
	public void register(EValidatorRegistrar registrar) {
	}
}
