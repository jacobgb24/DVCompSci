
/**
 * Write a description of class CardMaker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class CardMaker
{
    public static Random gen = new Random();
    private int faceValue, suitInt;
    private String suit, person=null;

    /**
     * Constructor for objects of class CardMaker
     */
    public CardMaker()
    {
        faceValue=gen.nextInt(13)+1;
        suitInt=gen.nextInt(4)+1;
        switch(suitInt) {
            case 1: suit="Clubs";
                break;
            case 2: suit="Hearts";
                break;
            case 3: suit="Spades";
                break;
            case 4: suit="Diamonds";
                break;
                
        }    
        switch(faceValue) {
            case 1: person="Ace";
                break;
            case 11: person="Jack";
                break;
            case 12: person="Queen";
                break;
            case 13: person="King";
                break;
                
        }   
    }

    public String toString()
    {
        if(person!=null)
            return(person+" of "+suit);
        else    
            return(faceValue+" of "+suit);
    }
    public int getValue()
    {
        return faceValue;
    }
    public int getBJValue()
    {
        if(faceValue>10)
            faceValue=10;
        return faceValue ;   
    }
    public static String BJWinner(int score1, int score2)
    {
        if(score1>21 && score2>21) 
            return("You both busted at: "+score1+" and "+score2);
        else if(score1>21)    
            return("You have busted at: "+score1+". The computer scored: "+score2);
        else if(score2>21)
            return("The computer has busted at: "+score2+". You scored: "+score1);
        else if(score1>score2)
            return("All the chips belong to you. You scored: "+score1+" the computer scored: "+score2);
        else if(score2>score1)
            return("LOSER. You scored: "+score1+" the computer scored: "+score2);
        else if(score1==score2)
            return("You tied at: "+score1);
        else
            return("WHAT JUST HAPPENED?");
    }
}
