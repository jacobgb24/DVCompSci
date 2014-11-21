
import java.util.Scanner;
public class BlackJack
{
    private static int score1=0, score2=0;
    private static String cont="h";

    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type h to hit, and s to stay(Note: Aces are always 1)");
        
        //PLAYER
        while(cont.equals("h")) 
        { 
         CardMaker card1 = new CardMaker();
         score1+=card1.getBJValue();
         System.out.println("\nCard: "+card1.toString());
         System.out.println("Current score: "+score1);
         if(score1>21) break;
         cont=scan.nextLine();
        }
        
        //CPU
        while(true)
        {
         CardMaker card2 = new CardMaker();
         score2+=card2.getBJValue();
         if(score2>15) break;
        }
        
        //SCORING OUTPUT
        if(score1>21 && score2>21) 
            System.out.println("You both busted at: "+score1+" and "+score2);
        else if(score1>21)    
            System.out.println("You have busted at: "+score1+". The computer scored: "+score2);
        else if(score2>21)
            System.out.println("The computer has busted at: "+score2+". You scored: "+score1);
        else if(score1>score2)
            System.out.println("All the chips belong to you. You scored: "+score1+" the computer scored: "+score2);
        else if(score2>score1)
            System.out.println("LOSER. You scored: "+score1+" the computer scored: "+score2);
        else if(score1==score2)
            System.out.println("You tied at: "+score1);
        else
            System.out.println("WHAT JUST HAPPENED?");
    }

}
