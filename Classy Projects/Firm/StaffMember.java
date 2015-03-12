abstract public class StaffMember implements Staffer{
protected String name; 
protected String address; 
protected String phone;

public StaffMember (String eName, String eAddress, String ePhone)
{
    name = eName; 
    address = eAddress; 
    phone = ePhone;
}
public String toString()
{
    String result = "Name: " + name + "\n";
    result += "Address: " + address + "\n"; result += "Phone: " + phone;
    return result;
}
public abstract double pay();
}


