#ifndef R2_11_A_H
#define R2_11_A_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double PValveState;
	double Tank2SensorHValue;
	double Tank2SensorMValue;
	double EValveStatePrev;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R2_11_a(int Tank2SensorHValue, int Tank2SensorMValue, int EValveStatePrev);
Verdict evaluatePostConditions_R2_11_a(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2_11_a(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2_11_a(Array conf, Array timeStampOracle);
double confCalculator_R2_11_a(double signal);
#endif
