#ifndef R1_3A_H
#define R1_3A_H
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
int evaluatePreConditions_R1_3A(int Phi);
Verdict evaluatePostConditions_R1_3A(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_3A(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_3A(Array conf, Array timeStampOracle);
double confCalculator_R1_3A(double signal);
#endif
