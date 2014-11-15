
/**
 * Write a description of class Spanglish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Spanglish
{
    public static void main(String[]args)
    {
     String sentence, result, another="y";;
     SpanglishTranslator translator = new SpanglishTranslator();
     Scanner in = new Scanner(System.in);
     
     while(another.equalsIgnoreCase("y") || another.equalsIgnoreCase("yes")) {
         System.out.println();
         System.out.println("Enter a sentence with vowels and without puncuation");
         sentence= in.nextLine();
         
         System.out.println();
         result= translator.translate(sentence);
         System.out.println("This sentence in Spanglish reads as:");
         System.out.println(result);
         
         System.out.println();
         System.out.println("Translate another?(Type yes or y)");
         another= in.nextLine();
    }
    }
}
