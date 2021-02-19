#ifndef R3_H
#define R3_H
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
int evaluatePreConditions_R3(int State, int Supported, int good);
Verdict evaluatePostConditions_R3(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R3(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R3(Array conf, Array timeStampOracle);
double confCalculator_R3(double signal);
#endif
