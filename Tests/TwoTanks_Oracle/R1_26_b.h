#ifndef R1_26_B_H
#define R1_26_B_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Tank2PValveFlow;
	double Tank2EValveFlow;
	double TimeIncrement;
	double Tank2CrossSec;
	double Tank2Height;
	double Tank2HeightPrev;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_R1_26_b(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_26_b(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_26_b(Array conf, Array timeStampOracle);
double confCalculator_R1_26_b(double Tank2CrossSec,double Tank2Height,double Tank2HeightPrev,double signal);
#endif
