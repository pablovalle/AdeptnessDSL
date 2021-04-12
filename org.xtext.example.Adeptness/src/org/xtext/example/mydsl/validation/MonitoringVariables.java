package org.xtext.example.mydsl.validation;

import java.util.HashMap;
import java.util.Set;

public class MonitoringVariables {
	
	private static MonitoringVariables monitoringVariables;
	private static String currentCPS;
	private HashMap<String, HashMap<String, MonitoringVar>> monitoringVariablesList;

	
	private MonitoringVariables() {
		monitoringVariablesList = new HashMap<String, HashMap<String, MonitoringVar>>();
	}
	
	public static MonitoringVariables getInstance(String CPS) {
		if (monitoringVariables == null)
			monitoringVariables = new MonitoringVariables();
		currentCPS = CPS;
		return monitoringVariables;
	}
	
	public void addVariable(String CPS, String varName, String type, double max, double min) {
		if (monitoringVariablesList.get(CPS) != null && monitoringVariablesList.get(CPS).get(varName) != null) {
			monitoringVariablesList.get(CPS).get(varName).update(type, max, min);
		}else {
			HashMap<String, MonitoringVar> monitoringVar = monitoringVariablesList.get(CPS);
			if (monitoringVar == null) {
				monitoringVar = new HashMap<String, MonitoringVar>();
			}
			monitoringVar.put(varName, new MonitoringVar(varName, type, max, min));
			monitoringVariablesList.put(CPS, monitoringVar);
		}
	}
	
	public void removeVariable(String varName) {
		monitoringVariablesList.get(currentCPS).remove(varName);
	}
	
	public Set<String> getVarNames(){
		return monitoringVariablesList.get(currentCPS).keySet();
	}
	
	public HashMap<String, MonitoringVar> getVariables(){
		return monitoringVariablesList.get(currentCPS);
	}
	
	

}
