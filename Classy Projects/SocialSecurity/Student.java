
public class Student
{
    private String firstName, lastName;
    private Address homeAd, schoolAd;
    public Student(String first, String last, Address home, Address school)
    {
        firstName=first;
        lastName=last;
        homeAd=home;
        schoolAd=school;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        String result;
        result=firstName+" "+lastName+"\n";
        result+="Home Address:\n"+homeAd+"\n";
        result+="School Address:\n"+schoolAd;
        return result;
    }
}
