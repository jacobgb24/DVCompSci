import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class Graphing {
   
   static double slopeIn;
   static double yInt;
   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                argConfig();
				createAndShowGUI(); 
            }
        });
    }

	public static void argConfig(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the slope: ");
		double slopeIn = sc.nextDouble();
		System.out.print("Input the y-intercept: ");
		double yInt = sc.nextDouble();
		}
	
	public static double getSlope(){
		return slopeIn;
		}
	
    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+
        SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new GraphPanel());
        f.pack();
        f.setVisible(true);
		}
}

class GraphPanel extends JPanel {

	Graphing test = new Graphing();
	double slope = test.getSlope();

   public GraphPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
		setBackground(Color.white);
    }
    

    public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);       
		g.drawString("Please work",1,20);
		g.drawString("Slope is: "+slope, 1, 40);
    }  
}