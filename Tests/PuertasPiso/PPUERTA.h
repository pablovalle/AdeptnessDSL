#ifndef PPUERTA_H
#define PPUERTA_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double PosicionPuerta;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_PPUERTA(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_PPUERTA(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_PPUERTA(Array conf, Array timeStampOracle);
double confCalculator_PPUERTA( double signal);
#endif
