
/**
 * Write a description of class Task here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Task implements Priority
{
    private int priorityLevel;
    private String something;
    public Task(String seat){
        priorityLevel=1;
        something=seat;
    }
    public void setPriority(int level){
        priorityLevel=level;
    }
    public int getPriority(){
        return priorityLevel;
    }
    public String toString(){
        return something;
    }
}
