
public class Doctor extends Employee
{

    public Doctor(int income, int hours)
    {
        super(income, hours);
    }
    public String diagnose(){
        return "The doctor identifies people's problems "+super.toString();
    }
}
