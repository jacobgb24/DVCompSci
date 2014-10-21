// Cleanish version of intergral - JH
import java.util.*;
public class NoobIntergral
{
 public static void main (String[] args)
 {
  
  double z=0, xy, x, y, area, farea=0, xi=0, xf=4.0;
 for (double div=100000000; div>=0; div--)
  {
  
  
   x=(xf-xi)/100000000;
   z += x; 
   xy = z; //Not sure if this is necessary
   y = 2*xy*xy;
   area = x*y;
   farea += area;
   
  }
  
 	  System.out.println(farea);
   
 	
 }
}
