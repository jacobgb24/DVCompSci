
public class Nurse extends Employee
{

    public Nurse(int income, int hours)
    {
        super(income, hours);
    }
    public String checkUp(){
        return "The nurse looks at people "+super.toString();
    }
}

