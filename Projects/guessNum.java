import java.util.*;
public class guessNum
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in); //scanner
		Double num = new Double(Math.random()*100+1); //using double object for practice
		Integer value = new Integer(num.intValue()); //casting double as an int 
		//System.out.println(value); //testing purposes 
		System.out.println("This is a guessing game! Would you like to play with 1 or 2 people"); //chose amount of players
		String player = in.nextLine();
		if(player.equals("1") || player.equalsIgnoreCase("one")) {  //Single player game
			int count = 1; //keeps score
			System.out.println("Please guess a number between 1-100");
			while(true) {
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
		else if(player.equals("2") || player.equalsIgnoreCase("two")) { //Two player game
			System.out.println("Have each player enter a number between 1-100. \nWhoever is closer will earn 1 point. \nThe game continues until someone guesses correctly which earns them 2 points. \nThe winner is whoever has the most points.");
			int score1 = 0; //scores
			int score2 = 0;
			while(true) {
			int p1 = in.nextInt(); //inputs
			int p2 = in.nextInt();
			int p1diff =Math.abs(value-p1);  //distance from actual number
			int p2diff =Math.abs(value-p2); 
			if(p1diff==0 && p2diff==0) { //both guess correctly
				score1=score1+2;
				score2=score2+2;
				System.out.println("Both players have guessed correctly!");
				System.out.println("Player 1 earned " + score1 + " point(s) and Player 2 earned " + score2 + " point(s)");	
				break;
			}
			else if(p1diff == 0) { //P1 guesses correct
				System.out.println("Player 1 has guessed correctly! P1 earns 2 points");
				score1= score1+2;
				System.out.println("Player 1 earned " + score1 + " point(s) and Player 2 earned " + score2 + " point(s)");
				break;
				}	
			else if(p2diff == 0) { //P2 guesses correct
				System.out.println("Player 2 has guessed correctly! P2 earns 2 points");
				score2= score2+2;
				System.out.println("Player 1 earned " + score1 + " point(s) and Player 2 earned " + score2 + " point(s)");	
				break;
				}	
			else if(p1diff < p2diff) { //P1 closer
				System.out.println("P1 is closer to the number and has earned 1 point");
				score1++;
				}	
			else if (p1diff > p2diff) { //P2 closer
				System.out.println("P2 is close to the number and has earned 1 point");
				score2++;
				}	
			else if(p1diff == p2diff) { //both equal distance
				System.out.println("Your numbers are equal distance, you both get 1 point");
				score1++;
				score2++;	
				}	
				}
		if(score1>score2) //Prints who won
			System.out.println("Congratulations P1 has won the game!");
		if(score2>score1)
			System.out.println("Congratulations P2 has won the game!");
		if(score1==score2)
			System.out.println("YOU PEOPLE BOTH LOSE!!!!");
	}	
}
}		
		