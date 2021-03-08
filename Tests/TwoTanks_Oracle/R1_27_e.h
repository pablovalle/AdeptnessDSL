#ifndef R1_27_E_H
#define R1_27_E_H
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
	double Tank2PValveFlow;
	double Tank2EValveFlow;
	double TimeIncrement;
	double Tank2CrossSec;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_27_e(int Valve_State, int PValveState, int EValveState);
Verdict evaluatePostConditions_R1_27_e(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_27_e(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_27_e(Array conf, Array timeStampOracle);
double confCalculator_R1_27_e(double Tank2HeightPrev,double Tank2PValveFlow,double Tank2EValveFlow,double TimeIncrement,double Tank2CrossSec,double signal);
#endif
