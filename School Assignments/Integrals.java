import java.util.Scanner;
public class Integrals{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input the coefficients of a quadratic A(x^2)+Bx+C"); //taking coef of quad
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		System.out.print("Please input a max x value: "); //domain
		float domain= in.nextFloat();
		
		System.out.println("You entered: "+(int)a+"x^2+"+(int)b+"x+"+(int)c+" in the domain: [0,"+(int)domain+"].");
		int x=0, max=1000000;
		double section=max/domain, area=0, y;
		
		while(x<=max){ //calculation
			y=(a*Math.pow(x/section, 2))+(b*x/section)+c;
			area+=y/section;
			x++;
		}
		System.out.println("\n"+"Your area is: "+area);
	}
}
