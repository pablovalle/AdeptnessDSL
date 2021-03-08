package org.xtext.example.mydsl.validation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.adeptness.AbstractElement2;
import org.xtext.example.mydsl.adeptness.At_least;
import org.xtext.example.mydsl.adeptness.At_most;
import org.xtext.example.mydsl.adeptness.Bound_Down;
import org.xtext.example.mydsl.adeptness.Bound_up;
import org.xtext.example.mydsl.adeptness.Exactly;
import org.xtext.example.mydsl.adeptness.FailReason;
import org.xtext.example.mydsl.adeptness.Operators;
import org.xtext.example.mydsl.adeptness.Oracle;
import org.xtext.example.mydsl.adeptness.Reference;

public class OracleAssesment {
	enum PRECONDS {
		WHEN, WHILE, WHENAFTERWHEN
	}

	enum PATTERNS {
		BELOW_REFERENCE, ABOVE_REFERENCE, GAP, RANGE, SAME_REFERENCE, NOTSAME_REFERENCE
	};

	enum TIMING_PATTERNS {
		EXACTLY, ATMOST, ATLEAST
	}

	enum FAILREASONS {
		HIGH_PEAK, HIGH_TIME_OUT_BOUNDS, CONSTANT_DEGRADATION, X_PEAKS_XSECONDS
	}

	enum STATUS {
		PRECOND_CHECK, AFTER_WHEN,
	}

	class FailReasonValues {
		Double confidence;
		int nPeaks;
		int nSamples;
		int peakCount = 0;
		int durCount = 0;
		int savedTimestamp = 0;

		public FailReasonValues(Double conf, int nP, int nS) {
			this.confidence = conf;
			this.nPeaks = nP;
			this.nSamples = nS;
		}
	}

	Oracle oracle;
	PRECONDS precond;
	boolean whenPrecondMet = false;
	int savedTimestamp = 0;
	int aWDuration = 0;

	PATTERNS pattern;
	TIMING_PATTERNS tpattern;
	Double duration;
	String timeUnit;

	double signalMax;
	double signalMin;

	Map<FAILREASONS, FailReasonValues> failReasons = new HashMap<FAILREASONS, FailReasonValues>();

	/**
	 * Constructor
	 * 
	 * @param or
	 */
	public OracleAssesment(Oracle or) {
		this.oracle = or;
		findPrecond();
		findOraclePattern();
		findOracleFailReason();
	}

	public String getVariableName() {
		return this.oracle.getCheck().getName().toString();
	}

