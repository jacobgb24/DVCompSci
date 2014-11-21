public class FlipRace
{
    public static void main(String[] args){
        int count1=0, count2=0;
        
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        
        while(count1<3 && count2<3){
            coin1.flip();
            coin2.flip();
            
            System.out.print("Coin 1: "+coin1);
            System.out.println("\tCoin2: "+coin2);
            
            if(coin1.isHeads())
                count1++;
            else
                count1=0;
            if(coin2.isHeads())
                count2++;
            else
                count2=0;
                
        }
        if(count1<3)
            System.out.println("\t\tCOIN 2 WINS!");
        else if(count2<3)
            System.out.println("COIN 1 WINS!");
        else
            System.out.println("IT'S A TIE");
    }
}
