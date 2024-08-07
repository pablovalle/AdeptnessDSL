#ifndef R1_11_H
#define R1_11_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Tank2SensorMValue;
	double Tank2Height;
	double Tank2SensorMHeight;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_11(int Tank2Height, int Tank2SensorMHeight);
Verdict evaluatePostConditions_R1_11(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_11(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_11(Array conf, Array timeStampOracle);
double confCalculator_R1_11(double signal);
#endif
