#ifndef R1_7_H
#define R1_7_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double AilCmd;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_R1_7(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_7(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_7(Array conf, Array timeStampOracle);
double confCalculator_R1_7( double signal);
#endif
