package org.xtext.example.mydsl.validation;

import org.xtext.example.mydsl.adeptness.Gap;
import org.xtext.example.mydsl.adeptness.Lower;
import org.xtext.example.mydsl.adeptness.Oracle;
import org.xtext.example.mydsl.adeptness.Range;
import org.xtext.example.mydsl.adeptness.Upper;

import com.ibm.icu.impl.coll.SharedObject.Reference;

public class OracleAssesment {
	
	Oracle or;
	int oracleCheck;
	double[] awt = {10, 20, 30, 40};
	
	enum PATTERNS {BELLOW_REFERENCE, ABOVE_REFERENCE, GAP, RANGE};
	enum FAILREASONS {HIGH_PEAK, HIGH_TIME_OUT_BOUNDS, CONSTANT_DEGRADATION, X_PEAKS_XSECONDS}
	
	PATTERNS pat;
	FAILREASONS fr;
	
	/**
	 * Constructor
	 * @param or
	 */
	public OracleAssesment(Oracle or) {
		this.or = or;
		findOraclePattern(or);
		findOracleFailReason(or);
	}
	
	
	public void findOraclePattern(Oracle or) {

			//System.out.println("for" + i);
			String monitoringVariableName = or.getCheck().getName().toString();
			//getReference().getLower()!=null
			//String pattern = getPattern(or.getCheck().get(i).getReference());
			String pattern;
			if(or.getCheck().getReference().getLower()!=null) {
				this.pat = 	PATTERNS.ABOVE_REFERENCE;				
			}else if(or.getCheck().getReference().getUpper()!=null) {
				this.pat = PATTERNS.BELLOW_REFERENCE;
				
			}else if(or.getCheck().getReference().getGap()!=null) {
				this.pat = PATTERNS.GAP;
			}else if(or.getCheck().getReference().getRange()!=null) {
				this.pat = PATTERNS.RANGE;
			}
	}

	
	public void findOracleFailReason(Oracle or) {
		
		
	}
	
	
	/**
	 * @author aarrieta
	 * @return false if there is risk that the oracle fails, true if there isn't
	 */
	public boolean assesOracle() {
		//System.out.println("oracle assessment entering");
			//System.out.println("for" + i);
			String monitoringVariableName = or.getCheck().getName().toString();
			//getReference().getLower()!=null
			//String pattern = getPattern(or.getCheck().get(i).getReference());
			String pattern;
			//System.out.println("pattern = " + this.pat);
			if(this.pat==PATTERNS.ABOVE_REFERENCE) {
				//System.out.println("lower");
				pattern = "lower";
				Lower low=or.getCheck().getReference().getLower();
				double val = low.getBound_lower().getValue().getDVal();
				return getOperationalDataVerdictIsAbove(val,monitoringVariableName);
				
				
			}else if(this.pat==PATTERNS.BELLOW_REFERENCE) {
				//System.out.println("upper");
				pattern = "upper";
				Upper up=or.getCheck().getReference().getUpper();
				double val = up.getBound_upp().getValue().getDVal();
				return getOperationalDataVerdictIsBelow(val, monitoringVariableName);
				
			}else if(this.pat == PATTERNS.GAP) {
				//System.out.println("gap");
				pattern = "gap";
				Gap gap=or.getCheck().getReference().getGap();
				double valUp = gap.getBound_upp().getValue().getDVal();
				double valLower = gap.getBound_lower().getValue().getDVal();
			}else if(this.pat == PATTERNS.RANGE) {
				//System.out.println("range");
				pattern = "range";
				Range range=or.getCheck().getReference().getRange();
				double valUp = range.getBound_upp().getValue().getDVal();
				double valLower = range.getBound_lower().getValue().getDVal();
			}
		return true;
	}
	
	/**
	 * Is below
	 * @param val
	 * @param name
	 * @return
	 */
	private boolean getOperationalDataVerdictIsAbove(double val, String name) {
		//System.out.println("entering getOperationalDataVerdictIsAbove");
		if(name.contentEquals("AWT")) {
			for(int i=0;i<this.awt.length;i++) {
				//System.out.println("val = " + val);
				//System.out.println("awt["+i +"] = " + awt[i]);
				if(val>this.awt[i])
					return false;
			}
		}
		
		return true; //false means it will fail, true it won't
	}
	
	/**
	 * Is above
	 * @param val
	 * @param name
	 * @return
	 */
	private boolean getOperationalDataVerdictIsBelow(double val, String name) {
		//System.out.println("entering getOperationalDataVerdictIsBelow");
		if(name.contentEquals("AWT")) {
			for(int i=0;i<this.awt.length;i++) {
				//System.out.println("val = " + val);
				//System.out.println("awt["+i +"] = " + awt[i]);
				if(val<this.awt[i])
					return false;
			}
		}
		
		return true; //false means it will fail, true it won't
	}
	
	

}
