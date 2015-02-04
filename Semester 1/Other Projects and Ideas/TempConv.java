import java.util.Scanner;
public class TempConv
{
	public static void main (String [] args)
	{
		String exit = "yes";
		do
		{
			try
			{
			System.out.println("Welcome!\nConvert between Celsius and fahrenheit by typing the temperature and unit(f/c)\n");
			Scanner in = new Scanner (System.in);
			double inputTemp = in.nextDouble();
			String userinput = in.next(); // used next instead of nextLine so that double and string could be together
			if (userinput.equalsIgnoreCase("f") || userinput.equalsIgnoreCase("fahrenheit"))
			{ //Conversion from f to c
				double c = (inputTemp-32)*5/9;
				System.out.println(inputTemp + " degrees Fahrenheit is " + c + " degrees Celsius");
			}
			else if (userinput.equalsIgnoreCase("c") || userinput.equalsIgnoreCase("celsius"))
			{ // conversion from c to f
				double f = (inputTemp*9)/5+32;
				System.out.println(inputTemp + " degrees Celsius is " + f + " degrees Fahrenheit");
			}
			else
			{
				System.out.println("\nYou done messed up A-Aron\nPlease type the temperature and the unit with a space in between.");
			}
			
			System.out.println("\nWould you like to do another problem?(yes/no)");
			exit = in.next(); //Program will run as long as the string exit is "yes"
			}
			catch(Exception e){	//If the input is not a double(which causes break), this stops the error
			System.out.println("\nYou dun goofed. .");
			continue;}
		}	while (exit.contains("yes"));
	}	
}
