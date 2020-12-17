#ifndef R1_H
#define R1_H
struct Ret{
	int assert;
	double diff;
};
struct Ret R1 (double Pullup[], double Standby[],double Apfail[],double Supported[],double Limits[], double timeStamp[]);

#endif
