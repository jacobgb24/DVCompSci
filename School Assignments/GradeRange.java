import java.util.Scanner;
public class GradeRange{
public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Grade Chart:");
	String[][] grades={ {"A","B","C++","C","D","F"}, //2d array for fun
					    {"90","80","75","70","60","0"} };
					    
	for(int level=0;level<grades[0].length;level++)
		System.out.println(grades[0][level]+"\t"+grades[1][level]);
		
	System.out.println("\nPlease enter your grade to see its letter value.");
	int input = scan.nextInt();  //overly complicated way of finding letter grade 
	for(int i=0;i<grades[0].length;i++) { 
		if(input>=Integer.parseInt(grades[1][i])){
			System.out.println("You earned a: "+grades[0][i]);
			break;
		}
	}		
} }	