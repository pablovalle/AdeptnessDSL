package org.xtext.example.mydsl.validation;

import org.xtext.example.mydsl.adeptness.Gap;
import org.xtext.example.mydsl.adeptness.Lower;
import org.xtext.example.mydsl.adeptness.Oracle;
import org.xtext.example.mydsl.adeptness.Range;
import org.xtext.example.mydsl.adeptness.Upper;

public class OracleAssesment {
	enum PATTERNS {
		BELOW_REFERENCE, ABOVE_REFERENCE, GAP, RANGE
	};

	enum FAILREASONS {
		HIGH_PEAK, HIGH_TIME_OUT_BOUNDS, CONSTANT_DEGRADATION, X_PEAKS_XSECONDS
	}

	Oracle or;
	PATTERNS pat;
	FAILREASONS fr;

	/**
	 * Constructor
	 * 
	 * @param or
	 */
	public OracleAssesment(Oracle or) {
		this.or = or;
		findOraclePattern(or);
		findOracleFailReason(or);
	}

	public void findOraclePattern(Oracle or) {
		if (or.getCheck().getReference().getLower() != null) {
			this.pat = PATTERNS.ABOVE_REFERENCE;
		} else if (or.getCheck().getReference().getUpper() != null) {
			this.pat = PATTERNS.BELOW_REFERENCE;
		} else if (or.getCheck().getReference().getGap() != null) {
			this.pat = PATTERNS.GAP;
		} else if (or.getCheck().getReference().getRange() != null) {
			this.pat = PATTERNS.RANGE;
		}
	}

	public void findOracleFailReason(Oracle or) {

	}

	public String getVariableName() {
		return or.getCheck().getName().toString();
	}

	/**
	 * @author aarrieta
	 * @return false if there is risk that the oracle fails, true if there isn't
	 */
	public boolean assesOracle(MonitoringVariables monitoringVar) {
		double valUp, valLower;
		Lower low;
		Upper up;
		switch (this.pat) {
		case ABOVE_REFERENCE:
			low = or.getCheck().getReference().getLower();
			valLower = low.getBound_lower().getValue().getDVal();
			return (valLower <= monitoringVar.getMaxOp());
		case BELOW_REFERENCE:
			up = or.getCheck().getReference().getUpper();
			valUp = up.getBound_upp().getValue().getDVal();
			return (valUp >= monitoringVar.getMinOp());
		case GAP:
			Gap gap = or.getCheck().getReference().getGap();
			valUp = gap.getBound_upp().getValue().getDVal();
			valLower = gap.getBound_lower().getValue().getDVal();
			return (valLower > monitoringVar.getMaxOp() || valUp < monitoringVar.getMinOp());
		case RANGE:
			Range range = or.getCheck().getReference().getRange();
			valUp = range.getBound_upp().getValue().getDVal();
			valLower = range.getBound_lower().getValue().getDVal();
			return (valLower <= monitoringVar.getMaxOp() && valUp >= monitoringVar.getMinOp());
		}
		return true;
	}

}
