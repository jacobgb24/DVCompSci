
public class Address
{
    private String streetAd, city, state;
    private int zipcode;

    public Address(String street, String town, String st, int zip)
    {
        streetAd=street;
        city=town;
        state=st;
        zipcode=zip;
    }

    public String toString()
    {
        String result;
        result=streetAd+"\n";
        result+= city+", "+state+", "+zipcode;
        return result;
    }
}
