/**
 * Created by jacob_000 on 1/2/2015.
 */
public class Euler7 {
public static void main(String[]args){
    int prime=2, check=4, value=0;
    while(prime!=10001) {
        for(int n=2; n<=check; n++){
            if(n==check) {
                prime++;
                value = check; }
            else if(check%n==0)
                break;
        }
        check++;
    }
    System.out.println(value);
} }
