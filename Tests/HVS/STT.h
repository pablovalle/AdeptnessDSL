#ifndef STT_H
#define STT_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Energy;
}SensorInput, *SENSOR_INPUT;

Verdict evaluatePostConditions_STT(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_STT(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_STT(Array conf, Array timeStampOracle);
double confCalculator_STT(double signal);
#endif
