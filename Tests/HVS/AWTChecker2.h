#ifndef AWTCHECKER2_H
#define AWTCHECKER2_H
struct Verdict{
	
}VERDICT;
struct SensorInput{
	
}SENSOR_INPUT, *SENSOR_INPUT;
int preprocessInputs(SensorInput *inputs, int inputQty);
int evaluatePreConditions_AWTChecker2(int numLlamadasActivas, int AWT);
Verdict evaluatePostConditions_AWTChecker2(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_AWTChecker2(SensorInput *inputs, int inputQty, double timeStamp);
double confCalculator(double ATTD,double signal);
#endif
