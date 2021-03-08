#ifndef R2_11_B_H
#define R2_11_B_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double EValveState;
	double Tank2SensorHValue;
	double Tank2SensorMValue;
	double EValveStatePrev;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R2_11_b(int Tank2SensorHValue, int Tank2SensorMValue, int EValveStatePrev);
Verdict evaluatePostConditions_R2_11_b(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2_11_b(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2_11_b(Array conf, Array timeStampOracle);
double confCalculator_R2_11_b(double signal);
#endif
