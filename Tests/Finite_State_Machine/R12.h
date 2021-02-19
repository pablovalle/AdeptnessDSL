#ifndef R12_H
#define R12_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Senstate;
	double Request;
	double Limits;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R12(int Senstate, int Request, int Limits);
Verdict evaluatePostConditions_R12(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R12(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R12(Array conf, Array timeStampOracle);
double confCalculator_R12(double signal);
#endif
