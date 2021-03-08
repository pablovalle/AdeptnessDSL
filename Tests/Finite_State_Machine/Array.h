#ifndef ARRAY_H
#define ARRAY_H
#include <stdio.h>
typedef struct {
	double *array;
	size_t used;
	size_t size;
} Array;
void initArray(Array *a, size_t initialSize);
void insertArray(Array *a, double element);
void freeArray(Array *a);

#endif