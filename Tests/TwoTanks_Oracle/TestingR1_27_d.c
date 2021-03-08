#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include "R1_27_d.h"
int main(){
	char str[128];
    SensorInput a={1,2,3,4,5,6,7,8};
    double Tank2Height[10]={0.033333333,3.1,5.4,10.8,15.025,10.9,17.4,11.46,13.3,9.92};
    double Valve_State[10]={6,6,9,7,8,10,6,10,10,14};
	double PValveState[10] = { 6,6,9,7,8,10,6,10,10,14 };
	double EValveState[10] = { 6,6,9,7,8,10,6,10,10,14 };
	double Tank2HeightPrev[10] = { 6,6,9,7,8,10,6,10,10,14 };
	double Tank1ValveFlow[10] = { 6,6,9,7,8,10,6,10,10,14 };
	double TimeIncrement[10] = { 6,6,9,7,8,10,6,10,10,14 };
	double Tank2CrossSec[10] = { 6,6,9,7,8,10,6,10,10,14 };
    Verdict verdict;
    int emaitza[10];
    double conf[10];
    double timeStamp=5.0;
    for(int i=0; i<10; i++){
        a.Tank2Height = Tank2Height[i];
        a.Valve_State = Valve_State[i];
		a.PValveState = PValveState[i];
		a.EValveState = EValveState[i];
		a.Tank2HeightPrev = Tank2HeightPrev[i];
		a.Tank1ValveFlow = Tank1ValveFlow[i];
		a.TimeIncrement = TimeIncrement[i];
		a.Tank2CrossSec = Tank2CrossSec[i];
        verdict=performEvaluation_R1_27_d(&a,1,timeStamp*i);
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
