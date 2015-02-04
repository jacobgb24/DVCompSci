import java.util.Scanner;
public class whiteDwarf{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.print("Please input number of rows (-1 to exit): ");
			int input = in.nextInt();
			
			if(input<=78 && input>=1){
				for(int row=1; row<=input; row++){
					for(int space=row; space<=input; space++)
						System.out.print(" ");
					
					for(int star=(input+1)-row; star<=input; star++)
						System.out.print("*");
					System.out.println();
				}
			}
			else if(input==-1)
				break;
			else{
				System.out.println("Number not within bounds");
			}
		}
	}
}