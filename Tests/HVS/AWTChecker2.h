#ifndef AWTCHECKER2_H
#define AWTCHECKER2_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double AWT;
	double numLlamadasActivas;
	double ATTD;
}SensorInput, *SENSOR_INPUT;

int evaluatePreConditions_AWTChecker2(int numLlamadasActivas, int AWT);
Verdict evaluatePostConditions_AWTChecker2(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_AWTChecker2(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_AWTChecker2(Array conf, Array timeStampOracle);
double confCalculator_AWTChecker2(double ATTD,double signal);
#endif
