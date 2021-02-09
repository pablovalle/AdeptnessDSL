#ifndef STT_H
#define STT_H
#include <stdio.h>
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double Energy;
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
Verdict evaluatePostConditions_STT(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_STT(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict(Array conf, Array timeStampOracle);
double confCalculator(double signal);
#endif
