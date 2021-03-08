#ifndef R9_H
#define R9_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double State;
	double Apfail;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R9(int State, int Apfail);
Verdict evaluatePostConditions_R9(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R9(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R9(Array conf, Array timeStampOracle);
double confCalculator_R9(double signal);
#endif
