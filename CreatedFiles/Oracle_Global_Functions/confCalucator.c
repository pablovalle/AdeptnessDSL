
double confCalculator(double sign, double maxRef, double minRef, double maxSignal, double minSignal, int type){
	double conf=0;
	switch(type){
		case 0: 
			if(sign<maxRef){
				conf= (maxRef-sign)/(maxRef-minSignal);
			}
			else(){
				conf= (maxRef-sign)/(maxSignal-maxRef);
			}
			break;
		case 1:
			if(sign>ref){
				conf=(sign-minRef)/(maxSignal-minRef);
			}
			else(){
				conf=(sign-minRef)/(minRef-minSignal);
			}
			break;
		case 2:
			if(sign<maxRef && sign>minRef + (maxRef-minRef)/2){
				conf=(maxRef-sign)/((maxRef-minRef)/2);
			}
			else if(sign>minRef && sign<minRef + (maxRef-minRef)/2){
				conf=(sign-minRef)/((maxRef-minRef)/2);
			}
			else if(sign<minRef){
				conf=(sign-minRef)/(minRef-minSignal);
			}
			else if(sign>maxRef){
				conf=(maxRef-sign)/(maxSignal-maxRef);
			}

			break;
		case 3: 
			if(sign<maxRef && sign>minRef + (maxRef-minRef)/2){
				conf=(sign-maxRef)/((maxRef-minRef)/2);
			}
			else if(sign>minRef && sign<minRef + (maxRef-minRef)/2){
				conf=(minRef-sign)/((maxRef-minRef)/2);
			}
			else if(sign<minRef){
				conf=(minRef-sign)/(minRef-minSignal);
			}
			else if(sign>maxRef){
				conf=(sign-maxRef-)/(maxSignal-maxRef);
			}
			break;
		case 4:
			break;
		case 5:
			break;
		default: 
			conf=-1;
			break;
		
	}
	
	

	return conf;
}

