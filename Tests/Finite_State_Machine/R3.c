#include "R3.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//The autopilot shall change states from TRANSITION to NOMINAL when the system is Supported and sensor data is good.

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
int evaluatePreConditions_R3(int State, int Supported, int good) {
	return ( State == ( -1.0 ) && Supported == 1.0 && good == 1.0 ) ;
}
Verdict evaluatePostConditions_R3(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R3(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array State;
	static Array Supported;
	static Array good;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&State ,1);
	initArray(&Supported ,1);
	initArray(&good ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&State,inputs->State);
	insertArray(&Supported,inputs->Supported);
	insertArray(&good,inputs->good);
	insertArray(&preconditionGiven,evaluatePreConditions_R3(State.array[cycle], Supported.array[cycle], good.array[cycle]));	
	if(preconditionGiven.array[cycle]==1){
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
		insertArray(&conf,confCalculator_R3(State.array[cycle] ));
	}else{
		insertArray(&conf,2);
	}

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R3(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R3(double signal){
	double conf=0;
	if(signal==1.0){
		conf=1;
	}
	else if(signal<1.0){
		conf=(signal-1.0)/(1.0-(-99999));
	}
	else if(signal>1.0){
		conf=(1.0-signal)/(9999-1.0);
	}
	return conf;
}
Verdict checkGlobalVerdict_R3(Array conf, Array timeStampOracle){
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

