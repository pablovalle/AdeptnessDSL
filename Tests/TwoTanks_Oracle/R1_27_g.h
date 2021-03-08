#ifndef R1_27_G_H
#define R1_27_G_H
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
int evaluatePreConditions_R1_27_g(int Valve_State, int PValveState, int EValveState);
Verdict evaluatePostConditions_R1_27_g(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_27_g(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_27_g(Array conf, Array timeStampOracle);
double confCalculator_R1_27_g(double Tank2HeightPrev,double signal);
#endif
