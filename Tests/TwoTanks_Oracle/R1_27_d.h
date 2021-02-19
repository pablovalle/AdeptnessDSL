#ifndef R1_27_D_H
#define R1_27_D_H
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
	double Tank1ValveFlow;
	double TimeIncrement;
	double Tank2CrossSec;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_27_d(int Valve_State, int PValveState, int EValveState);
Verdict evaluatePostConditions_R1_27_d(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_27_d(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_27_d(Array conf, Array timeStampOracle);
double confCalculator_R1_27_d(double Tank2HeightPrev,double Tank1ValveFlow,double TimeIncrement,double Tank2CrossSec,double signal);
#endif
