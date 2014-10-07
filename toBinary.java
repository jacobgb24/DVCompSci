import java.util.Scanner;
public class toBinary {
	public static void main(String [] args) {
		long num;
		long binary=0;
		int exp = 24;
		Scanner in = new Scanner(System.in);
		String loop = "y";
		System.out.println("This program will convert any integer into binary. Enter a number to begin");
		
		num=in.nextLong();
		while(num>0) {
			while(num>=Math.pow(2, exp)) {
				binary = (long)(binary+Math.pow(10, exp));
				num = (long)(num-Math.pow(2, exp));
			}
			exp = exp-1;
		}	
		System.out.println(binary);
	}
}	