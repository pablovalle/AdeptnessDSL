#ifndef ATTDCHECKER_H
#define ATTDCHECKER_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double ATTD;
}SensorInput, *SENSOR_INPUT;

Verdict evaluatePostConditions_ATTDChecker(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_ATTDChecker(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_ATTDChecker(Array conf, Array timeStampOracle);
double confCalculator_ATTDChecker( double signal);
#endif
