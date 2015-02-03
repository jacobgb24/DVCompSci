
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
public static void main(String[]args) {
    Task t1 = new Task("1st class");
    t1.setPriority(1);
    System.out.println(t1.toString()+" 
    is priority level: "+t1.getPriority());
    
    Task t2 = new Task("Business class");
    t2.setPriority(2);
    System.out.println(t2.toString()+" is priority level: "+t2.getPriority());
    
    Task t3 = new Task("Economy class");
    t3.setPriority(3);
    System.out.println(t3.toString()+" is priority level: "+t3.getPriority());
}
}
