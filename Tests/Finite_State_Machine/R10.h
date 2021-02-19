#ifndef R10_H
#define R10_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Senstate;
	double Limits;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R10(int Senstate, int Limits);
Verdict evaluatePostConditions_R10(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R10(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R10(Array conf, Array timeStampOracle);
double confCalculator_R10(double signal);
#endif
