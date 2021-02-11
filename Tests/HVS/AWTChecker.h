#ifndef AWTCHECKER_H
#define AWTCHECKER_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double AWT;
	double numLlamadasActivas;
}SensorInput, *SENSOR_INPUT;


int evaluatePreConditions_AWTChecker(int numLlamadasActivas);
Verdict evaluatePostConditions_AWTChecker(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_AWTChecker(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_AWTChecker(Array conf, Array timeStampOracle);
double confCalculator_AWTChecker( double signal);
#endif
