import java.util.Scanner;	//Java API to detect inputs
public class AreaFinderTest //Copyright 2014 by Jacob and Trent
{
	public static void main (String [] args)
	{
		String exit = "yes";	
		do
		{
		try
			{
			System.out.println("\nTo find area of rectangle, press r.\nTo find area of triangle, press t.\nTo find area of circle, press c.");	
			Scanner in = new Scanner (System.in);
			String userinput = in.nextLine();
			
			if(userinput.equals("c"))	//Area of a circle
			{
				System.out.println("\nPlease type the radius.");
				double radius;
				radius = in.nextDouble ();
				double areaC = (radius*radius)*Math.PI;
				System.out.println("\nThe area of a circle with radius " + radius + " is: \n" + areaC);
			}
			
			else if(userinput.equals("r"))	//Area of a rectangle
			{
				System.out.println("\nPlease type length and width as l w.");
				double length, width;
				length = in.nextDouble ();
				width = in.nextDouble ();
				double areaR = (length*width);
				System.out.println("\nThe area of a rectangle with length:" + length + " and width:" + width + " is: \n" + areaR);
			}
			
			else if(userinput.equals("t"))	//Area of a triangle
			{
				System.out.println("\nPlease type base and height as b h.");
				double base, height;
				base = in.nextDouble ();
				height = in.nextDouble ();
				double areaT = (base*height)/2;
				System.out.println("\nThe area of a triangle with base:" + base + " and height:" + height + " is: \n" + areaT);
			}
			
			else	//If the input isn't valid, this happens
			{
				System.out.println("\nPlease type r t or c dummy.");
			}
	
			
			System.out.println("\nWould you like to do another problem?(yes/no)");
			exit = in.next(); //Program will run as long as the string exit is "yes"
			
			}
			catch(Exception e){	//If the input is not a double, this stops the error
			System.out.println("\nYou dun goofed");
			continue;}
			
		}
		while (exit.contains("yes"));
	}
}
