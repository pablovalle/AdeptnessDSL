#ifndef POSICIONPUERTACHECKER_H
#define POSICIONPUERTACHECKER_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double PosicionPuerta;
	double AscensorEnPisoPuerta;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_PosicionPuertaChecker(int AscensorEnPisoPuerta);
Verdict evaluatePostConditions_PosicionPuertaChecker(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_PosicionPuertaChecker(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_PosicionPuertaChecker(Array conf, Array timeStampOracle);
double confCalculator_PosicionPuertaChecker( double signal);
#endif
