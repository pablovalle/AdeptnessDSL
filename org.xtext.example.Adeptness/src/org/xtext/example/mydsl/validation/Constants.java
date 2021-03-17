package org.xtext.example.mydsl.validation;

public class Constants {
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
	

}
