#ifndef R13_H
#define R13_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Senstate;
	double Request;
	double Mode;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R13(int Senstate, int Request, int Mode);
Verdict evaluatePostConditions_R13(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R13(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R13(Array conf, Array timeStampOracle);
double confCalculator_R13(double signal);
#endif
