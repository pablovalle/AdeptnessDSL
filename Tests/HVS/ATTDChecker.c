#include "ATTDChecker.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED -1;
//In rage reference signal
int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
Verdict evaluatePostConditions_ATTDChecker(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_ATTDChecker(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    int cycle = -1;
	Array timeStampOracle; 
	Array ATTD;
	Array conf;
	Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&ATTD ,1);
	//Step 2: meter variables en array
	cycle++;
	inserArray(&timeStampOracle,timeStamp);
	inserArray(&ATTD,getCurrentIntValueFromInputs(inputs,"ATTD"));
	
	
	insertArray(&preconditionGiven,2);
	insertArray(&conf,confCalculator(ATTD.array[cycle] ));
	
	
	
	//Step 4: Sacar confidence
	
	//GLOBAL?
	verdict = checkGlobalVerdict(conf, timeStampOracle); 
	
	
    return verdict;
}

double confCalculator(double signal){
	double conf=0;
	if(signal<300.0 && signal>3.0 + (300.0-3.0)/2){
		conf=(300.0-signal)/((300.0-3.0)/2);
	}
	else if(signal>3.0 && signal<3.0 + (300.0-3.0)/2){
		conf=(signal-3.0)/((300.0-3.0)/2);
	}
	else if(signal<3.0){
		conf=(signal-3.0)/(3.0-(-99999));
	}
	else if(signal>300.0){
		conf=(300.0-signal)/(9999-300.0);
	}
	return conf;
}
Verdict checkGlobalVerdict(Array conf, Array timeStampOracle){
	Verdict verdict;
	verdict.verdict=VERDICT_PASSED;
	double times;
	int fail, is, deg,i,time;
	
	i=0;
	for(i=0; i< conf.used; i++){
		if(conf.array[i]< -0.7){
			verdict.verdict=VERDICT_FAILED;
		}
	}
	
	return verdict;
} 
void initArray(Array *a, size_t initialSize) {
    if(a->size==0){
        a->array = malloc(initialSize * sizeof(int));
        a->used = 0;
        a->size = initialSize;
    }
}

void insertArray(Array *a, double element) {
  if (a->used == a->size) {
    a->size *= 2;
    a->array = realloc(a->array, a->size * sizeof(double));
  }
  a->array[a->used++] = element;
}

void freeArray(Array *a) {
  free(a->array);
  a->array = NULL;
  a->used = a->size = 0;
}
