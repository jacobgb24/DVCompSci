package pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Saves {
    public static Properties prop = new Properties(); 
    
    public void save(String title, String value){
        try{
            prop.setProperty(title, value);
            prop.store(new FileOutputStream("stats.cfg"), value);
        }
        catch(IOException e){}
    }
    
    public int load(String title){
        int value = 0;
        try{
          prop.load(new FileInputStream("stats.cfg"));
          value = Integer.parseInt(prop.getProperty(title));
        }
        catch(IOException e){}
        return value;
    }
}
