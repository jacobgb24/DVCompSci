
/**
 * Write a description of class CountFlips here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountFlips
{
    public static void main(String[] args){
        int heads=0, tails=0;
        
        Coin coin = new Coin();
        
        for(int count=1; count<=1000; count++){
            coin.flip();
            
            if(coin.isHeads())
                heads++;
            else
                tails++;
        }
        
        System.out.println("The number of flips is 1000");
        System.out.println("The number of heads: "+heads);
        System.out.println("The number of tails is: "+tails);
    }
}
