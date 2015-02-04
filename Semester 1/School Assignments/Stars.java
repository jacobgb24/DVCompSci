import java.util.Scanner;
public class Stars{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Select a symbol to use: ");
		String symbol = in.nextLine();
		
		System.out.print("Number of repetitions: ");
		int loop = in.nextInt();
		
		for(int count=1; count<=loop; count++){	
			for(int row=1;row<=9; row++){	//Counts up
				for(int star=1; star<=row; star++){
					System.out.print(symbol+symbol);
					}
				System.out.println();
				}
			
			for(int row=10;row<20; row++){	//Counts down
				for(int star=40-row; star>row; star--){
					System.out.print(symbol);
					}
				System.out.println();
				}
			}
	}
}
