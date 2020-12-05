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
	
	public OracleAssesment(Oracle or) {
		this.or = or;
	}
	
	
	/**
	 * @author aarrieta
	 * @return false if there is risk that the oracle fails, true if there isn't
	 */
	public boolean assesOracle() {
		for(int i = 0; i<or.getCheck().size();i++) {	
			String monitoringVariableName = or.getCheck().get(i).getName().toString();
			//getReference().getLower()!=null
			//String pattern = getPattern(or.getCheck().get(i).getReference());
			String pattern;
			if(or.getCheck().get(i).getReference().getLower()!=null) {
				pattern = "lower";
				Lower low=or.getCheck().get(i).getReference().getLower();
				double val = low.getBound_lower().getValue().getDVal();
				return getOperationalDataVerdictLower(val,monitoringVariableName);
				
				
			}else if(or.getCheck().get(i).getReference().getUpper()!=null) {
				pattern = "upper";
				Upper up=or.getCheck().get(i).getReference().getUpper();
				double val = up.getBound_upp().getValue().getDVal();
				
			}else if(or.getCheck().get(i).getReference().getGap()!=null) {
				pattern = "gap";
				Gap gap=or.getCheck().get(i).getReference().getGap();
				double valUp = gap.getBound_upp().getValue().getDVal();
				double valLower = gap.getBound_lower().getValue().getDVal();
			}else if(or.getCheck().get(i).getReference().getRange()!=null) {
				pattern = "range";
				Range range=or.getCheck().get(i).getReference().getRange();
				double valUp = range.getBound_upp().getValue().getDVal();
				double valLower = range.getBound_lower().getValue().getDVal();
			}
		}
		return true;
	}
	
	private boolean getOperationalDataVerdictLower(double val, String name) {
		
		if(name.contentEquals("AWT")) {
			for(int i=0;i<this.awt.length;i++) {
				if(val>this.awt[i])
					return false;
			}
		}
		
		return true; //false means it will fail, true it won't
	}

}
