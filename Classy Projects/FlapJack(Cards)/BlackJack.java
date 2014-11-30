
import java.util.Scanner;
public class BlackJack
{
    private static int score1=0, score2=0;
    private static String cont="h", play="y";

    public static void main(String[]args)
    {
        while(play.equals("y")) {
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
         cont=scan.next();
        }
        
        //CPU
        while(true)
        {
         CardMaker card2 = new CardMaker();
         score2+=card2.getBJValue();
         if(score2>15) break;
        }
        
        //SCORING OUTPUT
        System.out.println(CardMaker.BJWinner(score1, score2));
        System.out.println("Would you like to play again (Type y)");
        cont="h";
        score1=0;
        score2=0;
        play=scan.next();
    }
}

}
