#include "R1_30.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//EXPLICACION

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
int evaluatePreConditions_R1_30(int Valve_State, int PValveState, int EValveState) {
	return ( Valve_State == 1.0 && PValveState == 0.0 && EValveState == 1.0 ) ;
}
Verdict evaluatePostConditions_R1_30(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R1_30(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array Tank2Height;
	static Array Valve_State;
	static Array PValveState;
	static Array EValveState;
	static Array Tank2HeightPrev;
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
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&Tank2Height,inputs->Tank2Height);
	insertArray(&Valve_State,inputs->Valve_State);
	insertArray(&PValveState,inputs->PValveState);
	insertArray(&EValveState,inputs->EValveState);
	insertArray(&Tank2HeightPrev,inputs->Tank2HeightPrev);
	insertArray(&preconditionGiven,evaluatePreConditions_R1_30(Valve_State.array[cycle], PValveState.array[cycle], EValveState.array[cycle] ));	
	if(preconditionGiven.array[cycle]==1){
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
		insertArray(&conf,confCalculator_R1_30(Tank2HeightPrev.array[cycle], Tank2Height.array[cycle] ));
	}else{
		insertArray(&conf,2);
	}

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R1_30(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R1_30(double Tank2HeightPrev,double signal){
	double conf=0;
	if(signal< Tank2HeightPrev){
		conf= ( Tank2HeightPrev-signal)/( Tank2HeightPrev-(-99999));
	}
	else{
		conf= ( Tank2HeightPrev-signal)/(99999- Tank2HeightPrev);
	}
	return conf;
}
Verdict checkGlobalVerdict_R1_30(Array conf, Array timeStampOracle){
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

