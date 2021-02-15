#ifndef R1_3E_H
#define R1_3E_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double PhiRef;
	double Tk;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_3E(int Tk);
Verdict evaluatePostConditions_R1_3E(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_3E(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_3E(Array conf, Array timeStampOracle);
double confCalculator_R1_3E(double Tk,double signal);
#endif
