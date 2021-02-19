#include "R1_27_f.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//EXPLICACION

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
int evaluatePreConditions_R1_27_f(int Valve_State, int PValveState, int EValveState) {
	return ( Valve_State == 0.0 && PValveState == 0.0 && EValveState == 1.0 ) ;
}
Verdict evaluatePostConditions_R1_27_f(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R1_27_f(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array Tank2Height;
	static Array Valve_State;
	static Array PValveState;
	static Array EValveState;
	static Array Tank2HeightPrev;
	static Array Tank2EValveFlow;
	static Array TimeIncrement;
	static Array Tank2CrossSec;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&Tank2Height ,1);
	initArray(&Valve_State ,1);
	initArray(&PValveState ,1);
	initArray(&EValveState ,1);
	initArray(&Tank2HeightPrev ,1);
	initArray(&Tank2EValveFlow ,1);
	initArray(&TimeIncrement ,1);
	initArray(&Tank2CrossSec ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&Tank2Height,inputs->Tank2Height);
	insertArray(&Valve_State,inputs->Valve_State);
	insertArray(&PValveState,inputs->PValveState);
	insertArray(&EValveState,inputs->EValveState);
	insertArray(&Tank2HeightPrev,inputs->Tank2HeightPrev);
	insertArray(&Tank2EValveFlow,inputs->Tank2EValveFlow);
	insertArray(&TimeIncrement,inputs->TimeIncrement);
	insertArray(&Tank2CrossSec,inputs->Tank2CrossSec);
	insertArray(&preconditionGiven,evaluatePreConditions_R1_27_f(Valve_State.array[cycle], PValveState.array[cycle], EValveState.array[cycle] ));	
	if(preconditionGiven.array[cycle]==1){
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
		insertArray(&conf,confCalculator_R1_27_f(Tank2HeightPrev.array[cycle], Tank2EValveFlow.array[cycle], TimeIncrement.array[cycle], Tank2CrossSec.array[cycle], Tank2Height.array[cycle] ));
	}else{
		insertArray(&conf,2);
	}

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R1_27_f(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R1_27_f(double Tank2HeightPrev,double Tank2EValveFlow,double TimeIncrement,double Tank2CrossSec,double signal){
	double conf=0;
	if(signal== ( Tank2HeightPrev+ ( ( ( ( 0.0- 1.0* Tank2EValveFlow) ) * TimeIncrement) / Tank2CrossSec) ) ){
		conf=1;
	}
	else if(signal< ( Tank2HeightPrev+ ( ( ( ( 0.0- 1.0* Tank2EValveFlow) ) * TimeIncrement) / Tank2CrossSec) ) ){
		conf=(signal- ( Tank2HeightPrev+ ( ( ( ( 0.0- 1.0* Tank2EValveFlow) ) * TimeIncrement) / Tank2CrossSec) ) )/( ( Tank2HeightPrev+ ( ( ( ( 0.0- 1.0* Tank2EValveFlow) ) * TimeIncrement) / Tank2CrossSec) ) -(-99999));
	}
	else if(signal> ( Tank2HeightPrev+ ( ( ( ( 0.0- 1.0* Tank2EValveFlow) ) * TimeIncrement) / Tank2CrossSec) ) ){
		conf=( ( Tank2HeightPrev+ ( ( ( ( 0.0- 1.0* Tank2EValveFlow) ) * TimeIncrement) / Tank2CrossSec) ) -signal)/(9999- ( Tank2HeightPrev+ ( ( ( ( 0.0- 1.0* Tank2EValveFlow) ) * TimeIncrement) / Tank2CrossSec) ) );
	}
	return conf;
}
Verdict checkGlobalVerdict_R1_27_f(Array conf, Array timeStampOracle){
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

