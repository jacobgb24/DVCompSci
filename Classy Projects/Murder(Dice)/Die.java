
/**
 * Write a description of class Die here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class Die
{
    private static Random gen = new Random();
    private int numFaces, faceValue;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
       numFaces=6;
       faceValue=1;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Die(int faces)
    {
        if(faces>0)
            numFaces=faces;
        else
            numFaces=6;
        faceValue=1;    
    }
    public int roll ()
    {
        faceValue=gen.nextInt(numFaces)+1;
        return faceValue;
    }
    public int getFaceValue() {
        return faceValue;
    }    
}
