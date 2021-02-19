#ifndef POSICIONPUERTACHECKER2_H
#define POSICIONPUERTACHECKER2_H
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
int evaluatePreConditions_PosicionPuertaChecker2(int AscensorEnPisoPuerta);
Verdict evaluatePostConditions_PosicionPuertaChecker2(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_PosicionPuertaChecker2(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_PosicionPuertaChecker2(Array conf, Array timeStampOracle);
double confCalculator_PosicionPuertaChecker2( double signal);
#endif
