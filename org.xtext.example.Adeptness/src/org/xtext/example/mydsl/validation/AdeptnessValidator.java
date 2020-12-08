/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.adeptness.AbstractElement;
import org.xtext.example.mydsl.adeptness.Adeptness;
import org.xtext.example.mydsl.adeptness.AdeptnessPackage;
import org.xtext.example.mydsl.adeptness.Checks;
import org.xtext.example.mydsl.adeptness.ConstDeg;
import org.xtext.example.mydsl.adeptness.Gap;
import org.xtext.example.mydsl.adeptness.HighPeak;
import org.xtext.example.mydsl.adeptness.HighTime;
import org.xtext.example.mydsl.adeptness.XPeaks;
import org.xtext.example.mydsl.adeptness.Imports;
import org.xtext.example.mydsl.adeptness.Lower;
import org.xtext.example.mydsl.adeptness.MonitoringFile;
import org.xtext.example.mydsl.adeptness.MonitoringPlan;
import org.xtext.example.mydsl.adeptness.MonitoringVariable;
import org.xtext.example.mydsl.adeptness.Oracle;
import org.xtext.example.mydsl.adeptness.PrecondReference;
import org.xtext.example.mydsl.adeptness.Range;
import org.xtext.example.mydsl.adeptness.Sig_type;
import org.xtext.example.mydsl.adeptness.Signal;
import org.xtext.example.mydsl.adeptness.Upper;
import org.xtext.example.mydsl.adeptness.Variable;
import org.xtext.example.mydsl.adeptness.When;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class AdeptnessValidator extends AbstractAdeptnessValidator {
	
	double cantHigh;
	double cantTime;
	double cantDeg;
	double cantXPeak;
	List<MonitoringVariables> monitoringVariableList;
	//GET MONITORING VARIBALES
	@Check
	public void getMonitoringVariables(Signal CPS) {
		monitoringVariableList=new ArrayList<>();
		String type,name;
		double min, max;
		for(int i=0; i< CPS.getSuperType().getMonitoringPlan().size(); i++) {
			MonitoringVariable monitor=CPS.getSuperType().getMonitoringPlan().get(i).getMonitoringVariables();
			if(monitor.getMonitoringVariableDatatype().getSig_type().toString().equals("boolean")) {
				name=monitor.getName().toString();
				type=monitor.getMonitoringVariableDatatype().getSig_type().toString();
				max=1;
				min=0;
			}
			else {
				name=monitor.getName().toString();
				type=monitor.getMonitoringVariableDatatype().getSig_type().toString();
				max=monitor.getMax().getDVal();
				min=monitor.getMin().getDVal();
			}
			monitoringVariableList.add(new MonitoringVariables(name,type,max,min));
		}
	}
	@Check
	public void checkHighTimeAndHighPeak(Checks check) {
		boolean HT=false;
		boolean HP=false;
		int numHT=0,numHP=0;
		for (int i=0; i<check.getFailReason().size(); i++) {
			if(check.getFailReason().get(i).getReason().getHighTime()!=null) {
				HT=true;
				numHT=i;
			}
			else if(check.getFailReason().get(i).getReason().getHighPeak()!=null) {
				HP=true;
				numHP=i;
			}
		}
		if(HT && HP) {
			HighTime Ht=check.getFailReason().get(numHT).getReason().getHighTime();
			HighPeak Hp=check.getFailReason().get(numHP).getReason().getHighPeak();
			if(Ht.getCant().getDVal()<= Hp.getCant().getDVal()) {
				error("The high peak reference confidence value must be lower than high time out of bounds confidence value",AdeptnessPackage.Literals.CHECKS__FAIL_REASON );
			}
		}
		
	}
	@Check
	public void checkConfidenceHighPeak(HighPeak HPeak) {
		if(HPeak!=null) {
			cantHigh=HPeak.getCant().getDVal();
			if(cantHigh<-1 || cantHigh > 0 ) {
				error("The confidence value must be between -1 and 0",AdeptnessPackage.Literals.HIGH_PEAK__CANT);
			}
		}
		
	}
	@Check
	public void checkConfidenceHighTime(HighTime HTime) {
		if(HTime!=null) {
			cantTime=HTime.getCant().getDVal();
			if(cantTime<-1 || cantTime > 0 ) {
				error("The confidence value must be between -1 and 0",AdeptnessPackage.Literals.HIGH_TIME__CANT);
			}
		}
		
	}
	@Check
	public void checkConfidenceConstDeg(ConstDeg constDeg) {
		if(constDeg!=null) {
			cantDeg=constDeg.getCant().getDVal();
			if(cantDeg<-1 || cantDeg > 0 ) {
				error("The confidence value must be between -1 and 0",AdeptnessPackage.Literals.CONST_DEG__CANT);
			}
		}
		
	}
	@Check
	public void checkConfidenceXPeaks(XPeaks xpeak) {
		if(xpeak!=null) {
			cantXPeak=xpeak.getCant().getDVal();
			if(cantXPeak<-1 || cantXPeak > 0 ) {
				error("The confidence value must be between -1 and 0",AdeptnessPackage.Literals.XPEAKS__CANT);
			}
		}
		
	}
	
	@Check
	public void checkBooleanMinMaxValidation(MonitoringVariable monitoringVariable) {
		if(monitoringVariable.getMonitoringVariableDatatype().getSig_type().toString().equals("boolean") && (monitoringVariable.getMax()!=null ||monitoringVariable.getMin()!=null )) {
			error("A boolean type signal can't have max and min values", AdeptnessPackage.Literals.MONITORING_VARIABLE__MONITORING_VARIABLE_DATATYPE);
			
		}
		else if((monitoringVariable.getMonitoringVariableDatatype().getSig_type().toString().equals("int")||monitoringVariable.getMonitoringVariableDatatype().getSig_type().toString().equals("double")) && (monitoringVariable.getMax()==null ||monitoringVariable.getMin()==null )) {
			error("An int or double type signal must have max and min values", AdeptnessPackage.Literals.MONITORING_VARIABLE__MONITORING_VARIABLE_DATATYPE);
		}

	}
	@Check
	public void checkMinMaxValues(MonitoringVariable monitoringVariable) {
		if(monitoringVariable.getMax().getDVal()<monitoringVariable.getMin().getDVal()) {
			error("Max value must be higher than min value", AdeptnessPackage.Literals.MONITORING_VARIABLE__MAX);
		}
	}
	
	
	/*
	@Check
	public void checkOracleConfigValues(Oracle oracle, Signal CPS) {
		System.out.println("check OracleConfig  Values entering");
		boolean is=false;
		double max, min;
		int j=0;
		for (int z=0; z<oracle.getCheck().size(); z++) {
			is=false;
			j=0;
			while(!is && j<CPS.getSuperType().getMonitoringPlan().size()) {
				if(oracle.getCheck().get(z).getName().toString().equals(CPS.getSuperType().getMonitoringPlan().get(j).getMonitoringVariables().getName().toString())) {
					is=true;
				}
				j++;
			}
			if(j==CPS.getSuperType().getMonitoringPlan().size() && !is) {
				error("There is at least one variable not included in the monitoring plan", AdeptnessPackage.Literals.SIGNAL__ORACLE);
			}
			else if(is) {
				j--;
				if(!CPS.getSuperType().getMonitoringPlan().get(j).getMonitoringVariables().getMonitoringVariableDatatype().getSig_type().equals("boolean")) {
					max=CPS.getSuperType().getMonitoringPlan().get(j).getMonitoringVariables().getMax().getDVal();
					min=CPS.getSuperType().getMonitoringPlan().get(j).getMonitoringVariables().getMin().getDVal();
				}
				else {
					max=1;
					min=0;
				}
					if(oracle.getCheck().get(z).getReference().getUpper()!=null) {
						Upper up=oracle.getCheck().get(z).getReference().getUpper();
						if(up.getBound_upp().getValue().getDVal()>max ||up.getBound_upp().getValue().getDVal()>min) {
							System.out.println("A");
							error("Every reference must be between max and min values",AdeptnessPackage.Literals.SIGNAL__ORACLE);
						}
					}
					else if(oracle.getCheck().get(z).getReference().getLower()!=null) {
						Lower low=oracle.getCheck().get(z).getReference().getLower();
						if(low.getBound_lower().getValue().getDVal()>max ||low.getBound_lower().getValue().getDVal()>min) {
							System.out.println("B");
							error("Every reference must be between max and min values",AdeptnessPackage.Literals.SIGNAL__ORACLE);
						}
					}
					else if(oracle.getCheck().get(z).getReference().getGap()!=null) {
						Gap gap=oracle.getCheck().get(z).getReference().getGap();
						if(gap.getBound_upp().getValue().getDVal()>max || gap.getBound_upp().getValue().getDVal()<min || gap.getBound_lower().getValue().getDVal()>max ||gap.getBound_lower().getValue().getDVal()<min) {
							System.out.println("C");
							error("Every reference must be between max and min values",AdeptnessPackage.Literals.SIGNAL__ORACLE);
						}
					}
					else if(oracle.getCheck().get(z).getReference().getRange()!=null) {
						Range range=oracle.getCheck().get(z).getReference().getRange();
						if(range.getBound_upp().getValue().getDVal()>max || range.getBound_upp().getValue().getDVal()<min || range.getBound_lower().getValue().getDVal()>max ||range.getBound_lower().getValue().getDVal()<min) {
							System.out.println("D");
							error("Every reference must be between max and min values",AdeptnessPackage.Literals.SIGNAL__ORACLE);
						}
					}
			}
		}
		
	}

	@Check
	public void checkCPSConfigValues(Signal CPS) {
		System.out.println("check checkCPSConfigValues entering");
		boolean is=false;
		double max, min;
		int j=0;
		for(int i=0; i<CPS.getOracle().size(); i++) {
			for (int z=0; z<CPS.getOracle().get(i).getCheck().size(); z++) {
				is=false;
				j=0;
				while(!is && j<CPS.getSuperType().getMonitoringPlan().size()) {
					if(CPS.getOracle().get(i).getCheck().get(z).getName().toString().equals(CPS.getSuperType().getMonitoringPlan().get(j).getMonitoringVariables().getName().toString())) {
						is=true;
					}
					j++;
				}
				if(j==CPS.getSuperType().getMonitoringPlan().size() && !is) {
					String errorString = "The variable " + CPS.getOracle().get(i).getCheck().get(z).getName().toString() + " is not in the monitoring plan";
					error(errorString, AdeptnessPackage.Literals.SIGNAL__ORACLE);
				}
				else if(is) {
					j--;
					if(!CPS.getSuperType().getMonitoringPlan().get(j).getMonitoringVariables().getMonitoringVariableDatatype().getSig_type().equals("boolean")) {
						max=CPS.getSuperType().getMonitoringPlan().get(j).getMonitoringVariables().getMax().getDVal();
						min=CPS.getSuperType().getMonitoringPlan().get(j).getMonitoringVariables().getMin().getDVal();
					}
					else {
						max=1;
						min=0;
					}
					if(CPS.getOracle().get(i).getCheck().get(z).getReference().getUpper()!=null) {
						Upper up=CPS.getOracle().get(i).getCheck().get(z).getReference().getUpper();
						if(up.getBound_upp().getValue().getDVal()>max) {
							System.out.println("A");
							String errorString = "Oracle " + CPS.getOracle().get(i).getCheck().get(z).getName().toString() + " does not comply max values specified in the validation plan insede the check";
							error(errorString,AdeptnessPackage.Literals.SIGNAL__ORACLE);//SIGNAL__ORACLE
						}
						if(up.getBound_upp().getValue().getDVal()<min) {
							String errorString = "Oracle " + CPS.getOracle().get(i).getCheck().get(z).getName().toString() + " does not comply min values specified in the validation plan insede the check";
							error(errorString,AdeptnessPackage.Literals.SIGNAL__ORACLE);//SIGNAL__ORACLE
	
						}
					}
					else if(CPS.getOracle().get(i).getCheck().get(z).getReference().getLower()!=null) {
						Lower low=CPS.getOracle().get(i).getCheck().get(z).getReference().getLower();
						if(low.getBound_lower().getValue().getDVal()>max) {
							System.out.println("B");
							String errorString = "Oracle " + CPS.getOracle().get(i).getCheck().get(z).getName().toString() + " does not comply max values specified in the validation plan in the check";
							error(errorString,AdeptnessPackage.Literals.SIGNAL__ORACLE);
						}
						if(low.getBound_lower().getValue().getDVal()<min) {
							String errorString = "Oracle " + CPS.getOracle().get(i).getCheck().get(z).getName().toString() + " does not comply min values specified in the validation plan in the check";
							error(errorString,AdeptnessPackage.Literals.SIGNAL__ORACLE);
				
						}
					}
					else if(CPS.getOracle().get(i).getCheck().get(z).getReference().getGap()!=null) {
						Gap gap=CPS.getOracle().get(i).getCheck().get(z).getReference().getGap();
						if(gap.getBound_upp().getValue().getDVal()>max || gap.getBound_upp().getValue().getDVal()<min || gap.getBound_lower().getValue().getDVal()>max ||gap.getBound_lower().getValue().getDVal()<min) {
							System.out.println("C");
							String errorString = "Oracle " + CPS.getOracle().get(i).getCheck().get(z).getName().toString() + " does not comply max and/or min values in the check";
							error(errorString,AdeptnessPackage.Literals.SIGNAL__ORACLE);
						}
					}
					else if(CPS.getOracle().get(i).getCheck().get(z).getReference().getRange()!=null) {
						Range range=CPS.getOracle().get(i).getCheck().get(z).getReference().getRange();
						if(range.getBound_upp().getValue().getDVal()>max || range.getBound_upp().getValue().getDVal()<min || range.getBound_lower().getValue().getDVal()>max ||range.getBound_lower().getValue().getDVal()<min) {
							System.out.println("D");
							String errorString = "Oracle " + CPS.getOracle().get(i).getCheck().get(z).getName().toString() + " does not comply max and/or min values in the check";
							error(errorString,AdeptnessPackage.Literals.SIGNAL__ORACLE);
						}
					}
				}
			}
		}
	}*/
	@Check
	public void checkMonitoringVariables(Checks check) {
		String checkName=check.getName().toString();
		double max, min;
		boolean is= false;
		for(int i=0;i<monitoringVariableList.size();i++) {
			if(checkName.equals(monitoringVariableList.get(i).getName())) {
				is=true;
				max=monitoringVariableList.get(i).getMax();
				min= monitoringVariableList.get(i).getMin();
				if(check.getReference().getUpper()!=null) {
					Upper up=check.getReference().getUpper();
					if(up.getBound_upp().getValue().getDVal()>max) {
						String errorString = "Check "+check.getName()+" with value: "+up.getBound_upp().getValue().getDVal()+" does not comply max value: "+max+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.CHECKS__REFERENCE);
					}
					if(up.getBound_upp().getValue().getDVal()<min) {
						String errorString = "Check "+check.getName()+" with value: "+up.getBound_upp().getValue().getDVal()+" does not comply min value: "+min+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.CHECKS__REFERENCE);
					}
				}
				else if(check.getReference().getLower()!=null) {
					Lower low=check.getReference().getLower();
					if(low.getBound_lower().getValue().getDVal()>max) {
						String errorString = "Check "+check.getName()+" with value: "+low.getBound_lower().getValue().getDVal()+" does not comply max value: "+max+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.CHECKS__REFERENCE);
					}
					if(low.getBound_lower().getValue().getDVal()<min) {
						String errorString = "Check "+check.getName()+" with value: "+low.getBound_lower().getValue().getDVal()+" does not comply min value: "+min+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.CHECKS__REFERENCE);
					}
				}
				else if(check.getReference().getRange()!=null) {
					Range range=check.getReference().getRange();
					if(range.getBound_upp().getValue().getDVal()>max) {
						String errorString = "Check "+check.getName()+" with value: "+range.getBound_upp().getValue().getDVal()+" does not comply max value: "+max+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.CHECKS__REFERENCE);
					}
					if(range.getBound_upp().getValue().getDVal()<min) {
						String errorString = "Check "+check.getName()+" with value: "+range.getBound_upp().getValue().getDVal()+" does not comply min value: "+min+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.CHECKS__REFERENCE);
					}
					if(range.getBound_lower().getValue().getDVal()>max) {
						String errorString = "Check "+check.getName()+" with value: "+range.getBound_lower().getValue().getDVal()+" does not comply max value: "+max+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.CHECKS__REFERENCE);
					}
					if(range.getBound_lower().getValue().getDVal()<min) {
						String errorString = "Check "+check.getName()+" with value: "+range.getBound_lower().getValue().getDVal()+" does not comply min value: "+min+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.CHECKS__REFERENCE);
					}
				}
				else if(check.getReference().getGap()!=null) {
					Gap gap=check.getReference().getGap();
					if(gap.getBound_upp().getValue().getDVal()>max) {
						String errorString = "Check "+check.getName()+" with value: "+gap.getBound_upp().getValue().getDVal()+" does not comply max value: "+max+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.CHECKS__REFERENCE);
					}
					if(gap.getBound_upp().getValue().getDVal()<min) {
						String errorString = "Check "+check.getName()+" with value: "+gap.getBound_upp().getValue().getDVal()+" does not comply min value: "+min+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.CHECKS__REFERENCE);
					}
					if(gap.getBound_lower().getValue().getDVal()>max) {
						String errorString = "Check "+check.getName()+" with value: "+gap.getBound_lower().getValue().getDVal()+" does not comply max value: "+max+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.CHECKS__REFERENCE);
					}
					if(gap.getBound_lower().getValue().getDVal()<min) {
						String errorString = "Check "+check.getName()+" with value: "+gap.getBound_lower().getValue().getDVal()+" does not comply min value: "+min+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.CHECKS__REFERENCE);
					}
				}
			}
		}
		if(!is) {
			error("This variable is not in the monitoring plan",AdeptnessPackage.Literals.CHECKS__NAME);
		}
	}
	
	@Check
	public void checkOracleAssesment(Oracle or) {
		OracleAssesment oa = new OracleAssesment(or);
		if(!oa.assesOracle())
			warning("This oracle may fail if we consider operational data", AdeptnessPackage.Literals.ORACLE__CHECK);
		
	}
	
	
	
	@Check
	public void checkMonitoringVariablesInPreconditions(Variable precond) {
		String checkName=precond.getName().toString();
		double max, min;
		boolean is= false;
		for(int i=0;i<monitoringVariableList.size();i++) {
			if(checkName.equals(monitoringVariableList.get(i).getName())) {
				is=true;
				/*max=monitoringVariableList.get(i).getMax();
				min= monitoringVariableList.get(i).getMin();
				if(precond.getPrecondReference().getUpper()!=null) {
					Upper up=precond.getPrecondReference().getUpper();
					if(up.getBound_upp().getValue().getDVal()>max) {
						String errorString = "Check "+precond.getName()+" with value: "+up.getBound_upp().getValue().getDVal()+" does not comply max value: "+max+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.WHEN__PRECOND_REFERENCE);
					}
					if(up.getBound_upp().getValue().getDVal()<min) {
						String errorString = "Check "+precond.getName()+" with value: "+up.getBound_upp().getValue().getDVal()+" does not comply min value: "+min+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.WHEN__PRECOND_REFERENCE);
					}
				}
				else if(precond.getPrecondReference().getLower()!=null) {
					Lower low=precond.getPrecondReference().getLower();
					if(low.getBound_lower().getValue().getDVal()>max) {
						String errorString = "Check "+precond.getName()+" with value: "+low.getBound_lower().getValue().getDVal()+" does not comply max value: "+max+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.WHEN__PRECOND_REFERENCE);
					}
					if(low.getBound_lower().getValue().getDVal()<min) {
						String errorString = "Check "+precond.getName()+" with value: "+low.getBound_lower().getValue().getDVal()+" does not comply min value: "+min+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.WHEN__PRECOND_REFERENCE);
					}
				}
				else if(precond.getPrecondReference().getRange()!=null) {
					Range range=precond.getPrecondReference().getRange();
					if(range.getBound_upp().getValue().getDVal()>max) {
						String errorString = "Check "+precond.getName()+" with value: "+range.getBound_upp().getValue().getDVal()+" does not comply max value: "+max+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.WHEN__PRECOND_REFERENCE);
					}
					if(range.getBound_upp().getValue().getDVal()<min) {
						String errorString = "Check "+precond.getName()+" with value: "+range.getBound_upp().getValue().getDVal()+" does not comply min value: "+min+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.WHEN__PRECOND_REFERENCE);
					}
					if(range.getBound_lower().getValue().getDVal()>max) {
						String errorString = "Check "+precond.getName()+" with value: "+range.getBound_lower().getValue().getDVal()+" does not comply max value: "+max+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.WHEN__PRECOND_REFERENCE);
					}
					if(range.getBound_lower().getValue().getDVal()<min) {
						String errorString = "Check "+precond.getName()+" with value: "+range.getBound_lower().getValue().getDVal()+" does not comply min value: "+min+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.WHEN__PRECOND_REFERENCE);
					}
				}
				else if(precond.getPrecondReference().getGap()!=null) {
					Gap gap=precond.getPrecondReference().getGap();
					if(gap.getBound_upp().getValue().getDVal()>max) {
						String errorString = "Check "+precond.getName()+" with value: "+gap.getBound_upp().getValue().getDVal()+" does not comply max value: "+max+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.WHEN__PRECOND_REFERENCE);
					}
					if(gap.getBound_upp().getValue().getDVal()<min) {
						String errorString = "Check "+precond.getName()+" with value: "+gap.getBound_upp().getValue().getDVal()+" does not comply min value: "+min+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.WHEN__PRECOND_REFERENCE);
					}
					if(gap.getBound_lower().getValue().getDVal()>max) {
						String errorString = "Check "+precond.getName()+" with value: "+gap.getBound_lower().getValue().getDVal()+" does not comply max value: "+max+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.WHEN__PRECOND_REFERENCE);
					}
					if(gap.getBound_lower().getValue().getDVal()<min) {
						String errorString = "Check "+precond.getName()+" with value: "+gap.getBound_lower().getValue().getDVal()+" does not comply min value: "+min+" specified in the validation plan";
						error(errorString,AdeptnessPackage.Literals.WHEN__PRECOND_REFERENCE);
					}
				}*/
			}
		}
		if(!is) {
			error("This variable is not in the monitoring plan",AdeptnessPackage.Literals.VARIABLE__NAME);
		}
	}
	
	
	
}
