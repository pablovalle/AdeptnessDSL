#ifndef R1_17_D_H
#define R1_17_D_H
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
int evaluatePreConditions_R1_17_d(int Pump_State, int Valve_State);
Verdict evaluatePostConditions_R1_17_d(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_17_d(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_17_d(Array conf, Array timeStampOracle);
double confCalculator_R1_17_d(double Tank1HeightPrev,double signal);
#endif
