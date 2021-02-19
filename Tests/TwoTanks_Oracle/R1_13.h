#ifndef R1_13_H
#define R1_13_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Tank2SensorMValue;
	double Tank2Height;
	double Tank2SensorLHeight;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_13(int Tank2Height, int Tank2SensorLHeight);
Verdict evaluatePostConditions_R1_13(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_13(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_13(Array conf, Array timeStampOracle);
double confCalculator_R1_13(double signal);
#endif
