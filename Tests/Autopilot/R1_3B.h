#ifndef R1_3B_H
#define R1_3B_H
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
int evaluatePreConditions_R1_3B(int Phi);
Verdict evaluatePostConditions_R1_3B(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_3B(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_3B(Array conf, Array timeStampOracle);
double confCalculator_R1_3B(double signal);
#endif
