import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class wikiGame {
	public static void main(String[] args) throws Exception{
		URL rand = new URL("http://en.wikipedia.org/wiki/Special:Random");
		
		//Opens the starting page
		URLConnection con = rand.openConnection();
		con.connect();
		InputStream is = con.getInputStream();
		StringBuffer page = new StringBuffer(con.getURL().getPath().toString().replace('_', ' '));	//Formats the URL into the title
		System.out.println("Starting page: "+page.delete(0, 6));	//Prints name of page (deletes /wiki/)
		java.awt.Desktop.getDesktop().browse(con.getURL().toURI());	//Opens the random page
		is.close();
		
		//Opens the ending page
		URLConnection con2 = rand.openConnection();
		con2.connect();
		InputStream is2 = con2.getInputStream();
		StringBuffer page2 = new StringBuffer(con2.getURL().getPath().toString().replace('_', ' '));
		System.out.println("Ending page: "+page2.delete(0, 6));
		java.awt.Desktop.getDesktop().browse(con2.getURL().toURI());
		is2.close();
	}
}
