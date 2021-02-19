#ifndef R1_26_C_H
#define R1_26_C_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Tank2CrossSec;
	double Tank2Height;
	double Tank2HeightPrev;
	double TimeIncrement;
	double Tank1ValveFlow;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_R1_26_c(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_26_c(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_26_c(Array conf, Array timeStampOracle);
double confCalculator_R1_26_c(double TimeIncrement,double Tank1ValveFlow,double signal);
#endif
