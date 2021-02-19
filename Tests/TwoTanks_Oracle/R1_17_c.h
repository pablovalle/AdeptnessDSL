#ifndef R1_17_C_H
#define R1_17_C_H
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
	double Tank1ValveFlow;
	double TimeIncrement;
	double Tank1CrossSec;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_17_c(int Pump_State, int Valve_State);
Verdict evaluatePostConditions_R1_17_c(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_17_c(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_17_c(Array conf, Array timeStampOracle);
double confCalculator_R1_17_c(double Tank1HeightPrev,double Tank1ValveFlow,double TimeIncrement,double Tank1CrossSec,double signal);
#endif
