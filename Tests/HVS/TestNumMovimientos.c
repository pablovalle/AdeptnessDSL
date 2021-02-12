#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include "TotalMovements.h"
int main() {
	char str[128];
	SensorInput a = { 1 };
	double TotalMovements[10] = { 6,7,11.5,10,12,15,12.5,17.5,18,22.99 };
	Verdict verdict;
	int emaitza[10];
	double conf[10];
	double timeStamp = 5.0;
	for (int i = 0; i < 10; i++) {
		a.TotalMovements = TotalMovements[i];
		verdict = performEvaluation_TotalMovements(&a, 1, timeStamp*i);
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
