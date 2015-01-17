/**
 * Created by jacob_000 on 1/12/2015.
 */
public class Euler10 {
    public static void main(String[] args) {
        long sum = 0L;
        for (long i = 2L; i <= 2000000; i++){
            if(isBoolean(i))
                sum+=i;
        }

        System.out.println(sum);
    }
    public static boolean isBoolean(long i) {
        for (int n = 2; n <= Math.sqrt(i); n++) {
            if (i % n == 0)
                return false;
        }
        return true;
    }
}
