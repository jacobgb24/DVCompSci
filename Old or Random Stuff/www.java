import java.net.*;
import java.awt.*;
public class www
{
	public static void main (String [] args) 
	{
    Desktop web = Desktop.getDesktop(); //awt used to open a desktop app
	try {
		URI site = new URI("https://github.com/jacobgb24/DVCompSci"); //net used to open URI
		web.browse(site); //uses default browser to open website
	}
	catch (Exception e){
	}
	}
}	