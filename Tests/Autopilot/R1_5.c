#include "R1_5.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//desc

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
int evaluatePreConditions_R1_5(int Tk, int TkPrev) {
	return ( Tk - TkPrev >= 30.0 ) ;
}
Verdict evaluatePostConditions_R1_5(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_R1_5(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array P;
	static Array Tk;
	static Array TkPrev;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&P ,1);
	initArray(&Tk ,1);
	initArray(&TkPrev ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&P,inputs->P);
	insertArray(&Tk,inputs->Tk);
	insertArray(&TkPrev,inputs->TkPrev);
	insertArray(&preconditionGiven,evaluatePreConditions_R1_5(Tk.array[cycle], TkPrev.array[cycle] ));	
	if(preconditionGiven.array[cycle]==1){
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
		insertArray(&conf,confCalculator_R1_5(P.array[cycle] ));
	}else{
		insertArray(&conf,2);
	}

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_R1_5(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_R1_5(double signal){
	double conf=0;
	if(signal<6.6 && signal>-6.6 + (6.6-(-6.6))/2){
		conf=(6.6-signal)/((6.6- (-6.6))/2);
	}
	else if(signal>-6.6 && signal<-6.6 + (6.6- (-6.6))/2){
		conf=(signal- (-6.6))/((6.6- (-6.6))/2);
	}
	else if(signal<-6.6){
		conf=(signal- (-6.6))/(-6.6-(-99999));
	}
	else if(signal>6.6){
		conf=(6.6-signal)/(9999-6.6);
	}
	return conf;
}
Verdict checkGlobalVerdict_R1_5(Array conf, Array timeStampOracle){
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

