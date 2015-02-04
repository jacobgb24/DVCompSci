import java.util.Scanner;
import java.io.*;
public class Palindrome{
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		String word, loop= "y";
		int left, right;
		
		while(loop.equalsIgnoreCase("y")){
			
			System.out.println("Enter a file to read from: ");
			String fileName = in.nextLine();
		
			File file = new File(fileName+".txt");
			Scanner read = new Scanner(file);
			word = read.nextLine();
			
			left = 0;
			right = word.length()-1;
			while(word.charAt(left)==word.charAt(right) && left<right){
				left++;
				right--;
			}
			
			if(left<right)
				System.out.println("\nThat string is not a palindrome");
			else
				System.out.println("\nThat string is a palindrome");
			System.out.print("Test another string? (type \"y\" for yes) ");
			loop = in.nextLine();
		}
	}
}