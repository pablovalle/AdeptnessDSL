#ifndef R2_2_A_H
#define R2_2_A_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Pump_State;
	double Tank1SensorHValue;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R2_2_a(int Tank1SensorHValue);
Verdict evaluatePostConditions_R2_2_a(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2_2_a(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2_2_a(Array conf, Array timeStampOracle);
double confCalculator_R2_2_a(double signal);
#endif
