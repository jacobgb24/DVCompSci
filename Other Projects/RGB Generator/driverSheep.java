import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class driverSheep {
	static int[] colors = new int[3];
	public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                setup();
				createAndShowGUI(); 
            }
        });
	}
	private static void setup(){
		colors[0] = (int)(Math.random()*256);
		colors[1] = (int)(Math.random()*256);
		colors[2] = (int)(Math.random()*256);
	}
	public static int[] getColors(){
		return colors;
	}
	private static void createAndShowGUI(){
		 JFrame f = new JFrame("Swing Paint Demo");
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.add(new Sheep());
	        f.pack();
	        f.setVisible(true);
	}
}
