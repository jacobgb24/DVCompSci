
/**
 * FInds Snakes andd ladders
 * 
 * @author (TRENTON COP) 
 * @version (DONE)
 */
import java.util.Scanner;
public class SnakeEyes
{
/**
     * Constructor for objects of class SnakeEyes
     */
    public static void main (String[]args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the amount of sides each dice has");
       
       int faces1 = in.nextInt();
       int faces2 = in.nextInt();
       final int ROLLS=500;
       int snakeEyes=0, num1, num2;
       
       Die die1 = new Die(faces1);
       Die die2 = new Die(faces2);
       
       for( int roll=1; roll<=ROLLS; roll++) {
           num1=die1.roll();
           num2=die2.roll();
           if(num1==1 && num2==1)
                snakeEyes++;
       }
       System.out.println("Number of rolls: "+ROLLS);
       System.out.println("Number of snake eyes: "+snakeEyes);
       System.out.println("Ratio: "+(double)snakeEyes/ROLLS*100+"%");
    }
}
