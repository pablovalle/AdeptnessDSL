#ifndef R1_3D_H
#define R1_3D_H
#include <stdio.h>
#include "Array.h"
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double PhiRef;
	double Tk;
}SensorInput, *SENSOR_INPUT;

int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_R1_3D(int Tk);
Verdict evaluatePostConditions_R1_3D(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_R1_3D(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict_R1_3D(Array conf, Array timeStampOracle);
double confCalculator_R1_3D(double Tk,double signal);
#endif
