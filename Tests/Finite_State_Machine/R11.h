#ifndef R11_H
#define R11_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Senstate;
	double Request;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R11(int Senstate, int Request);
Verdict evaluatePostConditions_R11(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R11(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R11(Array conf, Array timeStampOracle);
double confCalculator_R11(double signal);
#endif
