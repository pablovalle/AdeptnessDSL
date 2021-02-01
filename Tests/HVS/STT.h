#ifndef STT_H
#define STT_H
struct Verdict{
	
}VERDICT;
struct SensorInput{
	
}SENSOR_INPUT, *SENSOR_INPUT;
int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_STT(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_STT(SensorInput *inputs, int inputQty, double timeStamp);
double confCalculator(double signal);
#endif
