#include "R1_3B.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//desc

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
int evaluatePreConditions_R1_3B(int Phi) {
	return ( Phi > 30.0 ) ;
}
Verdict evaluatePostConditions_R1_3B(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R1_3B(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array PhiRef;
	static Array Phi;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&PhiRef ,1);
	initArray(&Phi ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&PhiRef,inputs->PhiRef);
	insertArray(&Phi,inputs->Phi);
	insertArray(&preconditionGiven,evaluatePreConditions_R1_3B(Phi.array[cycle] ));	
	if(preconditionGiven.array[cycle]==1){
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
		insertArray(&conf,confCalculator_R1_3B(PhiRef.array[cycle] ));
	}else{
		insertArray(&conf,2);
	}

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R1_3B(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R1_3B(double signal){
	double conf=0;
	if(signal==30.0){
		conf=1;
	}
	else if(signal<30.0){
		conf=(signal-30.0)/(30.0-(-99999));
	}
	else if(signal>30.0){
		conf=(30.0-signal)/(9999-30.0);
	}
	return conf;
}
Verdict checkGlobalVerdict_R1_3B(Array conf, Array timeStampOracle){
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

