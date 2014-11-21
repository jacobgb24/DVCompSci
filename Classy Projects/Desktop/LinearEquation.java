public class LinearEquation
{
    public static double m, y;
    
    public LinearEquation(double slope, double yint) {
        m=slope;
        y=yint;
    }
    
    public String toString() {
            return("y="+m+"x+"+y);
    }
}
