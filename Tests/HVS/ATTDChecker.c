#include "ATTDChecker.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED 0;
#define VERDICT_INCONCLUSIVE 2;
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
    static int cycle = -1;
	static Array timeStampOracle; 
	static Array ATTD;
	static Array conf;
	static Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&ATTD ,1);
	//Step 2: meter variables en array
	cycle++;
	insertArray(&timeStampOracle,timeStamp);
	insertArray(&ATTD,inputs->ATTD);
	insertArray(&preconditionGiven,2);
	insertArray(&conf,confCalculator(ATTD.array[cycle] ));

	//Step 4: Sacar confidence

	verdict = checkGlobalVerdict(conf, timeStampOracle); 
	verdict.confidence=conf.array[cycle];
	
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
		if(conf.array[i]< -0.7){
			verdict.verdict=VERDICT_FAILED;
		}
	}
	
	return verdict;
} 
void initArray(Array *a, size_t initialSize) {
    if(a->size==a->used){
        a->array = malloc(initialSize * sizeof(double));
        a->used = 0;
        a->size = initialSize;
    }
}

void insertArray(Array *a, double element) {
	a->array[a->used++] = element;
	if (a->used == a->size) {
    	a->size *= 2;
    	a->array = realloc(a->array, a->size * sizeof(double));
	}
	
}

void freeArray(Array *a) {
	free(a->array);
	a->array = NULL;
	a->used = a->size = 0;
}