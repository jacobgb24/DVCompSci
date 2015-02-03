import java.util.Scanner;
public class Tunes {
public static void main (String[] args) {
String title, artist;
int tracks;
double price;
Scanner scan= new Scanner(System.in);
CDCollection music = new CDCollection ();
while(true){
    System.out.println("Enter the Album title: ");
    title=scan.next();
    System.out.println("Enter the Artist: ");
    artist=scan.next();
    System.out.println("Enter the Price: ");
    price=scan.nextDouble();    
    System.out.println("Enter the number of tracks: ");
    tracks=scan.nextInt();
    
    music.addCD(title, artist, price, tracks);
    System.out.println("Continue?(Type y)");
    if(scan.next().equals("y"))
        continue;
    else
        break;
    }
System.out.println (music);
}
}
