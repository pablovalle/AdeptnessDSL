#include "R6.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//The autopilot shall change states from MANEUVER to STANDBY when the pilot is in control (Standby) and sensor data is good

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
int evaluatePreConditions_R6(int State, int good, int Standby) {
	return ( State == 2.0 && good == 1.0 && Standby == 1.0 ) ;
}
Verdict evaluatePostConditions_R6(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R6(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array State;
	static Array good;
	static Array Standby;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&State ,1);
	initArray(&good ,1);
	initArray(&Standby ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&State,inputs->State);
	insertArray(&good,inputs->good);
	insertArray(&Standby,inputs->Standby);
	insertArray(&preconditionGiven,evaluatePreConditions_R6(State.array[cycle], good.array[cycle], Standby.array[cycle]));	
	if(preconditionGiven.array[cycle]==1){
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
		insertArray(&conf,confCalculator_R6(State.array[cycle] ));
	}else{
		insertArray(&conf,2);
	}

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R6(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R6(double signal){
	double conf=0;
	if(signal==3.0){
		conf=1;
	}
	else if(signal<3.0){
		conf=(signal-3.0)/(3.0-(-99999));
	}
	else if(signal>3.0){
		conf=(3.0-signal)/(9999-3.0);
	}
	return conf;
}
Verdict checkGlobalVerdict_R6(Array conf, Array timeStampOracle){
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

