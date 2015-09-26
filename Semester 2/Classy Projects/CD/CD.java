import java.text.NumberFormat;
public class CD {
private String title, artist; private double cost; private int tracks;
public CD (String name, String singer, double price, int numTracks) {
    title = name; 
    artist = singer; 
    cost = price; 
    tracks = numTracks;
}
public String toString()
{
    NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
    String description;
    description = fmt.format(cost) + "\t" + tracks + "\t";
    description += title + "\t" + artist;
    return description;
}
}
