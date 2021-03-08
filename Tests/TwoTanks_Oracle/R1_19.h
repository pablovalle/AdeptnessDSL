#ifndef R1_19_H
#define R1_19_H
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
int evaluatePreConditions_R1_19(int Pump_State, int Valve_State);
Verdict evaluatePostConditions_R1_19(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_19(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_19(Array conf, Array timeStampOracle);
double confCalculator_R1_19(double Tank1HeightPrev,double signal);
#endif
