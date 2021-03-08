#ifndef R2_1_B_H
#define R2_1_B_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Valve_State;
	double Tank1SensorLValue;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R2_1_b(int Tank1SensorLValue);
Verdict evaluatePostConditions_R2_1_b(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2_1_b(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2_1_b(Array conf, Array timeStampOracle);
double confCalculator_R2_1_b(double signal);
#endif
