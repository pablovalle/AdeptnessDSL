#include "R1_16_a.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//EXPLICACION

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
Verdict evaluatePostConditions_R1_16_a(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R1_16_a(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array TimeIncrement;
	static Array Tank1ValveFlow;
	static Array Tank1Height;
	static Array Tank1HeightPrev;
	static Array Tank1CrossSec;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&TimeIncrement ,1);
	initArray(&Tank1ValveFlow ,1);
	initArray(&Tank1Height ,1);
	initArray(&Tank1HeightPrev ,1);
	initArray(&Tank1CrossSec ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&TimeIncrement,inputs->TimeIncrement);
	insertArray(&Tank1ValveFlow,inputs->Tank1ValveFlow);
	insertArray(&Tank1Height,inputs->Tank1Height);
	insertArray(&Tank1HeightPrev,inputs->Tank1HeightPrev);
	insertArray(&Tank1CrossSec,inputs->Tank1CrossSec);
	insertArray(&preconditionGiven,2);
	insertArray(&conf,confCalculator_R1_16_a(Tank1Height.array[cycle], Tank1HeightPrev.array[cycle], Tank1CrossSec.array[cycle], ( 0.0- TimeIncrement.array[cycle]* Tank1ValveFlow.array[cycle])  ));

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R1_16_a(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R1_16_a(double Tank1Height,double Tank1HeightPrev,double Tank1CrossSec,double signal){
	double conf=0;
	if(signal< ( ( Tank1Height- Tank1HeightPrev) * Tank1CrossSec) ){
		conf= ( ( ( Tank1Height- Tank1HeightPrev) * Tank1CrossSec) -signal)/( ( ( Tank1Height- Tank1HeightPrev) * Tank1CrossSec) -(-99999));
	}
	else{
		conf= ( ( ( Tank1Height- Tank1HeightPrev) * Tank1CrossSec) -signal)/(99999- ( ( Tank1Height- Tank1HeightPrev) * Tank1CrossSec) );
	}
	return conf;
}
Verdict checkGlobalVerdict_R1_16_a(Array conf, Array timeStampOracle){
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

