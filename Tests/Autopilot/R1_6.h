#ifndef R1_6_H
#define R1_6_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Phi;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_R1_6(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_6(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_6(Array conf, Array timeStampOracle);
double confCalculator_R1_6( double signal);
#endif
