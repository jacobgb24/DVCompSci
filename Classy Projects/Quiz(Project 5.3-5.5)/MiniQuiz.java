import java.util.Scanner;
public class MiniQuiz
{
    static Question q1, q2;
    static int order;
    static String possible;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[]args){
        
        q1=new Question("What is 2+4?", "6");
        q1.setComplexity(-4);
        q1.setPriority(3);
        
        q2=new Question("What is your favorite color", "blue no yellow");
        q2.setComplexity(10);
        q2.setPriority(4);
        
    order=q1.compareTo(q2);
    if(order>=0){
        Ask(q1);
        Ask(q2);
    }
    else if(order<0){
        Ask(q2);
        Ask(q1);
    }
        
}
public static void Ask(Question q){
    System.out.println(q.getQuestion());
        System.out.println(" (Level: "+q.getComplexity()+")");
        possible=scan.nextLine();
        if(q.answerCorrect(possible))
            System.out.println("Correct");
        else
            System.out.println("FAILURE Answer is: "+q.getAnswer());
        System.out.println();
    }
}
