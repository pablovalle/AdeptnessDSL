#include "AWTChecker2.h"
#define VERDICT_PASSED 1;
#define VERDICT_FAILED -1;
//Checks the AWT is relatively low when there are few calls
int preprocessInputs(SensorInput *inputs, int inputQty) {
	//TODO.
    return inputQty;
}
int evaluatePreConditions_AWTChecker2(int numLlamadasActivas, int AWT) {
	return ( ( numLlamadasActivas - AWT ) < 10.0 ) ;
}
Verdict evaluatePostConditions_AWTChecker2(Verdict verdict, SensorInput *inputs, int inputQty) {
    verdict.verdict = VERDICT_PASSED;
    verdict.confidence = 1;
    return verdict;
}
Verdict performEvaluation_AWTChecker2(SensorInput *inputs, int inputQty, double timeStamp){
    Verdict verdict;
	//Step 1: inicializacion
    int cycle = -1;
	Array timeStampOracle; 
	Array AWT;
	Array numLlamadasActivas;
	Array ATTD;
	Array conf;
	Array preconditionGiven;

	//Step 2: meter variables en array
	cycle++;
	timeStampOracle[cycle] = timeStamp;
	AWT[cycle]=getCurrentIntValueFromInputs(inputs,"AWT");
	numLlamadasActivas[cycle]=getCurrentIntValueFromInputs(inputs,"numLlamadasActivas");
	ATTD[cycle]=getCurrentIntValueFromInputs(inputs,"ATTD");
	preconditionGiven[cycle] = evaluatePreConditions_AWTChecker2(numLlamadasActivas[cycle], AWT[cycle] );	
	
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
	if(preconditionGiven.array[cycle]){
		
		//--During balidn bada, TimeStamp erabili, horretarako timeStamp-a beti ms-tan satru ezkero kalkulatu daiteke zenbat timeStamp behar ditugu honen konfidentzia jakiteko.
		//Adibidea: timeStamp= 2 ms (timeStampOracle[1]-timeStampOracle[0])=timeStamp. IterazioKopurua=During/timeStamp eta horrarte kalkulatu conf-a.
		//if(preconditionGiven[cycle] && during>0) during baldin bada hasieratuta 1-era egongo da, bestela 0-ra. Kasuistika baten during ez bada erabiltzen 1-era hasieratu ta listo.
		
		conf[cycle] = confCalculator(ATTD.array[cycle], ( AWT.array[cycle]- 10.0)  );//--funcion global y pasarle los valores y referencia a checkear con el tipo de check?
	}else{
		
		conf[cycle] = 2;
	}
	
	//Step 4: Sacar confidence
	
	//GLOBAL?
	verdict = checkGlobalVerdict(conf, timeStampOracle); 
	
	
    return verdict;
}

double confCalculator(double ATTD,double signal){
	double conf=0;

	if(signal< ( ATTD+ 10.0) ){
		conf= ( ( ATTD+ 10.0) -signal)/( ( ATTD.array[cycle]+ 10.0) --99999);
	}
	else(){
		conf= ( ( ATTD+ 10.0) -signal)/(99999- ( ATTD.array[cycle]+ 10.0) );
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
	fial=0;;
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
