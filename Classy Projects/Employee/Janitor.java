
public class Janitor extends Employee
{

    public Janitor(int income, int hours)
    {
        super(income, hours);
    }
    public String mop(){
        return "The janitor mops blood off of surfaces "+super.toString();
    }
    public String sweep(){
        return "The janitor also sweeps dust bunnies ";
    }
}

