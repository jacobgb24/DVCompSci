import java.util.Scanner;
public class LetterCount{
public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	int NUMCHARS=26;
	int[] lower=new int[NUMCHARS];
	int[] upper=new int[NUMCHARS];
	
	char current;
	int other=0;
	
	System.out.println("Enter a sentence:\n");
	String line = scan.nextLine();
	
	for(int ch=0;ch<line.length();ch++){
		current=line.charAt(ch);
		if(current>='A' && current<='Z')
			upper[current-'A']++;
		else if(current>='a' && current<='z')
			lower[current-'a']++;
		else
			other++;
	}
		for(int letter=0;letter<upper.length;letter++){
			System.out.print((char)(letter+'A'));
			System.out.print(": "+upper[letter]);
			System.out.print("\t\t"+(char)(letter+'a'));
			System.out.println(": "+lower[letter]);
		}
	System.out.println("\nNon-alphabetic chars: "+other);
	
} }