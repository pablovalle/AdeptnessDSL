#ifndef R2_H
#define R2_H
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
int evaluatePreConditions_R2(int State, int Standby);
Verdict evaluatePostConditions_R2(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2(Array conf, Array timeStampOracle);
double confCalculator_R2(double signal);
#endif
