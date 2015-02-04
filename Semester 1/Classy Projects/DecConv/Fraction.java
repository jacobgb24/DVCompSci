
/**
 * Write a description of class Converter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fraction
{
    public static String input;
    public static int sign;
    public static double dec, numer1, numer2, denom1, denom2, denom=1, numer=1;
    
    public Fraction(String in)
    {
        input=in;
    } 
    public Fraction(double num1, double den1, double num2, double den2)
    {
        numer1=num1;
        numer2=num2;
        denom1=den1;
        denom2=den2;
    }    
    public Fraction Convert(String in)
    {
        input=in;
        int div1 = input.indexOf('/');
        int div2 = input.indexOf('/', div1+1);
        if(input.contains("+"))
            sign = input.indexOf('+');
        if(input.contains("-"))
            sign = input.indexOf('-');
        
        double numer1 = Double.parseDouble(input.substring(0, div1));
        double numer2 = Double.parseDouble(input.substring(sign+1, div2));
        double denom1 = Double.parseDouble(input.substring(div1+1, sign));
        double denom2 = Double.parseDouble(input.substring(div2+1));
        return new Fraction(numer1, denom1, numer2, denom2);
    }
    
    public void toFrac(double decimal){
        while(Math.abs(numer/denom) != dec){
            if((numer/denom)>dec)
                denom++;
            if((numer/denom)<dec)
                numer++;    
            }       
    }    
    
    public double toDec(double numer, double denom)
    {
        double decimal=numer/denom;
        return decimal;
    }
    public String toString(Fraction op2)
    {
        return(numer1+" "+denom1+" "+numer2+" "+denom2);
    }
}
