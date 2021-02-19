#ifndef R8_H
#define R8_H
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
int evaluatePreConditions_R8(int State, int Standby);
Verdict evaluatePostConditions_R8(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R8(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R8(Array conf, Array timeStampOracle);
double confCalculator_R8(double signal);
#endif
