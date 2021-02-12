#ifndef R1_2_H
#define R1_2_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double isRoll;
	double APEng;
	double HDGMode;
	double ALTMode;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_2(int APEng, int HDGMode, int ALTMode);
Verdict evaluatePostConditions_R1_2(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_2(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_2(Array conf, Array timeStampOracle);
double confCalculator_R1_2(double signal);
#endif
