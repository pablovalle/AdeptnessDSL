#include "R1_7.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//desc

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
Verdict evaluatePostConditions_R1_7(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R1_7(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array AilCmd;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&AilCmd ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&AilCmd,inputs->AilCmd);
	insertArray(&preconditionGiven,2);
	insertArray(&conf,confCalculator_R1_7(AilCmd.array[cycle] ));

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R1_7(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R1_7(double signal){
	double conf=0;
	if(signal<1.0 && signal>-15.0 + (1.0-(-15.0))/2){
		conf=(1.0-signal)/((1.0- (-15.0))/2);
	}
	else if(signal>-15.0 && signal<-15.0 + (1.0- (-15.0))/2){
		conf=(signal- (-15.0))/((1.0- (-15.0))/2);
	}
	else if(signal<-15.0){
		conf=(signal- (-15.0))/(-15.0-(-99999));
	}
	else if(signal>1.0){
		conf=(1.0-signal)/(9999-1.0);
	}
	return conf;
}
Verdict checkGlobalVerdict_R1_7(Array conf, Array timeStampOracle){
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

