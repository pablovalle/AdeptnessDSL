package org.xtext.example.mydsl.validation;

public class FailReasonValues {
	Double confidence;
	int nPeaks;
	int nSamples;
	int peakCount = 0;
	int durCount = 0;
	int savedTimestamp = 0;

	public FailReasonValues(Double conf, int nP, int nS) {
		this.confidence = conf;
		this.nPeaks = nP;
		this.nSamples = nS;
	}
}
