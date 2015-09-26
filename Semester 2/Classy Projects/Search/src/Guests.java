/**
 * Created by jacob_000 on 2/2/2015.
 */
import java.util.Scanner;
public class Guests {
    public static void main(String[]args){
        String[] guests = {"IAMERROR", "TOD", "JESSE", "WALTER", "HANK", "SAUL"};
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("Enter a name: ");
        name=scan.nextLine();

        if(Searches.linearSearch(guests, name)>=0)
            System.out.println(name+" is on the list");
        else
            System.out.println(name+" is not on the list");
    }
}
