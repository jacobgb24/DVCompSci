public class SortGrades
{
    //-----------------------------------------------------------------
// Creates an array of grades, sorts them, then prints them.
//-----------------------------------------------------------------
    public static void main (String[] args)
    {
        int[] grades = {89, 94, 69, 80, 97, 85, 73, 91, 77, 85, 93};
        int[] grade2 = grades.clone();

        Sorts.selectionSort (grades);
        for (int index = 0; index < grades.length; index++)
            System.out.print (grades[index] + " ");

        System.out.println("\n\n");

        Sorts.insertionSort(grade2);
        for (int index = 0; index < grades.length; index++)
            System.out.print (grades[index] + " ");
    }
}
