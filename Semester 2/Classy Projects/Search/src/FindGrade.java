/**
 * Created by jacob_000 on 2/2/2015.
 */
public class FindGrade {
    public static void main(String[]args){
        int[] grades = {60, 68, 70, 72, 77, 85, 86, 89 ,93, 95, 98};
        int lookFor=77;
        int pos = Searches.binarySearch(grades, lookFor)+1;
        if(pos!=-1)
            System.out.println("The grade: "+lookFor+" was found at position: "+pos);
        else
            System.out.println("The grade "+lookFor+" was not found");


        lookFor=97;
        pos = Searches.binarySearch(grades, lookFor);
        if(pos!=-1)
            System.out.println("The grade: "+lookFor+" was found at position: "+pos);
        else
            System.out.println("The grade "+lookFor+" was not found");
    }
}
