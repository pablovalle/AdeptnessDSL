#ifndef R1_29_H
#define R1_29_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Tank2Height;
	double Valve_State;
	double PValveState;
	double EValveState;
	double Tank2HeightPrev;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_29(int Valve_State, int PValveState, int EValveState);
Verdict evaluatePostConditions_R1_29(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_29(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_29(Array conf, Array timeStampOracle);
double confCalculator_R1_29(double Tank2HeightPrev,double signal);
#endif
