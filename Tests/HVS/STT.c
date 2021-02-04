#include "STT.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED -1;
//sdf
int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
Verdict evaluatePostConditions_STT(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_STT(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    int cycle = -1;
	Array timeStampOracle; 
	Array Energy;
	Array conf;
	Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&Energy ,1);
	//Step 2: meter variables en array
	cycle++;
	inserArray(&timeStampOracle,timeStamp);
	inserArray(&Energy,getCurrentIntValueFromInputs(inputs,"Energy"));
	
	
	insertArray(&preconditionGiven,2);
	insertArray(&conf,confCalculator(Energy.array[cycle] ));
	
	
	
	//Step 4: Sacar confidence
	
	//GLOBAL?
	verdict = checkGlobalVerdict(conf, timeStampOracle); 
	
	
    return verdict;
}

double confCalculator(double signal){
	double conf=0;

	if(signal<5.0){
		conf= (5.0-signal)/(5.0-(-99999));
	}
	else(){
		conf= (5.0-signal)/(99999-5.0);
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
		if(conf.array[i]< -0.3){
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
