#ifndef R1_16_A_H
#define R1_16_A_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double TimeIncrement;
	double Tank1ValveFlow;
	double Tank1Height;
	double Tank1HeightPrev;
	double Tank1CrossSec;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_R1_16_a(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_16_a(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_16_a(Array conf, Array timeStampOracle);
double confCalculator_R1_16_a(double Tank1Height,double Tank1HeightPrev,double Tank1CrossSec,double signal);
#endif
