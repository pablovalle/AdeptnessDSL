#ifndef R1_26_B_H
#define R1_26_B_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double SafeLevel;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_R1_26_b(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_26_b(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_26_b(Array conf, Array timeStampOracle);
double confCalculator_R1_26_b(double signal);
#endif
