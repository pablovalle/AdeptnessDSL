#include "TotalMovements.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//Gap reference signal


Verdict evaluatePostConditions_TotalMovements(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_TotalMovements(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array TotalMovements;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&TotalMovements ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&TotalMovements,inputs->TotalMovements);
	insertArray(&preconditionGiven,2);
	insertArray(&conf,confCalculator_TotalMovements(TotalMovements.array[cycle] ));

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_TotalMovements(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_TotalMovements(double signal){
	double conf=0;
	if(signal<200.0 && signal>10.0 + (200.0-10.0)/2){
		conf=(signal-200.0)/((200.0-10.0)/2);
	}
	else if(signal>10.0 && signal<10.0 + (200.0-10.0)/2){
		conf=(10.0-signal)/((200.0-10.0)/2);
	}
	else if(signal<10.0){
		conf=(10.0-signal)/(10.0-(-99999));
	}
	else if(signal>200.0){
		conf=(signal-200.0)/(9999-200.0);
	}
	return conf;
}
Verdict checkGlobalVerdict_TotalMovements(Array conf, Array timeStampOracle){
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
	fail =0;
	time=0;
	is=0;
	i=0;
	while(fail==0 && i<conf.used){
		if(conf.array[i]<-0.3){
			is==1;
		}
		i++;
		time=i;
		while (is==1 && i<conf.used){
			if(conf.array[i]<-0.3 && timeStampOracle.array[i] - timeStampOracle.array[time]>20.0 || timeStampOracle.array[i] - timeStampOracle.array[time]>20.0){
				fail=1;
			}
			else{
				is=0;
			}
			i++;
		}
	}
	if(fail==1){
		verdict.verdict=VERDICT_FAILED;	
	}
	
	i=0;
	for(i=0; i< conf.used; i++){
		if(conf.array[i]< -0.5){
			verdict.verdict=VERDICT_FAILED;
		}
	}
	
	return verdict;
} 

