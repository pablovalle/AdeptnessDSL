package org.xtext.example.mydsl.validation;

public class MonitoringVariables {
	String name, type;
	double max,min;
	public MonitoringVariables(String name, String type, double max, double min) {
		super();
		this.name = name;
		this.type = type;
		this.max = max;
		this.min = min;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public double getMax() {
		return max;
	}
	public double getMin() {
		return min;
	}
	
}
