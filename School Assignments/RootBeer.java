import java.util.*;

public class RootBeer
{
	static String cont="yes";
	static int intCount, finalCount, count=10;
	public static void main(String[] args) throws InterruptedException
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many bottles of Root Beer do you have?");
		intCount=finalCount=in.nextInt();
		while(cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("y")) {

			while(intCount>=3) { //loop for 99-3
				Chorus();
				
				Thread.sleep(count*5);
				count++;
			}

		//Ending for last two statements
		System.out.println("2 bottles of root beer on the wall,");
		System.out.println("2 bottles of root beer");
		System.out.println("take one down pass it around,");
		System.out.println("only 1 bottle of root beer on the wall\n");
		Thread.sleep(count*5);
		System.out.println("only 1 bottle of root beer on the wall,");
		System.out.println("only 1 bottle of root beer");
		System.out.println("take it down pass it around,");
		System.out.println("no more bottles of root beer on the wall\n");
		Thread.sleep(count*5);
		System.out.println("no more bottles of root beer on the wall");
		System.out.println("go to the store get some more,");
		System.out.println( finalCount+" bottles of root beer on the wall");
		Thread.sleep(1000);
		System.out.println("\n\nRestart?(type yes)");
		cont=in.next();
		intCount=99;
	}
}	
	public static void Chorus() {
			System.out.println(intCount + " bottles of root beer on the wall,");
			System.out.println(intCount + " bottles of root beer");
			System.out.println("take one down pass it around,");
			intCount--;
			System.out.println(intCount + " bottles of root beer on the wall,\n");
	}		
}