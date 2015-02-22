import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Stats{
public static void main(String[]args){
	ArrayList<Double> data = new ArrayList<Double>();
	DecimalFormat fmt = new DecimalFormat("#.###");
	Scanner scan = new Scanner(System.in);
	double meanSum=0, stdDevSum=0, mean, stdDev, input;
	
	System.out.println("Input data: (-1 to end)");
	while(true){
		input=scan.nextDouble();
		if(input==-1)
			break;
		data.add(input);
	}
	System.out.println("\nInputted data:");
	System.out.println(data);
	
	for(int i=0; i<data.size(); i++)
		meanSum+=data.get(i);
	mean=meanSum/data.size();
	System.out.println("The mean is: "+fmt.format(mean));
	
	for(int i=0; i<data.size(); i++)
		stdDevSum+=Math.pow((data.get(i)-mean), 2);
	stdDev=Math.sqrt(stdDevSum/(data.size()-1));
	System.out.println("The standard deviation is: "+fmt.format(stdDev));
}
}