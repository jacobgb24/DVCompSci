
/**
 * Write a description of class RollyPolly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RollyPolly
{

    public static void main (String[]args)
    {
        int faceNum, rolls, faceValue, total=0;
        double average;
        
        System.out.println("Enter how many sides the dice has and how many times you want to roll it\n");
        Scanner in = new Scanner(System.in);
        faceNum=in.nextInt();
        rolls=in.nextInt();
        Die die1 = new Die(faceNum);
        
        for(int count=1; count<=rolls; count++) 
        {
            faceValue = die1.roll();
            System.out.print(faceValue+"\t");
            total+=faceValue;
            if(count%12==0)
                System.out.println();
        }
        average=(double)total/(double)rolls;
        System.out.println("\nThe average value was: "+average);
        System.out.println("Rolling a "+faceNum+" sided die "+rolls+" times");
    }
}
