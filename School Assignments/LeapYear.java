import java.util.*;
public class LeapYear {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a year");
		GregorianCalendar cal = new GregorianCalendar();
		
		while(true) {
			try{
			int yearIn = in.nextInt();
			if(yearIn>=1592) {
				if(cal.isLeapYear(yearIn))
					System.out.println("That is a leap year\nType another leap year to continue");
				else
					System.out.println("This year is not a leap year\nType another leap year to continue");
			}
			else
				System.out.println("Leap years did not exist at this time\nType another leap year to continue");	
			}
			catch(Exception e) {
				break; }
		}
	}
}	
		