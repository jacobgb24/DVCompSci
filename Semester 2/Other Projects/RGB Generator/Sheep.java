import javax.swing.JPanel;
import java.awt.*;
public class Sheep extends JPanel{
	driverSheep shep = new driverSheep();
	int[] col = shep.getColors();
	Color bg = new Color(col[0], col[1], col[2]);
	public Dimension getPreferredSize(){
		return new Dimension(200, 200);
	}
	protected void paintComponent(Graphics g){
		g.setColor(bg);
		g.fillRect(00, 00, 200, 200);
		g.setColor(Color.white);
		g.drawString("The color is:"+col[0]+"r "+col[1]+"g "+col[2]+"b", 00, 100);
	}
}
