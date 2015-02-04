import java.util.*;
import sun.audio.*;
import java.io.*;

public class RootBeer
{
	static String cont="yes";
	static int beerCount, initCount, delay=10;
	public static void main(String[] args) throws InterruptedException{
	
		Scanner in = new Scanner(System.in);
		System.out.println("How many bottles of Root Beer do you have?");
		beerCount=initCount=in.nextInt();
		while(cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("y")) {

			while(beerCount>=3) { //loop for 99-3
				Chorus();
				
				Thread.sleep(delay*5);
				delay++;
			}

		//Ending for last two statements
		System.out.println("2 bottles of root beer on the wall,");
		System.out.println("2 bottles of root beer");
		System.out.println("take one down pass it around,");
		System.out.println("only 1 bottle of root beer on the wall\n");
		Thread.sleep(delay*5);
		System.out.println("only 1 bottle of root beer on the wall,");
		System.out.println("only 1 bottle of root beer");
		System.out.println("take it down pass it around,");
		System.out.println("no more bottles of root beer on the wall\n");
		Thread.sleep(delay*5);
		System.out.println("no more bottles of root beer on the wall");
		System.out.println("go to the store get some more,");
		System.out.println( initCount+" bottles of root beer on the wall");
		Sound();
		Thread.sleep(1000);
		System.out.println("\n\nRestart?(type yes)");
		cont=in.next();
		beerCount=initCount;
		}
	}	
	private static void Chorus(){
		System.out.println(beerCount + " bottles of root beer on the wall,");
		System.out.println(beerCount + " bottles of root beer");
		System.out.println("take one down pass it around,");
		beerCount--;
		System.out.println(beerCount + " bottles of root beer on the wall,\n");
	}
	
	private static void Sound(){	//Ignore warnings when compiling, it works fine
		try{
		InputStream in = new FileInputStream("/Users/Trent/Desktop/CompSci/burp.wav");	//Path of the sound file
		
		AudioStream audioStream = new AudioStream(in);	//Constructs something
		
		AudioPlayer.player.start(audioStream);	//Plays the audio
		}
		catch(Exception e){}
	}
}
