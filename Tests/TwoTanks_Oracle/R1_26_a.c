#include "R1_26_a.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//EXPLICACION

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
Verdict evaluatePostConditions_R1_26_a(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R1_26_a(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array Tank1Height;
	static Array Tank1HeightPrev;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&Tank1Height ,1);
	initArray(&Tank1HeightPrev ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&Tank1Height,inputs->Tank1Height);
	insertArray(&Tank1HeightPrev,inputs->Tank1HeightPrev);
	insertArray(&preconditionGiven,2);
	insertArray(&conf,confCalculator_R1_26_a(Tank1HeightPrev.array[cycle], Tank1Height.array[cycle] ));

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R1_26_a(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R1_26_a(double Tank1HeightPrev,double signal){
	double conf=0;
	if(signal== Tank1HeightPrev){
		conf=1;
	}
	else if(signal< Tank1HeightPrev){
		conf=(signal- Tank1HeightPrev)/( Tank1HeightPrev-(-99999));
	}
	else if(signal> Tank1HeightPrev){
		conf=( Tank1HeightPrev-signal)/(9999- Tank1HeightPrev);
	}
	return conf;
}
Verdict checkGlobalVerdict_R1_26_a(Array conf, Array timeStampOracle){
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

