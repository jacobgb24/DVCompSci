import java.math.BigInteger;
public class Euler16{
public static void main(String[]args){
	long sum=0;
	int i=0;
	BigInteger num= BigInteger.valueOf(2);
	num=num.pow(1000);
	String test = num.toString();
	while(true){
		try{
		sum+=Character.getNumericValue(test.charAt(i));
		i++;
		} catch(Exception e) { break; }
	}
	System.out.println(sum);
} }