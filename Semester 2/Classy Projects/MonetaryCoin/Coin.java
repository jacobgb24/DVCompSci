
public class Coin
{
    // instance variables - replace the example below with your own
    private int face;
    /**
     * Constructor for objects of class Coin
     */
    public Coin()
    {
        // initialise instance variables
        flip();
    }

    /**
     * FLIPS DAT COIN
     */
    public void flip()
    {
        // put your code here
        face = (int)(Math.random()*2);
    }
    
    public boolean isHeads(){
        return(face==1);
    }

    public String toString(){
        String faceName;
        
        if(face==1)
            faceName="Heads";
        else
            faceName="Tails";
            
        return faceName;
        }
}
