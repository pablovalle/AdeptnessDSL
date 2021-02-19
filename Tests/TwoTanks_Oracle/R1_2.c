#include "R1_2.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//EXPLICACION

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
Verdict evaluatePostConditions_R1_2(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R1_2(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array Tank2Height;
	static Array Tank2MaxHeight;
	static Array Tank2CrossSec;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&Tank2Height ,1);
	initArray(&Tank2MaxHeight ,1);
	initArray(&Tank2CrossSec ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&Tank2Height,inputs->Tank2Height);
	insertArray(&Tank2MaxHeight,inputs->Tank2MaxHeight);
	insertArray(&Tank2CrossSec,inputs->Tank2CrossSec);
	insertArray(&preconditionGiven,2);
	insertArray(&conf,confCalculator_R1_2(Tank2MaxHeight.array[cycle], Tank2CrossSec.array[cycle], Tank2Height.array[cycle] ));

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R1_2(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R1_2(double Tank2MaxHeight,double Tank2CrossSec,double signal){
	double conf=0;
	if(signal< ( Tank2MaxHeight* Tank2CrossSec) ){
		conf= ( ( Tank2MaxHeight* Tank2CrossSec) -signal)/( ( Tank2MaxHeight* Tank2CrossSec) -(-99999));
	}
	else{
		conf= ( ( Tank2MaxHeight* Tank2CrossSec) -signal)/(99999- ( Tank2MaxHeight* Tank2CrossSec) );
	}
	return conf;
}
Verdict checkGlobalVerdict_R1_2(Array conf, Array timeStampOracle){
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

