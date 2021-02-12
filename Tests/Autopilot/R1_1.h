#ifndef R1_1_H
#define R1_1_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double AilCmd;
	double APEngPrev;
	double APEng;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_1(int APEngPrev, int APEng);
Verdict evaluatePostConditions_R1_1(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_1(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_1(Array conf, Array timeStampOracle);
double confCalculator_R1_1(double signal);
#endif
