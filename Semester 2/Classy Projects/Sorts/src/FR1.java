import java.util.Scanner;

/**
 * Created by jacob_000 on 3/22/2015.
 */
public class FR1 {
    static String line;
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        line = scan.nextLine();
        System.out.println(findString("a", 0));
        System.out.println(countStrings("c"));
    }
    private static int findString(String str, int start){
        char in = str.charAt(0);
        for(int i=start; i<line.length(); i++){
            if(line.charAt(i)==in){
                if(i==0 && line.charAt(i+1)!=in) {
                    return i;
                }
                else if(i==line.length()-1 && line.charAt(i-1)!=in) {
                    return i;
                }
                else if(line.charAt(i+1)!=in && line.charAt(i-1)!=in) {
                    return i;
                }
            }

        }
        return -1;
    }
    private static int countStrings(String str){
        char in = str.charAt(0);
        int count=0;
        for(int i=0; i<line.length(); i++){
            if(line.charAt(i)==in){
                if(i==0 && line.charAt(i+1)!=in) {
                    count++;
                }
                else if(i==line.length()-1 && line.charAt(i-1)!=in) {
                    count++;
                }
                else if(line.charAt(i+1)!=in && line.charAt(i-1)!=in) {
                    count++;
                }
            }
        }
        return count;
    }
}

