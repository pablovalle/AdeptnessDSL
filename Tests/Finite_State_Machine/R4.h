#ifndef R4_H
#define R4_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double State;
	double good;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R4(int State, int good);
Verdict evaluatePostConditions_R4(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R4(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R4(Array conf, Array timeStampOracle);
double confCalculator_R4(double signal);
#endif
