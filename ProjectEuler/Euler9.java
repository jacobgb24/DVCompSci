/**
 * Created by jacob_000 on 1/2/2015.
 */
public class Euler9 {
public static void main(String[]args){
    double a, b=0, c=0, product=0, sum=0;
    main:
    for(a=1; a<1000; a++){
        for(b=a+1; b<1000; b++){
            c=Math.sqrt((a*a)+(b*b));
            sum=a+b+c;
            if(sum==1000 && c%1==0)
                break main;
        }
    }
    System.out.println(a+" "+b+" "+c);
    product=a*b*c;
    System.out.println(product);
}
}
