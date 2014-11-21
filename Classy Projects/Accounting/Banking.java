
/**
 * Write a description of class Banking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banking
{

    /**
     * Constructor for objects of class Banking
     */
    public static void main (String[]args)
    {
        Account acct1 = new Account("Jim Bobby", 0001, 250000);
        Account acct2 = new Account("Benta \"Good\"", 0002, 2000.01);
        Account acct3 = new Account("Wes \"table killer\" Standen", 0003);//doesnt have amount defined
        
        acct1.transfer(acct3, 200);
        
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
}
