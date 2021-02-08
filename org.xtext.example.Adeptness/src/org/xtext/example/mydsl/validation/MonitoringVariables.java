package org.xtext.example.mydsl.validation;

import java.util.Collections;
import java.util.Set;

public class MonitoringVariables {
	private String name, type;
	private double max, min;
	private Double maxOp, minOp;
	private Set<Double> opData;

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

	public Set<Double> getOpData() {
		return this.opData;
	}

	public void setOpData(Set<Double> data) {
		if (data != null) {
			this.opData = data;
			this.minOp = Collections.min(data);
			this.maxOp = Collections.max(data);
		}
	}
}
