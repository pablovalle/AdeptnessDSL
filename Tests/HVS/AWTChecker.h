#ifndef AWTCHECKER_H
#define AWTCHECKER_H
struct Verdict{
	
}VERDICT;
struct SensorInput{
	
}SENSOR_INPUT, *SENSOR_INPUT;
int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_AWTChecker(int numLlamadasActivas);
Verdict evaluatePostConditions_AWTChecker(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_AWTChecker(SensorInput *inputs, int inputQty, double timeStamp);
double confCalculator( double signal);
#endif
