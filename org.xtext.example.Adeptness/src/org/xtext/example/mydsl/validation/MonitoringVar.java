package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.Collections;

public class MonitoringVar {
	private String name, type;
	private double max, min;
	private Double maxOp, minOp;
	private ArrayList<Double> opData;
	
	OperationalDataConnector opCon = new OperationalDataConnector();

	public MonitoringVar(String name, String type, double max, double min) {
		super();
		this.name = name;
		this.type = type;
		this.max = max;
		this.min = min;
		this.setOpData(opCon.getVariableOpData(name));
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

	public void update(String type, double max, double min) {
		this.type = type;
		this.max = max;
		this.min = min;
	}
	
	public Double getMaxOp() {
		return this.maxOp;
	}

	public Double getMinOp() {
		return this.minOp;
	}
	
	public ArrayList<Double> getOpData() {
		return this.opData;
	}

	private void setOpData(ArrayList<Double> data) {
		if (data != null) {
			this.opData = data;
			this.minOp = Collections.min(data);
			this.maxOp = Collections.max(data);
		}
	}
}