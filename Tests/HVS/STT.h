#ifndef STT_H
#define STT_H
#include <stdio.h>
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	int a;
}SensorInput, *SENSOR_INPUT;
typedef struct {
  int *array;
  size_t used;
  size_t size;
} Array;
void initArray(Array *a, size_t initialSize);
void insertArray(Array *a, int element);
void freeArray(Array *a);
int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_STT(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_STT(SensorInput *inputs, int inputQty, double timeStamp);
double confCalculator(double signal);
#endif
