#ifndef AWTCHECKER2_H
#define AWTCHECKER2_H
#include <stdio.h>
typedef struct{
	int verdict;
	double confidence;
}Verdict;
typedef struct{
	double AWT;
	double numLlamadasActivas;
	double ATTD;
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
int evaluatePreConditions_AWTChecker2(int numLlamadasActivas, int AWT);
Verdict evaluatePostConditions_AWTChecker2(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_AWTChecker2(SensorInput *inputs, int inputQty, double timeStamp);
Verdict checkGlobalVerdict(Array conf, Array timeStampOracle);
double confCalculator(double ATTD,double signal);
#endif
