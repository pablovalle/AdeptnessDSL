#ifndef R2_3_B_H
#define R2_3_B_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Valve_State;
	double Tank1SensorHValue;
	double Tank1SensorLValue;
	double Valve_StatePrev;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R2_3_b(int Tank1SensorHValue, int Tank1SensorLValue);
Verdict evaluatePostConditions_R2_3_b(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2_3_b(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2_3_b(Array conf, Array timeStampOracle);
double confCalculator_R2_3_b(double Valve_StatePrev,double signal);
#endif
