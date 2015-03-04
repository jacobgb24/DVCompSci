
public class Surgeon extends Employee
{

    public Surgeon(int income, int hours)
    {
        super(income, hours);
    }
    public String cut(){
        return "The surgeon disassembles people "+super.toString();
    }
    public String suture(){
        return "The surgeon also reassembles people ";
    }
}