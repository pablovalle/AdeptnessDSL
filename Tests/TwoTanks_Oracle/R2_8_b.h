#ifndef R2_8_B_H
#define R2_8_B_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double EValveState;
	double Tank2SensorLValue;
	double Tank2SensorMValue;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R2_8_b(int Tank2SensorLValue, int Tank2SensorMValue);
Verdict evaluatePostConditions_R2_8_b(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2_8_b(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2_8_b(Array conf, Array timeStampOracle);
double confCalculator_R2_8_b(double signal);
#endif
