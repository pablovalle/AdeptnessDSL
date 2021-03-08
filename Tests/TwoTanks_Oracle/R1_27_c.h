#ifndef R1_27_C_H
#define R1_27_C_H
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
	double Tank2EValveFlow;
	double TimeIncrement;
	double Tank2CrossSec;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_27_c(int Valve_State, int PValveState, int EValveState);
Verdict evaluatePostConditions_R1_27_c(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_27_c(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_27_c(Array conf, Array timeStampOracle);
double confCalculator_R1_27_c(double Tank2HeightPrev,double Tank1ValveFlow,double Tank2EValveFlow,double TimeIncrement,double Tank2CrossSec,double signal);
#endif
