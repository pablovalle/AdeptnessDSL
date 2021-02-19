#ifndef R1_20_H
#define R1_20_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Tank1Height;
	double Pump_State;
	double Valve_State;
	double Tank1HeightPrev;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_20(int Pump_State, int Valve_State);
Verdict evaluatePostConditions_R1_20(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_20(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_20(Array conf, Array timeStampOracle);
double confCalculator_R1_20(double Tank1HeightPrev,double signal);
#endif
