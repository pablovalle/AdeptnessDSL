#ifndef R1_8_H
#define R1_8_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double isRoll;
	double HDGMode;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_8(int HDGMode);
Verdict evaluatePostConditions_R1_8(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_8(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_8(Array conf, Array timeStampOracle);
double confCalculator_R1_8(double signal);
#endif
