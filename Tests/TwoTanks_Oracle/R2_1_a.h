#ifndef R2_1_A_H
#define R2_1_A_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Pump_State;
	double Tank1SensorLValue;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R2_1_a(int Tank1SensorLValue);
Verdict evaluatePostConditions_R2_1_a(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2_1_a(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2_1_a(Array conf, Array timeStampOracle);
double confCalculator_R2_1_a(double signal);
#endif
