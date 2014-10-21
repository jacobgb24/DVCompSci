import java.util.Scanner;
public class Integrals{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a max x value: ");
		float domain= in.nextFloat();
		
		int x=0, max=1000000;
		double section=max/domain, area=0, y;
		
		while(x<=max){
			y=2*Math.pow(x/section, 2);
			area+=y/section;
			x++;
		}
		System.out.println("\n"+"Your area is: "+area);
	}
}
