import java.text.NumberFormat;
public class Account
{
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    private final double RATE = .03;
    private int acctNumber;
    private double balance;
    private String name;

    /**
     * Constructor for objects of class Account
     */
    public Account(String owner, int account, double initial)
    {
        name=owner;
        acctNumber=account;
        balance=initial;
    }
    public Account(String owner, int account)
    {
        name=owner;
        acctNumber=account;
        balance=0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double deposit(double amount)
    {
        if(amount<0){
            System.out.println("");
            System.out.println("Invalid amount");
            System.out.println(acctNumber+" "+fmt.format(amount)); }
        else
            balance=balance+amount;
        return balance;    
    }
    public double withdraw(double amount, double fee){
        amount+=fee;
        if(amount<0) {
            System.out.println("");
            System.out.println("Invalid amount");
            System.out.println("Account"+acctNumber); 
            System.out.println("Requested: "+fmt.format(amount)); }
        else if(amount>balance){
            System.out.println("");
            System.out.println("YOU POOR");
            System.out.println("account"+acctNumber); 
            System.out.println("Requested: "+fmt.format(amount));
            System.out.println("Available: "+fmt.format(balance)); }
        else
            balance=balance-amount;
        return balance;    
    }
    public double addInterest() {
        balance+=(balance*RATE);
        return balance;
    }
    public double getBalance() {
        return balance;
    }
    public int getAcctNumber() {
        return acctNumber;
    }
    public String toString() {
        return (acctNumber+"\t"+name+"\t"+fmt.format(balance));        
    }
    public void transfer(Account acct, double value)
    {
        balance-=value;
        acct.deposit(value);
    }
}
