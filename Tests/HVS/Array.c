#include "Array.h"
void initArray(Array *a, size_t initialSize) {
	if (a->size == a->used) {
		a->array = malloc(initialSize * sizeof(double));
		a->used = 0;
		a->size = initialSize;
	}
}

void insertArray(Array *a, double element) {
	a->array[a->used++] = element;
	if (a->used == a->size) {
		a->size *= 2;
		a->array = realloc(a->array, a->size * sizeof(double));
	}

}

void freeArray(Array *a) {
	free(a->array);
	a->array = NULL;
	a->used = a->size = 0;
}