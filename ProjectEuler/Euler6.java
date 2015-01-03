/**
 * Created by jacob_000 on 12/30/2014.
 */
public class Euler6 {
    public static void main(String[]args){
        int sum=0, sumSqr=0, diff, totSum;
        for(int i=0; i<=100; i++){
            sum+=i;
            sumSqr+=(i*i);
        }
        totSum=(sum*sum);
        diff=totSum-sumSqr;
        System.out.println(diff);
    }
}
