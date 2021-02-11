#include "STT.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//sdf


Verdict evaluatePostConditions_STT(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_STT(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array Energy;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&Energy ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&Energy,inputs->Energy);
	insertArray(&preconditionGiven,2);
	insertArray(&conf,confCalculator_STT(Energy.array[cycle] ));

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_STT(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_STT(double signal){
	double conf=0;
	if(signal<5.0){
		conf= (5.0-signal)/(5.0-(-99999));
	}
	else{
		conf= (5.0-signal)/(99999-5.0);
	}
	return conf;
}
Verdict checkGlobalVerdict_STT(Array conf, Array timeStampOracle){
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
		if(conf.array[i]< -0.3){
			verdict.verdict=VERDICT_FAILED;
		}
	}
	
	return verdict;
} 

