#ifndef TOTALMOVEMENTS_H
#define TOTALMOVEMENTS_H
#include <stdio.h>
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double TotalMovements;
}SensorInput, *SENSOR_INPUT;
typedef struct {
  double *array;
  size_t used;
  size_t size;
} Array;
void initArray(Array *a, size_t initialSize);
void insertArray(Array *a, double element);
void freeArray(Array *a);
int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_TotalMovements(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_TotalMovements(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict(Array conf, Array timeStampOracle);
double confCalculator(double signal);
#endif
