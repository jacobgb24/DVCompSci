public class Euler14 {
public static void main(String[]args){
	int chainMax=0;
	long bestI=0;
	for(long i =1; i<1000000; i++){
		int chainP=1;
		for(long n=i; n!=1;){
			if(n%2==0){
				n=n/2;
				chainP++;
			}
			else {
				n=(3*n)+1;
				chainP++;
			}
			//System.out.println(n);
		}
		if(chainP>chainMax){
			chainMax=chainP;
			bestI=i;
		}
	}	
	System.out.println("\n"+bestI);
	System.out.println(chainMax);
} }