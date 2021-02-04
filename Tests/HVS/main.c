#include <stdio.h>
#include <stdlib.h>
typedef struct {
  int *array;
  size_t used;
  size_t size;
} Array;
void initArray(Array *a, size_t initialSize);
void insertArray(Array *a, int element);
void freeArray(Array *a);
void doSomething(int i);
static int cont=1;
int main(){
    int age;
    
    for(int i=0; i<4; i++){
        doSomething(i);
    }
    
    return 0;

}
void doSomething(int i){
    static Array lista;

    initArray(&lista,1);
    
    for(int j=0; j<i; j++){
        insertArray(&lista,cont);
        cont++;
    }
    if(i==3){
        for(int j=0; j<lista.used; j++){
            printf("\n%d",lista.array[j]);
        }
    }
    
}
void initArray(Array *a, size_t initialSize) {
    if(a->size==0){
        a->array = malloc(initialSize * sizeof(int));
        a->used = 0;
        a->size = initialSize;
    }
   
}

void insertArray(Array *a, int element) {
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