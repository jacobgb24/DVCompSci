import java.util.Scanner;
public class Main
{
    public static String input;
    public static int sign;
    public static double dec, numer1, numer2, denom1, denom2, denom=1, numer=1;
    /**
     * Constructor for objects of class Main
     */
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println();
        String input= in.next();
        Fraction test = new Fraction(input);
        test.Convert(input);
        String out = test.toString();
        System.out.println(out);
    }
}
