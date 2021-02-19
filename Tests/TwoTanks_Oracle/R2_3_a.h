#ifndef R2_3_A_H
#define R2_3_A_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Pump_State;
	double Tank1SensorHValue;
	double Tank1SensorLValue;
	double Pump_StatePrev;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R2_3_a(int Tank1SensorHValue, int Tank1SensorLValue);
Verdict evaluatePostConditions_R2_3_a(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R2_3_a(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R2_3_a(Array conf, Array timeStampOracle);
double confCalculator_R2_3_a(double Pump_StatePrev,double signal);
#endif
