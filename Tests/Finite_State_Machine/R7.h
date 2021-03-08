#ifndef R7_H
#define R7_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double State;
	double Supported;
	double good;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R7(int State, int Supported, int good);
Verdict evaluatePostConditions_R7(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R7(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R7(Array conf, Array timeStampOracle);
double confCalculator_R7(double signal);
#endif
