#ifndef R2_9_A_H
#define R2_9_A_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double PValveState;
	double Tank2SensorHValue;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R2_9_a(int Tank2SensorHValue);
Verdict evaluatePostConditions_R2_9_a(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2_9_a(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2_9_a(Array conf, Array timeStampOracle);
double confCalculator_R2_9_a(double signal);
#endif
