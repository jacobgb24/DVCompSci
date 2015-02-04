import java.util.Scanner;
public class toBinary {
	public static void main(String [] args) {
		long num;//using long to allow bigger numbers
		long binary=0;
		int exp = 19;//arbitrary number for how long the binary number can be
		Scanner in = new Scanner(System.in);
		System.out.println("This program will convert any integer(up to 130k) into binary. Enter a number to begin");//breaks at 18th digit in binary
		while(true) { //infinite loop
			num=in.nextLong(); //taking input int
			while(num>0) { //Will continue until all of int has been converted to binary
				while(num>=Math.pow(2, exp)) { //If the number is bigger than 2^exp meaning it is past a column in binary 
					binary = (long)(binary+Math.pow(10, exp));//to convert to binary we raise 10^exp which places a 1 in the correct column
					num = (long)(num-Math.pow(2, exp));//2^exp is subtracted from num after it is accounted for and the process repeats 
				}									   //for the new value of num
				exp = exp-1; //increments the exponent in the case that num<Math.pow(2, exp)
			}	
			System.out.println(binary+"\n"); //prints final answer as an int
			binary=0;//resets values so loop can continue
			exp=19;
		}
	}
}	
