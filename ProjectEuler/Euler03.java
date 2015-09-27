public class Euler3{
public static void main(String[]args){
	long NUM=600851475143L;
	for(long i=1; (i*i)<NUM; i+=2){
		if(NUM%i==0){
			for(long n=2; n<=i; n++){
				if(i%n==0 && n!=i)
					break;
				else if(n==i){
					System.out.println(n);
				}
			}
		}
	}
}}	
					
			
	