#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include "R1_18.h"
int main(){
	char str[128];
    SensorInput a={1,2,3,4};
    double Tank1Height[10]={0.033333333,3.1,5.4,10.8,15.025,10.9,17.4,11.46,13.3,9.92};
    double Pump_State[10]={6,6,9,7,8,10,6,10,10,14};
	double Valve_State[10] = { 6,6,9,7,8,10,6,10,10,14 };
	double Tank1HeightPrev[10] = { 6,6,9,7,8,10,6,10,10,14 };
    Verdict verdict;
    int emaitza[10];
    double conf[10];
    double timeStamp=5.0;
    for(int i=0; i<10; i++){
        a.Tank1Height = Tank1Height[i];
        a.Pump_State = Pump_State[i];
		a.Valve_State = Valve_State[i];
		a.Tank1HeightPrev = Tank1HeightPrev[i];
        verdict=performEvaluation_R1_18(&a,1,timeStamp*i);
        emaitza[i]=verdict.verdict;
        conf[i]=verdict.confidence;
    }
	for (int i = 0; i < 10; i++) {
		printf("%d testaren verdict ondorengoa da, %d, eta confidence balioa hauxe da: %f\n", i, emaitza[i], conf[i]);
	}
	
	printf("\n\nSakatu return amaitzeko");
	fgets(str, 128, stdin);
    return 0;
}
