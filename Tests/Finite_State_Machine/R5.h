#ifndef R5_H
#define R5_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double State;
	double Standby;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R5(int State, int Standby);
Verdict evaluatePostConditions_R5(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R5(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R5(Array conf, Array timeStampOracle);
double confCalculator_R5(double signal);
#endif
