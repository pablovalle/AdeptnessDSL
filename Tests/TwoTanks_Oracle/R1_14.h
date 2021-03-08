#ifndef R1_14_H
#define R1_14_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Tank2SensorLValue;
	double Tank2Height;
	double Tank2SensorLHeight;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_14(int Tank2Height, int Tank2SensorLHeight);
Verdict evaluatePostConditions_R1_14(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_14(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_14(Array conf, Array timeStampOracle);
double confCalculator_R1_14(double signal);
#endif
