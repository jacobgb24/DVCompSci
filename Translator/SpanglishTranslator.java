
import java.util.StringTokenizer;
public class SpanglishTranslator
{
    static int count=0;
    public String translate(String sentence)    
    {
        String result = " ";
        sentence=sentence.toLowerCase();
        StringTokenizer tok = new StringTokenizer(sentence);
        while(tok.hasMoreTokens()) {
            result+= translateWord(tok.nextToken());
            result+= " ";
        }
        return result;
    }
    private String translateWord(String word) 
    {
      String result = " ";
      if(VowelStart(word))
        result= word + "lo";
      else {
        MultiConStart(word); 
            result= word.substring(count) + word.substring(0, count) + "alo";
    }
      return result;  
    }
    private boolean VowelStart(String word) {
        String vowels = "aeiouy";
        char letter = word.charAt(0);
        return(vowels.indexOf(letter) !=-1);
    }    
    private int MultiConStart(String word) {
    String cons = "bcdfghjklmnpqrstvwxz";
    count=0;
    for(int i=0; i<=word.length(); i++) {
      char letter = word.charAt(i);
      if(cons.indexOf(letter) !=-1)
            count++;
      else
        break;
    }     
    return count;
    //char letter1 = word.charAt(0);
    //char letter2 = word.charAt(1);
    //int count=1;
    //return(cons.indexOf(letter1) !=-1 && cons.indexOf(letter2) !=-1);
    }    
}
