#include "AWTChecker.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED -1;
//Checks the AWT is relatively low when there are a medium amount of calls
int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
int evaluatePreConditions_AWTChecker(int numLlamadasActivas) {
	return ( numLlamadasActivas > 11.0 && numLlamadasActivas < 50.0 ) ;
}
Verdict evaluatePostConditions_AWTChecker(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_AWTChecker(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    int cycle = -1;
	Array timeStampOracle; 
	Array AWT;
	Array numLlamadasActivas;
	Array conf;
	Array preconditionGiven;

	//Init arrays
	initArray(&conf,1);
	initArray(&preconditionGiven,1);
	initArray(&timeStampOracle,1);
	initArray(&AWT ,1);
	initArray(&numLlamadasActivas ,1);
	//Step 2: meter variables en array
	cycle++;
	inserArray(&timeStampOracle,timeStamp);
	inserArray(&AWT,getCurrentIntValueFromInputs(inputs,"AWT"));
	inserArray(&numLlamadasActivas,getCurrentIntValueFromInputs(inputs,"numLlamadasActivas"));
	inserArray(&preconditionGiven,evaluatePreConditions_AWTChecker(numLlamadasActivas.array[cycle] ));

	if(preconditionGiven.array[cycle]==1){
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
		insertArray(&conf,confCalculator(AWT.array[cycle] ));
	}else{
		insertArray(&conf,2);
	}
	//Step 4: Sacar confidence
	verdict = checkGlobalVerdict(conf, timeStampOracle); 
    return verdict;
}

double confCalculator(double signal){
	double conf=0;
	if(signal<80.0 && signal>10.0 + (80.0-10.0)/2){
		conf=(80.0-signal)/((80.0-10.0)/2);
	}
	else if(signal>10.0 && signal<10.0 + (80.0-10.0)/2){
		conf=(signal-10.0)/((80.0-10.0)/2);
	}
	else if(signal<10.0){
		conf=(signal-10.0)/(10.0-(-99999));
	}
	else if(signal>80.0){
		conf=(80.0-signal)/(9999-80.0);
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
		if(conf.array[i]< -0.9){
			verdict.verdict=VERDICT_FAILED;
		}
	}
	
	fail =0;
	time=0;
	is=0;
	i=0;
	while(fail==0 && i<conf.used){
		if(conf.array[i]<-0.2){
			is==1;
		}
		i++;
		time=i;
		while (is==1 && i<conf.used){
			if(conf.array[i]<-0.2 && timeStampOracle.array[i] - timeStampOracle.array[time]>10.0 || timeStampOracle.array[i] - timeStampOracle.array[time]>10.0){
				fail=1;
			}
			else{
				is=0;
			}
			i++;
		}
	}
	if(fail==1){
		verdict.verdict=VERDICT_FAILED;	
	}
	
	i=0;
	times=30.0;
	time=0;
	fail=0;;
	while(i<conf.used && fail==0){
		if(conf.array[i]<-0.2){
			if(time==0){
				time=i;
			}
			times--;
			if(times==0 && timeStampOracle.array[i] - timeStampOracle.array[time]< 20.0){
				fail=1;	
			}
			else if(times==0){
				times=0;
			}
		}
		i++;
	}
	if(fail==1){
		verdict.verdict=VERDICT_FAILED;				
	}
	
	return verdict;
} 


//DYNAMIC ARRAY
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
