#ifndef R6_H
#define R6_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double State;
	double good;
	double Standby;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R6(int State, int good, int Standby);
Verdict evaluatePostConditions_R6(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R6(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R6(Array conf, Array timeStampOracle);
double confCalculator_R6(double signal);
#endif
