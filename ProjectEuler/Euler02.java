public class Euler2{
public static void main(String[]args){
	int a=0, b=1, sum=0;
	while(b<4000000){
		b+=a;
		a=b-a;
		if(b%2==0)
			sum+=b;
	}
	System.out.println(sum);
}
}	