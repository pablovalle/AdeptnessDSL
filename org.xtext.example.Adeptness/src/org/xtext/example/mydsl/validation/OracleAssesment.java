package org.xtext.example.mydsl.validation;

import org.xtext.example.mydsl.adeptness.Bound_Down;
import org.xtext.example.mydsl.adeptness.Bound_up;
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
		Bound_Down low;
		Bound_up up;
		switch (this.pat) {
		case ABOVE_REFERENCE:
			low = or.getCheck().getReference().getLower().getBound_lower();
			if (low.getEm() != null) {
				System.out.println("TODO: check expressionsModel");
				break;
			}
			valLower = low.getValue().getDVal(); 
			return (valLower <= monitoringVar.getMaxOp() && valLower >= monitoringVar.getMinOp());
		case BELOW_REFERENCE:
			up = or.getCheck().getReference().getUpper().getBound_upp();
			if (up.getEm() != null) {
				System.out.println("TODO: check expressionsModel");
				break;
			}
			
			valUp = up.getValue().getDVal();
			return  (valUp <= monitoringVar.getMaxOp() && valUp >= monitoringVar.getMinOp());
		case GAP:
			Gap gap = or.getCheck().getReference().getGap();
			if (gap.getBound_lower().getEm() != null) {
				System.out.println("TODO: check expressionsModel");
				break;
			}
			if (gap.getBound_upp().getEm() != null) {
				System.out.println("TODO: check expressionsModel");
				break;
			}			
			
			valUp = gap.getBound_upp().getValue().getDVal();
			valLower = gap.getBound_lower().getValue().getDVal();
			
			return (valUp <= monitoringVar.getMaxOp() && valUp >= monitoringVar.getMinOp() && 
					valLower <= monitoringVar.getMaxOp() && valLower>= monitoringVar.getMinOp());
		case RANGE:
			Range range = or.getCheck().getReference().getRange();
			if (range.getBound_lower().getEm() != null) {
				System.out.println("TODO: check expressionsModel");
				break;
			}
			if (range.getBound_upp().getEm() != null) {
				System.out.println("TODO: check expressionsModel");
				break;
			}
			
			valUp = range.getBound_upp().getValue().getDVal();
			valLower = range.getBound_lower().getValue().getDVal();
			return (valUp <= monitoringVar.getMaxOp() && valUp >= monitoringVar.getMinOp() && 
					valLower <= monitoringVar.getMaxOp() && valLower>= monitoringVar.getMinOp());
		}
		return true;
	}

}
