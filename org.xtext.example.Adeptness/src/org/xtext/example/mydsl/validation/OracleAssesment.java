package org.xtext.example.mydsl.validation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Collections;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.adeptness.AbstractElement2;
import org.xtext.example.mydsl.adeptness.AdeptnessPackage;
import org.xtext.example.mydsl.adeptness.At_least;
import org.xtext.example.mydsl.adeptness.At_most;
import org.xtext.example.mydsl.adeptness.Bound_Down;
import org.xtext.example.mydsl.adeptness.Bound_up;
import org.xtext.example.mydsl.adeptness.Exactly;
import org.xtext.example.mydsl.adeptness.FailReason;
import org.xtext.example.mydsl.adeptness.Operators;
import org.xtext.example.mydsl.adeptness.Oracle;
import org.xtext.example.mydsl.adeptness.Reference;
import org.xtext.example.mydsl.adeptness.Signal;

public class OracleAssesment extends AbstractAdeptnessValidator {

	MonitoringVariables monitoringVariables;

	@Check
	public void init(Signal CPS) {
		monitoringVariables = MonitoringVariables.getInstance(CPS.getName());
	}

	private Oracle oracle;
	private Constants.PRECONDS precond;
	private boolean whenPrecondMet = false;
	private int savedTimestamp = 0;
	private int aWDuration = 0;

	private Constants.PATTERNS pattern;
	private Constants.TIMING_PATTERNS tpattern;
	private int duration;

	private double signalMax;
	private double signalMin;

	private Map<Constants.FAILREASONS, FailReasonValues> failReasons = new HashMap<Constants.FAILREASONS, FailReasonValues>();

	@Check
	public void checkOracleWithOperationData(Oracle oracle) {
		if (monitoringVariables == null || monitoringVariables.getVariables().size() == 0)
			return;
		resetParameters();
		this.oracle = oracle;
		this.findPrecond();
		this.findOraclePattern();
		this.findOracleFailReason();
		this.assesOracle();
	}