	/**
	 * @author aarrieta
	 * @return false if there is risk that the oracle fails, true if there isn't
	 */
	public boolean assesOracle(HashMap<String, MonitoringVariables> monitoringVariableList) {
		// TODO check if all names in the oracle expressions are in the
		// monitoringVariableList

		// get any given variables opData to
		Iterator<String> it = monitoringVariableList.keySet().iterator();
		String key = "";
		while (it.hasNext()) {
			key = it.next();
			if (monitoringVariableList.get(key).getOpData() != null) {
				break;
			}
		}
		if (key.equals(""))
			return true;

		// get signal's max and min values
		// used on assessment, to recalculate reference according to the confidence
		// value
		findSignalsMaxMinValues(monitoringVariableList);

		int aWDurCount = 0;
		for (int timestamp = 0; timestamp < monitoringVariableList.get(key).getOpData().size(); timestamp++) {
			// whenPrecondMet are true only when a when precondition has been met previously
			// and will remain true while operational data is checked to detect failures
			if (!whenPrecondMet) {
				// check precondition is met
				// returns true if no precondition is set.
				if (!checkPreconditionIsMet(timestamp, monitoringVariableList)) {
					if (precond.equals(PRECONDS.WHILE)) {
						resetAllCounters();
					}
					continue;
				}
			}

			// after when
			aWDurCount++;
			if (aWDurCount <= aWDuration) {
				continue;
			}

			// TODO atleast, atmost or exactly conditions shouldn't go inside failreason,
			// but just the other way round

			// check, foreach fail reason, if operational data is out of bounds according to
			// the confidence value
			Iterator<FAILREASONS> failReasonsIt = failReasons.keySet().iterator();
			FAILREASONS frk;
			while (failReasonsIt.hasNext()) {
				frk = (FAILREASONS) failReasonsIt.next();
				if (checkOperationalDataOutOfBounds(failReasons.get(frk).confidence, timestamp,
						monitoringVariableList)) {
					switch (frk) {
					case HIGH_PEAK:
						System.out.println("HighPeak detected.");
						return false;
					case HIGH_TIME_OUT_BOUNDS:
						failReasons.get(frk).peakCount++;
						if (failReasons.get(frk).peakCount >= failReasons.get(frk).nPeaks) {
							System.out.println("High Time Out of Bounds detected (during " + failReasons.get(frk).nPeaks
									+ " seconds).");
							return false;
						}
						break;
					case X_PEAKS_XSECONDS:
						failReasons.get(frk).peakCount++;
						if (failReasons.get(frk).savedTimestamp == 0) {
							failReasons.get(frk).savedTimestamp = timestamp;
						}
						if (failReasons.get(frk).peakCount >= failReasons.get(frk).nPeaks) {
							System.out.println(failReasons.get(frk).nPeaks + " peaks detected during "
									+ failReasons.get(frk).nSamples + " seconds.");
							return false;
						}
						break;
					default:
					}
				}

				// check haven't detected a failure, if precondMet was set -> reset parameters.
				// if x_peaks_xseconds, continue checking until duration is reached.
				if (whenPrecondMet && (frk == FAILREASONS.HIGH_PEAK
						|| (frk == FAILREASONS.HIGH_TIME_OUT_BOUNDS || frk == FAILREASONS.X_PEAKS_XSECONDS)
								&& (timestamp == (savedTimestamp + failReasons.get(frk).nSamples + aWDuration)))) {
					// reset
					whenPrecondMet = false;
					timestamp = savedTimestamp;
					aWDurCount = 0;
					failReasons.get(frk).peakCount = 0;
					failReasons.get(frk).durCount = 0;
				}

				// no error has been detected and duration has ended: reset
				if (failReasons.get(frk).durCount == failReasons.get(frk).nSamples) {
					failReasons.get(frk).peakCount = 0;
					failReasons.get(frk).durCount = 0;
					// if there isn't any precondition to meet, and currently checking a
					// x_peaks_xseconds failreason and a peak was detected previously -> reset
					// timestamp. This way it will continue checking from the following timestamp of
					// the first peak detected
					if (this.precond == null && frk == FAILREASONS.X_PEAKS_XSECONDS
							&& failReasons.get(frk).savedTimestamp != 0) {
						timestamp = failReasons.get(frk).savedTimestamp;
						failReasons.get(frk).savedTimestamp = 0;
					}
				}
				// no error was detected and duration hasn't ended and a peak was detected
				// at some point -> continue counting
				else if (failReasons.get(frk).peakCount > 0 || whenPrecondMet) {
					failReasons.get(frk).durCount++;
				}

			}
			// TODO check atleast | atmost | exactly conditions

		}

		return true;
	}

	private void resetAllCounters() {
		Iterator<FAILREASONS> failReasonsIt = failReasons.keySet().iterator();
		FAILREASONS frk;
		while (failReasonsIt.hasNext()) {
			frk = (FAILREASONS) failReasonsIt.next();
			failReasons.get(frk).durCount = 0;
			failReasons.get(frk).peakCount = 0;
			failReasons.get(frk).savedTimestamp = 0;
		}
	}

