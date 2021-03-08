#ifndef R1_9_H
#define R1_9_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Tank2SensorHValue;
	double Tank2Height;
	double Tank2SensorHHeight;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_9(int Tank2Height, int Tank2SensorHHeight);
Verdict evaluatePostConditions_R1_9(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_9(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_9(Array conf, Array timeStampOracle);
double confCalculator_R1_9(double signal);
#endif
