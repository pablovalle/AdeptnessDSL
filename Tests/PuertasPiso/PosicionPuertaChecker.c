#include "PosicionPuertaChecker.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
//La puerta puede estar cerrada, abierta, cerrándose o abríendose si el ascensor esta en el piso de la puerta

int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
int evaluatePreConditions_PosicionPuertaChecker(int AscensorEnPisoPuerta) {
	return ( AscensorEnPisoPuerta == 0.0 ) ;
}
Verdict evaluatePostConditions_PosicionPuertaChecker(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_PosicionPuertaChecker(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array PosicionPuerta;
	static Array AscensorEnPisoPuerta;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&PosicionPuerta ,1);
	initArray(&AscensorEnPisoPuerta ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&PosicionPuerta,inputs->PosicionPuerta);
	insertArray(&AscensorEnPisoPuerta,inputs->AscensorEnPisoPuerta);
	insertArray(&preconditionGiven,evaluatePreConditions_PosicionPuertaChecker(AscensorEnPisoPuerta.array[cycle] ));	
	if(preconditionGiven.array[cycle]==1){
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
		insertArray(&conf,confCalculator_PosicionPuertaChecker(PosicionPuerta.array[cycle] ));
	}else{
		insertArray(&conf,2);
	}

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict_PosicionPuertaChecker(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
    return verdict;
}

double confCalculator_PosicionPuertaChecker(double signal){
	double conf=0;
	if(signal<1.0 && signal>0.0 + (1.0-0.0)/2){
		conf=(1.0-signal)/((1.0-0.0)/2);
	}
	else if(signal>0.0 && signal<0.0 + (1.0-0.0)/2){
		conf=(signal-0.0)/((1.0-0.0)/2);
	}
	else if(signal<0.0){
		conf=(signal-0.0)/(0.0-(-99999));
	}
	else if(signal>1.0){
		conf=(1.0-signal)/(9999-1.0);
	}
	return conf;
}
Verdict checkGlobalVerdict_PosicionPuertaChecker(Array conf, Array timeStampOracle){
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

