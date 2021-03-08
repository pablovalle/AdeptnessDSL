#ifndef R1_1_H
#define R1_1_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Tank1Height;
	double Tank1MaxHeight;
	double Tank1CrossSec;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_R1_1(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_1(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_1(Array conf, Array timeStampOracle);
double confCalculator_R1_1(double Tank1MaxHeight,double Tank1CrossSec,double signal);
#endif
