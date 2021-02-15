#ifndef R1_4_2_H
#define R1_4_2_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Phi;
	double PhiRef;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_R1_4_2(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_4_2(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_4_2(Array conf, Array timeStampOracle);
double confCalculator_R1_4_2( double signal);
#endif
