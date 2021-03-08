#include "R1_26_b.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//EXPLICACION

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
Verdict evaluatePostConditions_R1_26_b(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R1_26_b(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array Tank2PValveFlow;
	static Array Tank2EValveFlow;
	static Array TimeIncrement;
	static Array Tank2CrossSec;
	static Array Tank2Height;
	static Array Tank2HeightPrev;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&Tank2PValveFlow ,1);
	initArray(&Tank2EValveFlow ,1);
	initArray(&TimeIncrement ,1);
	initArray(&Tank2CrossSec ,1);
	initArray(&Tank2Height ,1);
	initArray(&Tank2HeightPrev ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&Tank2PValveFlow,inputs->Tank2PValveFlow);
	insertArray(&Tank2EValveFlow,inputs->Tank2EValveFlow);
	insertArray(&TimeIncrement,inputs->TimeIncrement);
	insertArray(&Tank2CrossSec,inputs->Tank2CrossSec);
	insertArray(&Tank2Height,inputs->Tank2Height);
	insertArray(&Tank2HeightPrev,inputs->Tank2HeightPrev);
	insertArray(&preconditionGiven,2);
	insertArray(&conf,confCalculator_R1_26_b(Tank2CrossSec.array[cycle], Tank2Height.array[cycle], Tank2HeightPrev.array[cycle], ( -1.0* ( Tank2PValveFlow.array[cycle]+ Tank2EValveFlow.array[cycle]) ) * TimeIncrement.array[cycle] ));

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R1_26_b(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R1_26_b(double Tank2CrossSec,double Tank2Height,double Tank2HeightPrev,double signal){
	double conf=0;
	if(signal< ( Tank2CrossSec* ( Tank2Height- Tank2HeightPrev) ) ){
		conf= ( ( Tank2CrossSec* ( Tank2Height- Tank2HeightPrev) ) -signal)/( ( Tank2CrossSec* ( Tank2Height- Tank2HeightPrev) ) -(-99999));
	}
	else{
		conf= ( ( Tank2CrossSec* ( Tank2Height- Tank2HeightPrev) ) -signal)/(99999- ( Tank2CrossSec* ( Tank2Height- Tank2HeightPrev) ) );
	}
	return conf;
}
Verdict checkGlobalVerdict_R1_26_b(Array conf, Array timeStampOracle){
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
