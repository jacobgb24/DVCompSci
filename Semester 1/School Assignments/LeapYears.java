//Not superepicimportforlazypeople. -JH
import java.util.*;
public class LeapYears
{
 public static void main (String[] args)
 {
 System.out.println("Enter in a year from the Gregorian Calendar to check if it is a leap year : ");
 Scanner enteryear = new Scanner(System.in);
 int year = enteryear.nextInt();
 
 while (year<1582)
  {
  System.out.println("Please enter in a valid year (1582+) :");
  year = enteryear.nextInt();
  }
 while (year>=1582)
  {
  if(year%100==0 && !(year%400==0))
   System.out.println("The year " + year + " is in fact not a leap year.");
  
  else if( year%4==0 || year%400==0 )
   System.out.println("The year " + year + " is in fact a leap year.");
  
  else
   System.out.println("The year " + year + " is in fact not a leap year.");
   
  System.out.println("Check for another year? : (Y/y to continue, any other key to exit)");
  Scanner yesno = new Scanner(System.in);
  String yn = yesno.next();
  
  
  if(yn.equalsIgnoreCase("y"))
   {
   System.out.println("Enter in a year from the Gregorian Calendar to check if it is a leap year : ");
   year = enteryear.nextInt();
   }
	else
	{
	System.out.println("Goodbye");
	break;
	}
   
  } 
 }
}
