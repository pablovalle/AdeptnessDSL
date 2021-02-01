#include "AWTChecker.h"
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
    Static int cycle = -1;
	Static double[] timeStampOracle; 
	Static int[] AWT;
	Static int[] numLlamadasActivas;
	Static double[] conf;
	Static int[] preconditionGiven;

	//Step 2: meter variables en array
	cycle++;
	timeStampOracle[cycle] = timeStamp;
	AWT[cycle]=getCurrentIntValueFromInputs(inputs,"AWT");
	numLlamadasActivas[cycle]=getCurrentIntValueFromInputs(inputs,"numLlamadasActivas");
	preconditionGiven[cycle] = evaluatePreConditions_AWTChecker(numLlamadasActivas[cycle] );	
	
	//Step 3: Sacar confidence. Si se da la precondicion (when: (Elevator1DoorStatus==1 && Elevator1DoorSensor == 1))
	if(preconditionGiven[cycle]){
		
		//--During balidn bada, TimeStamp erabili, horretarako timeStamp-a beti ms-tan satru ezkero kalkulatu daiteke zenbat timeStamp behar ditugu honen konfidentzia jakiteko.
		//Adibidea: timeStamp= 2 ms (timeStampOracle[1]-timeStampOracle[0])=timeStamp. IterazioKopurua=During/timeStamp eta horrarte kalkulatu conf-a.
		//if(preconditionGiven[cycle] && during>0) during baldin bada hasieratuta 1-era egongo da, bestela 0-ra. Kasuistika baten during ez bada erabiltzen 1-era hasieratu ta listo.
		
		conf[cycle] = confCalculator(AWT[cycle] );//--funcion global y pasarle los valores y referencia a checkear con el tipo de check?
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
	if(signal<80.0 && signal>10.0 + (80.0-10.0)/2){
		conf=(80.0-signal)/((80.0-10.0)/2);
	}
	else if(signal>10.0 && signal<10.0� + (80.0�-10.0)/2){
		conf=(signal-10.0)/((80.0-10.0)/2);
	}
	else if(signal<10.0){
		conf=(signal-10.0)/(10.0--99999);
	}
	else if(signal>80.0){
		conf=(80.0-signal)/(9999-80.0);
	}
	return conf;
}
Verdict checkGlobalVerdict(double[] conf, double[] timeStampOracle){
	Verdict verdict;
	verdict.verdict=VERDICT_PASSED;
	double times, time;
	int fail, is, deg,i;
	
	i=0;
	for(i=0 i< conf.length; i++){
		if(conf[i]< -0.9){
			verdict.verdict=VERDICT_FAILED;
		}
	}
	
	fail =0;
	time=0;
	is=0;
	i=0;
	while(fail==0 && i<conf.length){
		if(conf[i]<-0.2){
			is==1;
		}
		i++;
		time=i;
		while (is==1 && i<conf.length){
			if(conf[i]<-0.2 && timeStampOracle[i] - timeStampOracle[time]>10.0 || timeStampOracle[i] - timeStampOracle[time]>10.0){
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
	while(i<conf.length && fail==0){
		if(conf[i]<-0.2){
			if(time==0){
				time=i;
			}
			times--;
			if(times==0 && timeStampOracle[i] - timeStampOracle[time]< 20.0){
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