	public boolean checkOperationalDataOutOfBounds(double confidence, int timestamp,
			HashMap<String, MonitoringVariables> monitoringVariableList) {

		boolean outOfBounds = false;

		// Get signal's value in the current timestamp
		double signalVal = 0.0;
		if (this.oracle.getCheck().getEm() != null) {
			// signal is an expression
			// get current signal's value
			signalVal = (Double) evalExpression(
					getExpression(this.oracle.getCheck().getEm().getElements(), timestamp, monitoringVariableList));
		} else {
			// signal is a single variable
			signalVal = monitoringVariableList.get(this.oracle.getCheck().getName()).getOpData().get(timestamp);
		}

		// Get reference bounds, recalculate according to the confidence value and
		// compare
		double lowerRefBound = 0.0;
		double upperRefBound = 0.0;
		switch (this.pattern) {
		case BELOW_REFERENCE:
			upperRefBound = getUpperRefBound(this.oracle.getCheck().getReference().getUpper().getBound_upp(), timestamp,
					monitoringVariableList);
			// recalculate upperRefBound according to the confidence value
			upperRefBound = Utils.calcUpBound(confidence, signalMax, upperRefBound);

			outOfBounds = Utils.checkUpper(upperRefBound, signalVal);
			break;
		case ABOVE_REFERENCE:
			lowerRefBound = getLowerRefBound(this.oracle.getCheck().getReference().getLower().getBound_lower(),
					timestamp, monitoringVariableList);
			// recalculate lowerRefBound according to the confidence value
			lowerRefBound = Utils.calcDownBound(confidence, signalMin, lowerRefBound);

			outOfBounds = Utils.checkLower(lowerRefBound, signalVal);
			break;
		case RANGE:
			upperRefBound = getUpperRefBound(this.oracle.getCheck().getReference().getRange().getBound_upp(), timestamp,
					monitoringVariableList);
			upperRefBound = Utils.calcUpBound(confidence, signalMax, upperRefBound);

			lowerRefBound = getLowerRefBound(this.oracle.getCheck().getReference().getRange().getBound_lower(),
					timestamp, monitoringVariableList);
			lowerRefBound = Utils.calcDownBound(confidence, signalMin, lowerRefBound);

			if (upperRefBound < lowerRefBound)
				return false;
			outOfBounds = Utils.checkNotInBetween(lowerRefBound, upperRefBound, signalVal);
			break;
		case GAP:
			upperRefBound = getUpperRefBound(this.oracle.getCheck().getReference().getGap().getBound_upp(), timestamp,
					monitoringVariableList);
			upperRefBound = Utils.calcGapUpBound(confidence, signalMax, upperRefBound);

			lowerRefBound = getLowerRefBound(this.oracle.getCheck().getReference().getGap().getBound_lower(), timestamp,
					monitoringVariableList);
			lowerRefBound = Utils.calcGapDownBound(confidence, signalMin, lowerRefBound);

			if (upperRefBound < lowerRefBound)
				return false;

			outOfBounds = Utils.checkInBetween(lowerRefBound, upperRefBound, signalVal);
			break;
		case SAME_REFERENCE:
			upperRefBound = getUpperRefBound(this.oracle.getCheck().getReference().getSame().getBound_upp(), timestamp,
					monitoringVariableList);
			upperRefBound = Utils.calcUpBound(confidence, signalMax, upperRefBound);
			lowerRefBound = Utils.calcDownBound(confidence, signalMin, upperRefBound);

			if (upperRefBound < lowerRefBound)
				return false;
			outOfBounds = Utils.checkNotInBetween(lowerRefBound, upperRefBound, signalVal);
			break;
		case NOTSAME_REFERENCE:
			upperRefBound = getUpperRefBound(this.oracle.getCheck().getReference().getNotsame().getBound_upp(),
					timestamp, monitoringVariableList);

			outOfBounds = Utils.checkEqual(upperRefBound, signalVal);
			break;
		}

		if (timestamp == 0) {
			System.out.println(
					"Checking if signal is out of bounds for reference [" + lowerRefBound + "," + upperRefBound + "]");
		}

		if (outOfBounds) {
			System.out.println("  signal at " + timestamp + ":" + signalVal + " is out of bounds for reference ["
					+ lowerRefBound + "," + upperRefBound + "]");
		}
		return outOfBounds;
	}

	private double getLowerRefBound(Bound_Down down, int timestamp,
			HashMap<String, MonitoringVariables> monitoringVariableList) {
		double lowerRefBound = 0.0;
		if (down.getValue() != null) {
			lowerRefBound = down.getValue().getDVal();
		} else {
			lowerRefBound = (double) evalExpression(
					getExpression(down.getEm().getElements(), timestamp, monitoringVariableList));
		}

		return lowerRefBound;
	}

	private double getUpperRefBound(Bound_up up, int timestamp,
			HashMap<String, MonitoringVariables> monitoringVariableList) {
		double upperRefBound = 0.0;
		if (up.getValue() != null) {
			upperRefBound = up.getValue().getDVal();
		} else {
			upperRefBound = (double) evalExpression(
					getExpression(up.getEm().getElements(), timestamp, monitoringVariableList));
		}

		return upperRefBound;
	}

