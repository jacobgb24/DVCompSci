import java.util.Scanner;
public class average {
	static double total=0;
	static int count = 0;
	static double numberIn;
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input as many numbers as you want and the average will be given!\nType any letter and press enter to calculate");
		while(true) {
		try{ 
			numberIn = in.nextDouble();
			total =  total+numberIn; //adds number to a total
			count++; // increase number of numbers
			}	
		catch(Exception e) { //does this if a non-number is inputted
			break; }
		}	
		calculate();

	}
	public static void calculate() {
		double average = total/count; //finds average
		System.out.println("The average of your numbers is: " +average);
	}	
}		
				