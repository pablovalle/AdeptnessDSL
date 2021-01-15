Verdict checkGlobalVerdict(double[] conf, double refValue,int type, double timeStamps,double times){
	Verdict verdict;
	verdic.verdic=VERDICT_PASSED;
	int i=0;
	switch(type){
		case 0:
			for(i=0 i< conf.length; i++){
				if(conf[i]< refValue){
					verdict.verdict=VERDICT_FAILED;
				}
			}
			break;
		case 1:
		int times=timeStamps;
			while(times!=0 && i<conf.length){
				if(conf[i]<refValue){
					a=true;
				}
				while(a && i<conf.length && times!=0){
					if(conf[i]>refValue){
						b=true;
						a=false;
					}
					i++;
				}
				if(b && times!=0){
					i--;
					times=timeStamps;
				}
				i++;
			}
			if(times==0){
				verdict.verdict=VERDICT_FAILED;
			}
			break;
		case 2:
			while(times!=0 && i<conf.length){
				if(conf[i]<refValue){
					
					times--;
				}
				i++;
			}
			if(times==0 && i<=timeStamps){
				verdict.verdict=VERDICT_FAILED;				
			}
			break;
		case 3:
			while(!deg false && i<conf.length){
				if(conf[i]<refValue){
					deg=true;
				}
				i++
			}				
			while(deg && i<conf.length){
				if(conf[i]>refValue){
					deg=false;
				}
				i++;
			}
			if(i==conf.length && deg){
				verdict.verdict=VERDICT_FAILED;	
			}
			break;
		default : 
			verdict.verdict=VERDICT_FAILED;	
			break;
		
	}
	
	
	
	return verdict;
}
//0 highPeak, 1 high time, 2 times in time, 3 constant degradation