public class Euler5{
public static void main(String[]args){
int n, i;
	for(i=1; ; i++){
		for(n=1; n<=20; n++){
			if(i%n!=0)
				break;
			else if(n==20){
				System.out.println(i);
				break;
			}
		}
	}
}
}
	
		

	
	
	
	
	
	
	
