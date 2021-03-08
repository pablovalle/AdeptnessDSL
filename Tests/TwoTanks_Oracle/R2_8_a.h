#ifndef R2_8_A_H
#define R2_8_A_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double PValveState;
	double Tank2SensorLValue;
	double Tank2SensorMValue;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R2_8_a(int Tank2SensorLValue, int Tank2SensorMValue);
Verdict evaluatePostConditions_R2_8_a(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2_8_a(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2_8_a(Array conf, Array timeStampOracle);
double confCalculator_R2_8_a(double signal);
#endif
