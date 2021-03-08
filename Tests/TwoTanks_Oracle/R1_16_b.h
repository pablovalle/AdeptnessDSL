#ifndef R1_16_B_H
#define R1_16_B_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Tank1Height;
	double Tank1HeightPrev;
	double Tank1CrossSec;
	double TimeIncrement;
	double Tank1PumpFlow;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_R1_16_b(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_16_b(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_16_b(Array conf, Array timeStampOracle);
double confCalculator_R1_16_b(double TimeIncrement,double Tank1PumpFlow,double signal);
#endif
