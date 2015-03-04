

public class Admin extends Employee
{

    public Admin(int income, int hours)
    {
        super(income, hours);
    }
    public String administrate(){
        return "The admin sits "+super.toString();
    }
}
