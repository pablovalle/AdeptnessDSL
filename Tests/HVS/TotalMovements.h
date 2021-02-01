#ifndef TOTALMOVEMENTS_H
#define TOTALMOVEMENTS_H
struct Verdict{
	
}VERDICT;
struct SensorInput{
	
}SENSOR_INPUT, *SENSOR_INPUT;
int preprocessInputs(SensorInput *inputs, int inputQty);
Verdict evaluatePostConditions_TotalMovements(Verdict verdict, SensorInput *inputs, int inputQty);
Verdict performEvaluation_TotalMovements(SensorInput *inputs, int inputQty, double timeStamp);
double confCalculator(double signal);
#endif
