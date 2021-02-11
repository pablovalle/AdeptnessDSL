#ifndef TOTALMOVEMENTS_H
#define TOTALMOVEMENTS_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double TotalMovements;
}SensorInput, *SENSOR_INPUT;

Verdict evaluatePostConditions_TotalMovements(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_TotalMovements(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_TotalMovements(Array conf, Array timeStampOracle);
double confCalculator_TotalMovements(double signal);
#endif