	/**
	 * @author aarrieta
	 * @return false if there is risk that the oracle fails, true if there isn't
	 */
	private void assesOracle() {
		// TODO check if all names in the oracle expressions are in the
		// monitoringVariableList

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
						savedTimestamp = timestamp;
					}
				} else {
					if (precond.equals(Constants.PRECONDS.WHILE)) {
						resetAllCounters();
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

			// 4. check foreach fail reason if operational data is out of bounds according
			// to the confidence value
			Iterator<Constants.FAILREASONS> failReasonsIt = failReasons.keySet().iterator();
			Constants.FAILREASONS frk;
			Boolean isOutOfBounds = false;
			while (failReasonsIt.hasNext()) {
				frk = (Constants.FAILREASONS) failReasonsIt.next();
				isOutOfBounds = checkOperationalDataOutOfBounds(failReasons.get(frk).confidence, timestamp);
				if (isOutOfBounds == null) {
					System.out.println("Too high confidence value detected for " + frk
							+ " fail reason, removed from failure detection according to operational data.");
					failReasons.remove(frk);
					continue;
				}

				switch (frk) {
				case HIGH_PEAK:
					if (tpattern == null && isOutOfBounds) {
						System.out.println("HighPeak detected.");
						warning("There is operational data out of bounds.", AdeptnessPackage.Literals.ORACLE__CHECK);
						return;
					} else if (tpattern != null) {
						switch (tpattern) {
						case ATLEAST:
							if (failReasons.get(frk).durCount <= duration && isOutOfBounds) {
								System.out.println(
										"Operational data out of bounds detected while a timing condition check.");
								warning("There is operational data out of bounds.",
										AdeptnessPackage.Literals.ORACLE__CHECK);
								return;
							}
							// checking time has expired, reset parameters
							if (timestamp == (savedTimestamp + aWDuration + duration)) {
								whenPrecondMet = false;
								timestamp = savedTimestamp;
								aWDurCount = 0;
								failReasons.get(frk).durCount = 0;
							} else {
								failReasons.get(frk).durCount++;
							}
							break;
						case ATMOST:
							if (failReasons.get(frk).durCount == 0 && isOutOfBounds) {
								System.out.println(
										"Operational data in between bounds detected after a timing condition check.");
								warning("There is operational data out of bounds.",
										AdeptnessPackage.Literals.ORACLE__CHECK);
								return;
							}
							if (timestamp == (savedTimestamp + aWDuration + duration + 1) && !isOutOfBounds) {
								System.out.println(
										"Operational data in between bounds detected after a timing condition check.");
								warning("There is operational data out of bounds.",
										AdeptnessPackage.Literals.ORACLE__CHECK);
								return;
							}

							if (timestamp > (savedTimestamp + aWDuration + duration)) {
								whenPrecondMet = false;
								timestamp = savedTimestamp;
								aWDurCount = 0;
								failReasons.get(frk).durCount = 0;
							} else {
								failReasons.get(frk).durCount++;
							}
							break;
						case EXACTLY:
							if (failReasons.get(frk).durCount <= duration && isOutOfBounds) {
								System.out.println(
										"Operational data out of bounds detected while timing condition check.");
								warning("There is operational data out of bounds.",
										AdeptnessPackage.Literals.ORACLE__CHECK);
								return;
							} else if (failReasons.get(frk).durCount > duration && !isOutOfBounds) {
								System.out.println(
										"Operational data in between bounds detected after a timing condition check.");
								warning("There is operational data out of bounds.",
										AdeptnessPackage.Literals.ORACLE__CHECK);
								return;
							}

							if (timestamp == (savedTimestamp + aWDuration + duration + 1)) {
								whenPrecondMet = false;
								timestamp = savedTimestamp;
								aWDurCount = 0;
								failReasons.get(frk).durCount = 0;
							} else {
								failReasons.get(frk).durCount++;
							}
							break;
						}

					}
					break;
				case HIGH_TIME_OUT_BOUNDS:
					if (isOutOfBounds) {
						failReasons.get(frk).peakCount++;
					}
					if (failReasons.get(frk).peakCount >= failReasons.get(frk).nPeaks) {
						System.out.println("High Time Out of Bounds detected (during " + failReasons.get(frk).nPeaks
								+ " seconds).");
						warning("There is operational data out of bounds.", AdeptnessPackage.Literals.ORACLE__CHECK);
						return;
					}

					if (whenPrecondMet
							&& (timestamp == (savedTimestamp + failReasons.get(frk).nSamples + aWDuration))) {
						whenPrecondMet = false;
						timestamp = savedTimestamp;
						aWDurCount = 0;
						failReasons.get(frk).peakCount = 0;
						failReasons.get(frk).durCount = 0;
					}

					// duration has ended: reset
					if (failReasons.get(frk).durCount == failReasons.get(frk).nSamples) {
						failReasons.get(frk).peakCount = 0;
						failReasons.get(frk).durCount = 0;
					}
					// duration hasn't ended and a peak was detected at some point (x_peaks_xseconds
					// or high_time_out_of_bounds)-> continue counting
					else if (failReasons.get(frk).peakCount > 0 || whenPrecondMet) {
						failReasons.get(frk).durCount++;
					}

					break;
				case X_PEAKS_XSECONDS:
					if (isOutOfBounds) {
						failReasons.get(frk).peakCount++;
					}
					if (failReasons.get(frk).savedTimestamp == 0) {
						failReasons.get(frk).savedTimestamp = timestamp;
					}
					if (failReasons.get(frk).peakCount >= failReasons.get(frk).nPeaks) {
						System.out.println(failReasons.get(frk).nPeaks + " peaks detected during "
								+ failReasons.get(frk).nSamples + " seconds.");
						warning("There is operational data out of bounds.", AdeptnessPackage.Literals.ORACLE__CHECK);
						return;
					}

					// previous check haven't detected a failure
					// if whenPrecondMet was set -> reset parameters. if x_peaks_xseconds or
					// high_time_out_of_bounds, continue checking until duration is reached.
					if (whenPrecondMet
							&& (timestamp == (savedTimestamp + failReasons.get(frk).nSamples + aWDuration))) {
						whenPrecondMet = false;
						timestamp = savedTimestamp;
						aWDurCount = 0;
						failReasons.get(frk).peakCount = 0;
						failReasons.get(frk).durCount = 0;
					}

					// duration has ended: reset
					if (failReasons.get(frk).durCount == failReasons.get(frk).nSamples) {
						failReasons.get(frk).peakCount = 0;
						failReasons.get(frk).durCount = 0;
						// if there isn't any precondition to meet, and a peak was detected previously
						// -> reset timestamp. This way it will continue checking from the following
						// timestamp of the first peak detected
						if (this.precond == null && failReasons.get(frk).savedTimestamp != 0) {
							timestamp = failReasons.get(frk).savedTimestamp;
							failReasons.get(frk).savedTimestamp = 0;
						}
					}
					// duration hasn't ended and a peak was detected at some point (x_peaks_xseconds
					// or high_time_out_of_bounds)-> continue counting
					else if (failReasons.get(frk).peakCount > 0 || whenPrecondMet) {
						failReasons.get(frk).durCount++;
					}
					break;
				default:
				}

			}
		}
	}

	private void resetAllCounters() {
		Iterator<Constants.FAILREASONS> failReasonsIt = failReasons.keySet().iterator();
		Constants.FAILREASONS frk;
		while (failReasonsIt.hasNext()) {
			frk = (Constants.FAILREASONS) failReasonsIt.next();
			failReasons.get(frk).durCount = 0;
			failReasons.get(frk).peakCount = 0;
			failReasons.get(frk).savedTimestamp = 0;
		}
	}

	private Boolean checkOperationalDataOutOfBounds(double confidence, int timestamp) {

		boolean outOfBounds = false;

		// Get signal's value in the current timestamp
		double signalVal = 0.0;
		if (this.oracle.getCheck().getEm() != null) {
			// signal is an expression
			// get current signal's value
			signalVal = (Double) evalExpression(getExpression(this.oracle.getCheck().getEm().getElements(), timestamp));
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
					error("Confidence value too high.", AdeptnessPackage.Literals.ORACLE__CHECK);
				} else {
					warning("Confidence value too high according to operational data.",
							AdeptnessPackage.Literals.ORACLE__CHECK);
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
					error("Confidence value is too high.", AdeptnessPackage.Literals.ORACLE__CHECK);
				} else {
					warning("Confidence value might be too high according to operational data.",
							AdeptnessPackage.Literals.ORACLE__CHECK);
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
					error("Confidence value too high.", AdeptnessPackage.Literals.ORACLE__CHECK);
				} else {
					warning("Confidence value might be too high according to operational data.",
							AdeptnessPackage.Literals.ORACLE__CHECK);
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

		if (timestamp == 0) {
			System.out.println("Checking if signal is " + pattern + " [" + lowerRefBound + "," + upperRefBound + "]");
		}

		if (outOfBounds) {
			System.out.println("  signal at " + timestamp + ":" + signalVal + " is out of bounds for reference ["
					+ lowerRefBound + "," + upperRefBound + "]");
		}
		return outOfBounds;
	}

	private double getLowerRefBound(Bound_Down down, int timestamp) {
		double lowerRefBound = 0.0;
		if (down.getValue() != null) {
			lowerRefBound = down.getValue().getDVal();
		} else {
			lowerRefBound = (double) evalExpression(getExpression(down.getEm().getElements(), timestamp));
		}

		return lowerRefBound;
	}

	private double getUpperRefBound(Bound_up up, int timestamp) {
		double upperRefBound = 0.0;
		if (up.getValue() != null) {
			upperRefBound = up.getValue().getDVal();
		} else {
			upperRefBound = (double) evalExpression(getExpression(up.getEm().getElements(), timestamp));
		}

		return upperRefBound;
	}

	private List<Double> getMaxMinValueCombinations(EList<AbstractElement2> elements) {
		String expressionWithVars = getExpressionWithVars(elements);
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
				Double.toString(monitoringVariables.getVariables().get(varNames.get(index)).getMin()));
		String replaceVarMax = replaceVar(expression, varNames.get(index),
				Double.toString(monitoringVariables.getVariables().get(varNames.get(index)).getMax()));
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
		String expression = getExpression(elements, timestamp);

		isMet = (Boolean) evalExpression(expression);
		if (isMet) {
			System.out.println("Precondition met (" + expression + ") at timestamp: " + timestamp);
		}
		return isMet;
	}

	private String getExpressionWithVars(EList<AbstractElement2> elements) {
		String expression = "";
		for (AbstractElement2 element : elements) {
			if (element.getFrontParentheses().size() > 0) {
				expression += "(";
			}
			if (element.getName() != null) {
				expression += "@@" + element.getName() + "@@";
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

	private String replaceVar(String expression, String varName, String value) {
		return expression.replace("@@" + varName + "@@", value);
	}

	private String getExpression(EList<AbstractElement2> elements, int timestamp) {
		String expression = "";
		for (AbstractElement2 element : elements) {
			if (element.getFrontParentheses().size() > 0) {
				expression += "(";
			}
			if (element.getName() != null) {
				expression += monitoringVariables.getVariables().get(element.getName()).getOpData().get(timestamp)
						.toString();
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

	private Object evalExpression(String expression) {
		ScriptEngine engine = new ScriptEngineManager(null).getEngineByName("JavaScript");
		try {
			return engine.eval(expression);
		} catch (ScriptException e) {
			e.printStackTrace();
			return null;
		}
	}

	private void findPrecond() {
		if (this.oracle.getWhen() != null) {
			if (this.oracle.getWhen().getAw() != null) {
				this.precond = Constants.PRECONDS.WHENAFTERWHEN;
				double dur = this.oracle.getWhen().getAw().getWait().getTime().getDVal();
				aWDuration = getDurationInSeconds(dur, this.oracle.getWhen().getAw().getWait().getUnit().getTime());

			} else {
				this.precond = Constants.PRECONDS.WHEN;
			}
		} else if (this.oracle.getWhile() != null) {
			this.precond = Constants.PRECONDS.WHILE;
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

	private void findOraclePattern() {
		Reference reference = this.oracle.getCheck().getReference();
		At_least atLeast = null;
		At_most atMost = null;
		Exactly exactly = null;
		if (this.oracle.getCheck().getReference().getLower() != null) {
			this.pattern = Constants.PATTERNS.ABOVE_REFERENCE;
			atLeast = reference.getLower().getAtleast();
			atMost = reference.getLower().getAtmost();
			exactly = reference.getLower().getExactly();
		} else if (this.oracle.getCheck().getReference().getUpper() != null) {
			this.pattern = Constants.PATTERNS.BELOW_REFERENCE;
			atLeast = reference.getUpper().getAtleast();
			atMost = reference.getUpper().getAtmost();
			exactly = reference.getUpper().getExactly();
		} else if (this.oracle.getCheck().getReference().getGap() != null) {
			this.pattern = Constants.PATTERNS.GAP;
			atLeast = reference.getGap().getAtleast();
			atMost = reference.getGap().getAtmost();
			exactly = reference.getGap().getExactly();
		} else if (this.oracle.getCheck().getReference().getRange() != null) {
			this.pattern = Constants.PATTERNS.RANGE;
			atLeast = reference.getRange().getAtleast();
			atMost = reference.getRange().getAtmost();
			exactly = reference.getRange().getExactly();
		} else if (this.oracle.getCheck().getReference().getSame() != null) {
			this.pattern = Constants.PATTERNS.SAME_REFERENCE;
			atLeast = reference.getSame().getAtleast();
			atMost = reference.getSame().getAtmost();
			exactly = reference.getSame().getExactly();
		} else if (this.oracle.getCheck().getReference().getNotsame() != null) {
			this.pattern = Constants.PATTERNS.NOTSAME_REFERENCE;
			atLeast = reference.getNotsame().getAtleast();
			atMost = reference.getNotsame().getAtmost();
			exactly = reference.getNotsame().getExactly();
		}

		Double dur = null;
		String timeUnit = null;
		if (atLeast != null) {
			this.tpattern = Constants.TIMING_PATTERNS.ATLEAST;
			dur = atLeast.getTime() != null ? atLeast.getTime().getDVal() : null;
			timeUnit = atLeast.getUnit() != null ? atLeast.getUnit().toString() : null;
		} else if (atMost != null) {
			this.tpattern = Constants.TIMING_PATTERNS.ATMOST;
			dur = atMost.getTime() != null ? atMost.getTime().getDVal() : null;
			timeUnit = atMost.getUnit() != null ? atMost.getUnit().toString() : null;
		} else if (exactly != null) {
			this.tpattern = Constants.TIMING_PATTERNS.EXACTLY;
			dur = exactly.getTime() != null ? exactly.getTime().getDVal() : null;
			timeUnit = exactly.getUnit() != null ? exactly.getUnit().toString() : null;
		}

		if (dur != null && timeUnit != null) {
			duration = getDurationInSeconds(dur, timeUnit);
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

	private void findOracleFailReason() {
		int nSamples, nPeaks;
		Double confidence;
		Constants.FAILREASONS frk = null;
		// confidence, nSamples, nPeaks
		for (FailReason fr : this.oracle.getCheck().getFailReason()) {
			nSamples = 1;
			nPeaks = 1;
			confidence = 0.0;
			if (fr.getReason().getHighPeak() != null) {
				confidence = fr.getReason().getHighPeak().getCant().getDVal();
				frk = Constants.FAILREASONS.HIGH_PEAK;
			} else if (fr.getReason().getHighTime() != null) {
				confidence = fr.getReason().getHighTime().getCant().getDVal();
				nSamples = Utils.getNSamples((int) fr.getReason().getHighTime().getTime().getDVal(),
						fr.getReason().getHighTime().getUnit().getTime());
				nPeaks = nSamples;
				frk = Constants.FAILREASONS.HIGH_TIME_OUT_BOUNDS;
			} else if (fr.getReason().getXPeaks() != null) {
				confidence = fr.getReason().getXPeaks().getCant().getDVal();
				nPeaks = (int) fr.getReason().getXPeaks().getNPeaks().getDVal();
				nSamples = Utils.getNSamples((int) fr.getReason().getXPeaks().getTime().getDVal(),
						fr.getReason().getXPeaks().getUnit().getTime());

				frk = Constants.FAILREASONS.X_PEAKS_XSECONDS;
			}

			// check structural errors. If an error is detected, fails if is not added to
			// failReasons map.
			if (nSamples == 0 || nPeaks == 0) {
				error("Duration or number of peaks cannot be zero.", AdeptnessPackage.Literals.CHECKS__FAIL_REASON);
				continue;
			}
			if (pattern.equals(Constants.PATTERNS.NOTSAME_REFERENCE) && confidence != 0) {
				error("Confidence value must be zero within 'should not be' clauses or use a 'not in range' clause instead.",
						AdeptnessPackage.Literals.CHECKS__FAIL_REASON);
				continue;
			}

			if (!frk.equals(Constants.FAILREASONS.HIGH_PEAK) && this.tpattern != null) {
				error("Temporary conditions are either set within the assertion or the failure statement, but not in both.",
						AdeptnessPackage.Literals.ORACLE__CHECK);
				continue;
			}

			if (this.tpattern != null && this.precond == null) {
				error("Temporary conditions within assertions should only be used in conjuction with \"while\" or \"when\" preconditions.",
						AdeptnessPackage.Literals.ORACLE__CHECK);
				continue;
			}

			// add fail reason to be checked
			failReasons.put(frk, new FailReasonValues(confidence, nPeaks, nSamples));
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
		failReasons = new HashMap<Constants.FAILREASONS, FailReasonValues>();
	}

}
