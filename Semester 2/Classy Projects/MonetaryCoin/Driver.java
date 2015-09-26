
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[]args)
    {
        MonetaryCoin nickel = new MonetaryCoin(5);
        MonetaryCoin dime = new MonetaryCoin(10);
        MonetaryCoin quarter = new MonetaryCoin(25);
        int total=nickel.getValue()+dime.getValue()+quarter.getValue();
        System.out.println(total+" cents");        
        
        quarter.flip();
        System.out.println(quarter.toString());
        
}
}