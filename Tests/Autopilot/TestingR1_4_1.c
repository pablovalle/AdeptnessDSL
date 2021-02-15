#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include "R1_4_1.h"
int main(){
	char str[128];
    SensorInput a={1,2};
    double Phi[10]={0.033333333,3.1,5.4,10.8,15.025,10.9,17.4,11.46,13.3,9.92};
    double PhiRef[10]={6,6,9,7,8,10,6,10,10,14};
    Verdict verdict;
    int emaitza[10];
    double conf[10];
    double timeStamp=5.0;
    for(int i=0; i<10; i++){
        a.Phi = Phi[i];
        a.PhiRef = PhiRef[i];
        verdict=performEvaluation_R1_4_1(&a,1,timeStamp*i);
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
