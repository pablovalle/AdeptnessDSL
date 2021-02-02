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

	//Step 2: meter variables en array
	cycle++;
	timeStampOracle[cycle] = timeStamp;
	Energy[cycle]=getCurrentIntValueFromInputs(inputs,"Energy");
	
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
	if(preconditionGiven.array[cycle]){
		
		//--During balidn bada, TimeStamp erabili, horretarako timeStamp-a beti ms-tan satru ezkero kalkulatu daiteke zenbat timeStamp behar ditugu honen konfidentzia jakiteko.
		//Adibidea: timeStamp= 2 ms (timeStampOracle[1]-timeStampOracle[0])=timeStamp. IterazioKopurua=During/timeStamp eta horrarte kalkulatu conf-a.
		//if(preconditionGiven[cycle] && during>0) during baldin bada hasieratuta 1-era egongo da, bestela 0-ra. Kasuistika baten during ez bada erabiltzen 1-era hasieratu ta listo.
		
		conf[cycle] = confCalculator(Energy.array[cycle] );//--funcion global y pasarle los valores y referencia a checkear con el tipo de check?
	}else{
		
		conf[cycle] = 2;
	}
	
	//Step 4: Sacar confidence
	
	//GLOBAL?
	verdict = checkGlobalVerdict(conf, timeStampOracle); 
	
	
    return verdict;
}

double confCalculator(double signal){
	double conf=0;

	if(signal<5.0){
		conf= (5.0-signal)/(5.0--99999);
	}
	else(){
		conf= (5.0-signal)/(99999-5.0);
	}
	return conf;
}
Verdict checkGlobalVerdict(Array conf, Array timeStampOracle){
	Verdict verdict;
	verdict.verdict=VERDICT_PASSED;
	double times, time;
	int fail, is, deg,i;
	
	i=0;
	for(i=0; i< conf.used; i++){
		if(conf.array[i]< -0.3){
			verdict.verdict=VERDICT_FAILED;
		}
	}
	
	return verdict;
} 
void initArray(Array *a, size_t initialSize) {
  a->array = malloc(initialSize * sizeof(double));
  a->used = 0;
  a->size = initialSize;
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
