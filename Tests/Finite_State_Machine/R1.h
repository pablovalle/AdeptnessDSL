#ifndef R1_H
#define R1_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Pullup;
	double Standby;
	double Apfail;
	double Supported;
	double Limits;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1(int Standby, int Apfail, int Supported, int Limits);
Verdict evaluatePostConditions_R1(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1(Array conf, Array timeStampOracle);
double confCalculator_R1(double signal);
#endif
