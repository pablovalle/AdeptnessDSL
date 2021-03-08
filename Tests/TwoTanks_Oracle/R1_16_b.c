#include "R1_16_b.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//EXPLICACION

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
Verdict evaluatePostConditions_R1_16_b(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R1_16_b(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array Tank1Height;
	static Array Tank1HeightPrev;
	static Array Tank1CrossSec;
	static Array TimeIncrement;
	static Array Tank1PumpFlow;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&Tank1Height ,1);
	initArray(&Tank1HeightPrev ,1);
	initArray(&Tank1CrossSec ,1);
	initArray(&TimeIncrement ,1);
	initArray(&Tank1PumpFlow ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&Tank1Height,inputs->Tank1Height);
	insertArray(&Tank1HeightPrev,inputs->Tank1HeightPrev);
	insertArray(&Tank1CrossSec,inputs->Tank1CrossSec);
	insertArray(&TimeIncrement,inputs->TimeIncrement);
	insertArray(&Tank1PumpFlow,inputs->Tank1PumpFlow);
	insertArray(&preconditionGiven,2);
	insertArray(&conf,confCalculator_R1_16_b(TimeIncrement.array[cycle], Tank1PumpFlow.array[cycle], ( ( Tank1Height.array[cycle]- Tank1HeightPrev.array[cycle]) * Tank1CrossSec.array[cycle])  ));

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R1_16_b(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R1_16_b(double TimeIncrement,double Tank1PumpFlow,double signal){
	double conf=0;
	if(signal< ( TimeIncrement* Tank1PumpFlow) ){
		conf= ( ( TimeIncrement* Tank1PumpFlow) -signal)/( ( TimeIncrement* Tank1PumpFlow) -(-99999));
	}
	else{
		conf= ( ( TimeIncrement* Tank1PumpFlow) -signal)/(99999- ( TimeIncrement* Tank1PumpFlow) );
	}
	return conf;
}
Verdict checkGlobalVerdict_R1_16_b(Array conf, Array timeStampOracle){
	Verdict verdict;
	verdict.verdict=VERDICT_INCONCLUSIVE;
	double times;
	int fail, is, deg,i,time;
	i=0;
	while (i < conf.used && verdict.verdict==2) {
		if (conf.array[i] != 2) {
			verdict.verdict = VERDICT_PASSED;
		}
		i++;
	}
	if (verdict.verdict == 2) {
		return verdict;
	}
	i=0;
	for(i=0; i< conf.used; i++){
		if(conf.array[i]< 0.0){
			verdict.verdict=VERDICT_FAILED;
		}
	}
	
	return verdict;
} 

