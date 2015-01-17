
/**
 * Write a description of class Question here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question implements Complexity, Priority, Comparable<Question> {
    private String question, answer, something;
    private int complexityLevel, priorityLevel;
    public Question(String query, String result){
        question=query;
        answer=result;
        complexityLevel=1;
    }
    public void setComplexity(int level){
        complexityLevel=level;
    }
    public int getComplexity(){
        return complexityLevel;
    }
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }
    public boolean answerCorrect(String candidateAnswer){
        return answer.equals(candidateAnswer);
    }
    public String toString(){
        return question+"\n"+answer;
    }
    public int getPriority(){
        return priorityLevel;
    }
    public void setPriority(int level){
        priorityLevel=level;
    }
    @Override
    public int compareTo(Question q){
        if(this.priorityLevel==q.priorityLevel)
            return 0;
        else if(this.priorityLevel>q.priorityLevel)
            return 1;
        else
            return -1;
        }
}
