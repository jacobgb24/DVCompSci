public class Receptionist extends Employee
{

    public Receptionist(int income, int hours)
    {
        super(income, hours);
    }
    public String phone(){
        return "The recpetionist holds a phone "+super.toString();
    }
}
