import java.util.Scanner;
public class MyLine
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a slope and y-intercept");
        double m = in.nextDouble();
        double y = in.nextDouble();
        LinearEquation equation = new LinearEquation(m, y);
        System.out.println(equation.toString());
        
    }
}
