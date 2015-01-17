import java.math.BigInteger;
public class Euler20{
public static void main(String[]args){
	long sum=0;
	BigInteger num = BigInteger.valueOf(1);
	for(int i=100; i>0; i--){
		num=num.multiply(BigInteger.valueOf(i));
	}
	String fullNum=String.valueOf(num);
	System.out.println(fullNum+"\n");
	for(int n=0; true; n++){
		try{
		sum+=Character.getNumericValue(fullNum.charAt(n));
		} catch(Exception e) { break; }
	}
	System.out.println(sum);
	
	
	
} }