	private List<Double> getMaxMinValueCombinations(EList<AbstractElement2> elements,
			HashMap<String, MonitoringVariables> monitoringVariableList) {
		String expressionWithVars = getExpressionWithVars(elements);
		List<String> varNames = diffVarNames(expressionWithVars);
		List<String> exprCombs = new ArrayList<String>();
		List<Double> maxMinValueCombs = new ArrayList<Double>();

		exprCombs = generateCombinations(0, expressionWithVars, varNames, exprCombs, monitoringVariableList);
		for (String expression : exprCombs) {
			maxMinValueCombs.add((Double) evalExpression(expression));
		}
		return maxMinValueCombs;
	}

	public List<String> generateCombinations(int index, String expression, List<String> varNames,
			final List<String> exprCombs, HashMap<String, MonitoringVariables> monitoringVariableList) {
		List<String> exC = new ArrayList<String>(exprCombs);
		String replaceVarMin = replaceVar(expression, varNames.get(index),
				Double.toString(monitoringVariableList.get(varNames.get(index)).getMin()));
		String replaceVarMax = replaceVar(expression, varNames.get(index),
				Double.toString(monitoringVariableList.get(varNames.get(index)).getMax()));
		if (index == varNames.size() - 1) {
			exC.add(replaceVarMin);
			exC.add(replaceVarMax);
		} else {
			List<String> minCombs = generateCombinations(index + 1, replaceVarMin, varNames, exprCombs,
					monitoringVariableList);
			List<String> maxCombs = generateCombinations(index + 1, replaceVarMax, varNames, exprCombs,
					monitoringVariableList);
			exC.addAll(minCombs);
			exC.addAll(maxCombs);
		}
		return exC;
	}

