#ifndef ATTDCHECKER_H
#define ATTDCHECKER_H
struct Verdict{
	
}VERDICT;
struct SensorInput{
	
}SENSOR_INPUT, *SENSOR_INPUT;
int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_ATTDChecker(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_ATTDChecker(SensorInput *inputs, int inputQty, double timeStamp);
double confCalculator( double signal);
#endif
