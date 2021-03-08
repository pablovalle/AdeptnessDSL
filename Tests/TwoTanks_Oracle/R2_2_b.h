#ifndef R2_2_B_H
#define R2_2_B_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Valve_State;
	double Tank1SensorHValue;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R2_2_b(int Tank1SensorHValue);
Verdict evaluatePostConditions_R2_2_b(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2_2_b(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2_2_b(Array conf, Array timeStampOracle);
double confCalculator_R2_2_b(double signal);
#endif
