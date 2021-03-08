#ifndef R1_26_A_H
#define R1_26_A_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Tank1Height;
	double Tank1HeightPrev;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_R1_26_a(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_26_a(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_26_a(Array conf, Array timeStampOracle);
double confCalculator_R1_26_a(double Tank1HeightPrev,double signal);
#endif
