import java.util.*;
public class guessNum
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		Double num = new Double(Math.random()*100+1);
		Integer value = new Integer(num.intValue());
		int count = 1;
		System.out.println("Please guess a number between 1-100");
		while(true){
			int input = in.nextInt();
			if(value.compareTo(input) <0) {
				System.out.println("Your guess was too big, try again");
				count++;
			}	
			else if(value.compareTo(input) >0) {
				System.out.println("Your guess was too small, try again");
				count++;
			}	
			else if(value.equals(input)) {
				System.out.println("\nYOU ARE A WINNER");
				System.out.println("It took you " + count + " guesses!");
				break;
				}
	}		
	}
}	
		