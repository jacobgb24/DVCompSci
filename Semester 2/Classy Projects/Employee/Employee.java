
public abstract class Employee
{
    public int income, time;
    public Employee(int wage, int hours)
    {
        income=wage;
        time=hours;
    }
    public String toString(){
        return "for "+time+" hours at "+income+" dollars per hour";
    }
    public void raise(int inc){
        income+=inc;
    }
}
