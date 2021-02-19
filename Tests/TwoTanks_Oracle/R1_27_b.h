#ifndef R1_27_B_H
#define R1_27_B_H
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
	double Tank2PValveFlow;
	double TimeIncrement;
	double Tank2CrossSec;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_27_b(int Valve_State, int PValveState, int EValveState);
Verdict evaluatePostConditions_R1_27_b(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_27_b(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_27_b(Array conf, Array timeStampOracle);
double confCalculator_R1_27_b(double Tank2HeightPrev,double Tank1ValveFlow,double Tank2PValveFlow,double TimeIncrement,double Tank2CrossSec,double signal);
#endif