	public List<String> diffVarNames(String expression) {
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

	public boolean checkPreconditionIsMet(int timestamp, HashMap<String, MonitoringVariables> monitoringVariableList) {
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

		isMet = (Boolean) evalExpression(getExpression(elements, timestamp, monitoringVariableList));
		if (isMet) {
			if (precond.equals(PRECONDS.WHEN) || precond.equals(PRECONDS.WHENAFTERWHEN)) {
				System.out.println("Precondition met (" + getExpression(elements, timestamp, monitoringVariableList)
						+ ") at timestamp: " + timestamp);
				whenPrecondMet = true;
				savedTimestamp = timestamp;
			}
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

	public String replaceVar(String expression, String varName, String value) {
		return expression.replace("@@" + varName + "@@", value);
	}

	private String getExpression(EList<AbstractElement2> elements, int timestamp,
			HashMap<String, MonitoringVariables> monitoringVariableList) {
		String expression = "";
		for (AbstractElement2 element : elements) {
			if (element.getFrontParentheses().size() > 0) {
				expression += "(";
			}
			if (element.getName() != null) {
				expression += monitoringVariableList.get(element.getName()).getOpData().get(timestamp).toString();
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

	public void findPrecond() {
		if (this.oracle.getWhen() != null) {
			if (this.oracle.getWhen().getAw() != null) {
				this.precond = PRECONDS.WHENAFTERWHEN;
				double dur = this.oracle.getWhen().getAw().getWait().getTime().getDVal();
				switch (this.oracle.getWhen().getAw().getWait().getUnit().getTime()) {
				case "milliseconds":
					aWDuration = (int) (dur * 1000);
					break;
				case "minutes":
					aWDuration = (int) dur * 60;
					break;
				case "hours":
					aWDuration = (int) dur * 60 * 60;
					break;
				default: // seconds
					aWDuration = (int) dur;
				}
			} else {
				this.precond = PRECONDS.WHEN;
			}
		} else if (this.oracle.getWhile() != null) {
			this.precond = PRECONDS.WHILE;
		}
	}

	public void findOraclePattern() {
		Reference reference = this.oracle.getCheck().getReference();
		At_least atLeast = null;
		At_most atMost = null;
		Exactly exactly = null;
		if (this.oracle.getCheck().getReference().getLower() != null) {
			this.pattern = PATTERNS.ABOVE_REFERENCE;
			atLeast = reference.getLower().getAtleast();
			atMost = reference.getLower().getAtmost();
			exactly = reference.getLower().getExactly();
		} else if (this.oracle.getCheck().getReference().getUpper() != null) {
			this.pattern = PATTERNS.BELOW_REFERENCE;
			atLeast = reference.getUpper().getAtleast();
			atMost = reference.getUpper().getAtmost();
			exactly = reference.getUpper().getExactly();
		} else if (this.oracle.getCheck().getReference().getGap() != null) {
			this.pattern = PATTERNS.GAP;
			atLeast = reference.getGap().getAtleast();
			atMost = reference.getGap().getAtmost();
			exactly = reference.getGap().getExactly();
		} else if (this.oracle.getCheck().getReference().getRange() != null) {
			this.pattern = PATTERNS.RANGE;
			atLeast = reference.getRange().getAtleast();
			atMost = reference.getRange().getAtmost();
			exactly = reference.getRange().getExactly();
		} else if (this.oracle.getCheck().getReference().getSame() != null) {
			this.pattern = PATTERNS.SAME_REFERENCE;
			atLeast = reference.getSame().getAtleast();
			atMost = reference.getSame().getAtmost();
			exactly = reference.getSame().getExactly();
		} else if (this.oracle.getCheck().getReference().getNotsame() != null) {
			this.pattern = PATTERNS.NOTSAME_REFERENCE;
			atLeast = reference.getNotsame().getAtleast();
			atMost = reference.getNotsame().getAtmost();
			exactly = reference.getNotsame().getExactly();
		}

		if (atLeast != null) {
			this.tpattern = TIMING_PATTERNS.EXACTLY;
			duration = atLeast.getTime() != null ? atLeast.getTime().getDVal() : null;
			timeUnit = atLeast.getUnit() != null ? atLeast.getUnit().toString() : null;
		} else if (atMost != null) {
			this.tpattern = TIMING_PATTERNS.ATMOST;
			duration = atMost.getTime() != null ? atMost.getTime().getDVal() : null;
			timeUnit = atMost.getUnit() != null ? atMost.getUnit().toString() : null;
		} else if (exactly != null) {
			this.tpattern = TIMING_PATTERNS.ATLEAST;
			duration = exactly.getTime() != null ? exactly.getTime().getDVal() : null;
			timeUnit = exactly.getUnit() != null ? exactly.getUnit().toString() : null;
		}
	}

	private void findSignalsMaxMinValues(HashMap<String, MonitoringVariables> monitoringVariableList) {
		if (this.oracle.getCheck().getEm() != null) {
			// get signal's variable's max and min value combinations
			List<Double> maxMinValueCombinations = getMaxMinValueCombinations(
					this.oracle.getCheck().getEm().getElements(), monitoringVariableList);
			// get signal's max and min possible values
			signalMax = Collections.max(maxMinValueCombinations);
			signalMin = Collections.min(maxMinValueCombinations);
		} else {
			// signal is a single variable
			signalMax = monitoringVariableList.get(this.oracle.getCheck().getName()).getMax();
			signalMin = monitoringVariableList.get(this.oracle.getCheck().getName()).getMin();
		}

	}

	private void findOracleFailReason() {
		int nSamples = 1;
		int nPeaks = 1;
		Double confidence = 0.0;
		// confidence, nSamples, nPeaks
		for (FailReason fr : this.oracle.getCheck().getFailReason()) {
			if (fr.getReason().getHighPeak() != null) {
				confidence = fr.getReason().getHighPeak().getCant().getDVal();
				failReasons.put(FAILREASONS.HIGH_PEAK, new FailReasonValues(confidence, nPeaks, nSamples));
			} else if (fr.getReason().getHighTime() != null) {
				confidence = fr.getReason().getHighTime().getCant().getDVal();
				nSamples = Utils.getNSamples((int) fr.getReason().getHighTime().getTime().getDVal(),
						fr.getReason().getHighTime().getUnit().getTime());
				nPeaks = nSamples;
				failReasons.put(FAILREASONS.HIGH_TIME_OUT_BOUNDS, new FailReasonValues(confidence, nPeaks, nSamples));
			} else if (fr.getReason().getXPeaks() != null) {
				confidence = fr.getReason().getXPeaks().getCant().getDVal();
				nPeaks = (int) fr.getReason().getXPeaks().getNPeaks().getDVal();
				nSamples = Utils.getNSamples((int) fr.getReason().getXPeaks().getTime().getDVal(),
						fr.getReason().getXPeaks().getUnit().getTime());
				failReasons.put(FAILREASONS.X_PEAKS_XSECONDS, new FailReasonValues(confidence, nPeaks, nSamples));
			}
		}
	}

}
