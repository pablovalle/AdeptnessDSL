#include "R2_3_a.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//EXPLICACION

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
int evaluatePreConditions_R2_3_a(int Tank1SensorHValue, int Tank1SensorLValue) {
	return ( Tank1SensorHValue == 1.0 && Tank1SensorLValue == 1.0 ) ;
}
Verdict evaluatePostConditions_R2_3_a(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R2_3_a(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array Pump_State;
	static Array Tank1SensorHValue;
	static Array Tank1SensorLValue;
	static Array Pump_StatePrev;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&Pump_State ,1);
	initArray(&Tank1SensorHValue ,1);
	initArray(&Tank1SensorLValue ,1);
	initArray(&Pump_StatePrev ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&Pump_State,inputs->Pump_State);
	insertArray(&Tank1SensorHValue,inputs->Tank1SensorHValue);
	insertArray(&Tank1SensorLValue,inputs->Tank1SensorLValue);
	insertArray(&Pump_StatePrev,inputs->Pump_StatePrev);
	insertArray(&preconditionGiven,evaluatePreConditions_R2_3_a(Tank1SensorHValue.array[cycle], Tank1SensorLValue.array[cycle] ));	
	if(preconditionGiven.array[cycle]==1){
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
		insertArray(&conf,confCalculator_R2_3_a(Pump_StatePrev.array[cycle], Pump_State.array[cycle] ));
	}else{
		insertArray(&conf,2);
	}

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R2_3_a(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R2_3_a(double Pump_StatePrev,double signal){
	double conf=0;
	if(signal== Pump_StatePrev){
		conf=1;
	}
	else if(signal< Pump_StatePrev){
		conf=(signal- Pump_StatePrev)/( Pump_StatePrev-(-99999));
	}
	else if(signal> Pump_StatePrev){
		conf=( Pump_StatePrev-signal)/(9999- Pump_StatePrev);
	}
	return conf;
}
Verdict checkGlobalVerdict_R2_3_a(Array conf, Array timeStampOracle){
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

