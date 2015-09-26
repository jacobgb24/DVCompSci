public class Banking
{

    /**
     * Constructor for objects of class Banking
     */
    public static void main (String[]args)
    {
        Account[] bank = new Account[4];
        
        bank[0] = new Account("Jim Bobby", 0000, 250000);
        bank[1] = new Account("Benta \"Good\"", 0001, 2000.01);
        bank[2] = new Account("Wes \"table killer\" Standen", 0002, .1);
        bank[3] = new Account("Rayman Eddy", 0003, 5000000);
        
        bank[0].deposit(5);
        bank[1].transfer(bank[2], 2000);
        bank[3].withdraw(3000, 0);
        
        for(int i=0; i<bank.length; i++)
            System.out.println(bank[i]);
            
        InterestForAll(bank);
        
        System.out.println("\n");
        for(int i=0; i<bank.length; i++)
            System.out.println(bank[i]);
    }
    public static void InterestForAll(Account[] arr){
        for(int i=0; i<arr.length; i++)
            arr[i].addInterest();
    }
}