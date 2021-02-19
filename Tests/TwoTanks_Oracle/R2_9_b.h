#ifndef R2_9_B_H
#define R2_9_B_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double EValveState;
	double Tank2SensorHValue;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R2_9_b(int Tank2SensorHValue);
Verdict evaluatePostConditions_R2_9_b(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2_9_b(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2_9_b(Array conf, Array timeStampOracle);
double confCalculator_R2_9_b(double signal);
#endif
