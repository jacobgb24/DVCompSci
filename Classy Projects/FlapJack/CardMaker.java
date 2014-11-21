
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
}
