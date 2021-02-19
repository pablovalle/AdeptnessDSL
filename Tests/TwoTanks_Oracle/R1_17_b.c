#include "R1_17_b.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//EXPLICACION

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
int evaluatePreConditions_R1_17_b(int Pump_State, int Valve_State) {
	return ( Pump_State == 1.0 && Valve_State == 0.0 ) ;
}
Verdict evaluatePostConditions_R1_17_b(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R1_17_b(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array Tank1Height;
	static Array Pump_State;
	static Array Valve_State;
	static Array Tank1HeightPrev;
	static Array Tank1PumpFlow;
	static Array TimeIncrement;
	static Array Tank1CrossSec;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&Tank1Height ,1);
	initArray(&Pump_State ,1);
	initArray(&Valve_State ,1);
	initArray(&Tank1HeightPrev ,1);
	initArray(&Tank1PumpFlow ,1);
	initArray(&TimeIncrement ,1);
	initArray(&Tank1CrossSec ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&Tank1Height,inputs->Tank1Height);
	insertArray(&Pump_State,inputs->Pump_State);
	insertArray(&Valve_State,inputs->Valve_State);
	insertArray(&Tank1HeightPrev,inputs->Tank1HeightPrev);
	insertArray(&Tank1PumpFlow,inputs->Tank1PumpFlow);
	insertArray(&TimeIncrement,inputs->TimeIncrement);
	insertArray(&Tank1CrossSec,inputs->Tank1CrossSec);
	insertArray(&preconditionGiven,evaluatePreConditions_R1_17_b(Pump_State.array[cycle], Valve_State.array[cycle] ));	
	if(preconditionGiven.array[cycle]==1){
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
		insertArray(&conf,confCalculator_R1_17_b(Tank1HeightPrev.array[cycle], Tank1PumpFlow.array[cycle], TimeIncrement.array[cycle], Tank1CrossSec.array[cycle], Tank1Height.array[cycle] ));
	}else{
		insertArray(&conf,2);
	}

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R1_17_b(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R1_17_b(double Tank1HeightPrev,double Tank1PumpFlow,double TimeIncrement,double Tank1CrossSec,double signal){
	double conf=0;
	if(signal== ( Tank1HeightPrev+ ( Tank1PumpFlow* TimeIncrement/ Tank1CrossSec) ) ){
		conf=1;
	}
	else if(signal< ( Tank1HeightPrev+ ( Tank1PumpFlow* TimeIncrement/ Tank1CrossSec) ) ){
		conf=(signal- ( Tank1HeightPrev+ ( Tank1PumpFlow* TimeIncrement/ Tank1CrossSec) ) )/( ( Tank1HeightPrev+ ( Tank1PumpFlow* TimeIncrement/ Tank1CrossSec) ) -(-99999));
	}
	else if(signal> ( Tank1HeightPrev+ ( Tank1PumpFlow* TimeIncrement/ Tank1CrossSec) ) ){
		conf=( ( Tank1HeightPrev+ ( Tank1PumpFlow* TimeIncrement/ Tank1CrossSec) ) -signal)/(9999- ( Tank1HeightPrev+ ( Tank1PumpFlow* TimeIncrement/ Tank1CrossSec) ) );
	}
	return conf;
}
Verdict checkGlobalVerdict_R1_17_b(Array conf, Array timeStampOracle){
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

