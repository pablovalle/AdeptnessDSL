#ifndef R1_5_H
#define R1_5_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double P;
	double Tk;
	double TkPrev;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_5(int Tk, int TkPrev);
Verdict evaluatePostConditions_R1_5(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_5(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_5(Array conf, Array timeStampOracle);
double confCalculator_R1_5( double signal);
#endif
