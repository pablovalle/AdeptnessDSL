#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include "ATTDChecker.h"
int main() {
	char str[128];
	SensorInput a = { 1};
	double ATTD[10] = { 57.483,43.48,46.04,70.50,67.65,74.2,61.55,61.18,66.94,71.14 };
	Verdict verdict;
	int emaitza[10];
	double conf[10];
	double timeStamp = 5.0;
	for (int i = 0; i < 10; i++) {
		a.ATTD = ATTD[i];
		verdict = performEvaluation_ATTDChecker(&a, 1, timeStamp*i);
		emaitza[i] = verdict.verdict;
		conf[i] = verdict.confidence;
	}
	for (int i = 0; i < 10; i++) {
		printf("%d testaren verdict ondorengoa da, %d, eta confidence balioa hauxe da: %f\n", i, emaitza[i], conf[i]);
	}

	printf("\n\nSakatu return amaitzeko");
	fgets(str, 128, stdin);
	return 0;
}
