package org.xtext.example.mydsl.validation;

/*
 * 
 * Utility file 
 *   -> Upper and lower bounds taking confidence value into account
 *   -> Number of samples in a period of time
 *   -> Assertion condition checks
 * 	
 * @author Maialen Otaegi
 * 
 * */

public class Utils {
	
	// Get upper or lower bounds taking confidence value into account  
	public static double calcUpBound(double confidence, double max, double bound) {
		// conf = (ref - sign)/(max - ref)
		return -(confidence * (max - bound)) + bound;
	}

	public static double calcGapUpBound(double confidence, double max, double bound) {
		// conf = (sign - upRef) / (max - upRef)
		return confidence * (max - bound) + bound;
	}

	public static double calcDownBound(double confidence, double min, double bound) {
		// conf = (sign - ref)/(ref - min)
		return confidence * (bound - min) + bound;
	}

	public static double calcGapDownBound(double confidence, double min, double bound) {
		// conf = (lowerRef - sign) / (lowerRef - min)
		return -(confidence * (bound - min)) + bound;
	}

	// TODO: configurable sampling frequency  
	public static int getNSamples(int samples, String timeUnit) {
		if (samples <= 0) return samples;
		
		// 1 sample = 1 second
		int nSamples = samples;
		switch (timeUnit) {
		case "milliseconds":
			nSamples = (int) nSamples / 1000;
			if (nSamples < 1)
				nSamples = 1;
			break;
		case "minutes":
			nSamples = nSamples * 60;
			break;
		case "hours":
			nSamples = nSamples * 60 * 60;
			break;
		default: // seconds
		}
		return nSamples;
	}

	// assertion condition checks
	public static boolean checkUpper(Double upBound, Double opData) {
		if (upBound == null || opData == null)
			return false;
		if (upBound < opData) {
			return true;
		}
		return false;
	}

	public static boolean checkLower(Double lowBound, Double opData) {
		if (lowBound == null || opData == null)
			return false;
		if (lowBound > opData) {
			return true;
		}
		return false;
	}

	public static boolean checkInBetween(Double lowBound, Double upBound, Double opData) {
		if (lowBound == null || upBound == null || opData == null)
			return false;
		if (opData > lowBound && upBound > opData) {
			return true;
		}
		return false;
	}

	public static boolean checkNotInBetween(Double lowBound, Double upBound, Double opData) {
		if (lowBound == null || upBound == null || opData == null)
			return false;
		if (lowBound > opData || opData > upBound) {
			return true;
		}
		return false;
	}

	public static boolean checkEqual(Double bound, Double opData) {
		if (bound == null || opData == null)
			return false;
		if (opData.doubleValue() == bound.doubleValue()) {
			return true;
		}
		return false;
	}
	
}
