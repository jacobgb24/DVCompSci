import java.util.Scanner;
public class CircleArea
{
	public static void main (String [] args)
	{
		System.out.println("Please input radius and number of circles:");	
		Scanner in = new Scanner (System.in);
		double radius; // should be able to merge with line below as double radius = in.nextDouble ();
		radius = in.nextDouble (); // however I am too lazy to do this
		int numcircles = in.nextInt ();
		double area = Math.pow(radius, 2)*numcircles*Math.PI;
		System.out.println("The area of " + numcircles + " circles with radii of " + radius + " is \n" + area);
	}
}		 
