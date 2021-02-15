#ifndef R1_3C_H
#define R1_3C_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double PhiRef;
	double Phi;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_3C(int Phi);
Verdict evaluatePostConditions_R1_3C(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_3C(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_3C(Array conf, Array timeStampOracle);
double confCalculator_R1_3C(double signal);
#endif
