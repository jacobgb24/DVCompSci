
/**
 * Write a description of class MonetaryCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonetaryCoin extends Coin
{
    public int value;
    public MonetaryCoin(int amount)
    {
        super();
        value=amount;
    }
    public int getValue()
    {
        return value;
    }
}
