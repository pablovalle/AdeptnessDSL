package org.xtext.example.mydsl.validation;

public class MonitoringVariables {
	private String name, type;
	private double max, min;
	private Double maxOp, minOp;

	public MonitoringVariables(String name, String type, double max, double min) {
		super();
		this.name = name;
		this.type = type;
		this.max = max;
		this.min = min;
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.type;
	}

	public double getMax() {
		return this.max;
	}

	public double getMin() {
		return this.min;
	}

	public Double getMaxOp() {
		return this.maxOp;
	}

	public Double getMinOp() {
		return this.minOp;
	}

	public void setMaxOp(double max) {
		this.maxOp = max;
	}

	public void setMinOp(double min) {
		this.minOp = min;
	}
}
