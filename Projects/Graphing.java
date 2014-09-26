import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class Graphing {	//Setup class, prepares the GUI
   
   static double slopeIn; //ALlows variables to be shared between methods
   static double yIntIn;
   
    public static void main(String[] args) {	//runs argConfig and then GUI methods
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                argConfig();
				createAndShowGUI(); 
            }
        });
    }

	public static void argConfig(){	//Scans for slope and intercept
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the slope: ");
		slopeIn = sc.nextDouble();
		
		System.out.print("Input the y-intercept: ");
		yIntIn = sc.nextDouble();
		}
	
	public static double getSlope(){	//Used for retrieving slope in graphic class
		return slopeIn;
		}
	public static double getIntercept(){	//Used for retrieving intercept
		return yIntIn;
		}
	
	
    private static void createAndShowGUI() {	//Creates the window for the graph
        System.out.println("Created GUI on EDT? "+
        SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new GraphPanel());
        f.pack();
        f.setVisible(true);
		}
}

class GraphPanel extends JPanel {	//GUI class, creates graph

	Graphing test = new Graphing();	//Constructor for previous class
	int slope = (int)test.getSlope();
	int yInt = (int)test.getIntercept();

   public GraphPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
		setBackground(Color.white);
    }
    

    public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }
    
    protected void paintComponent(Graphics g) {
		super.paintComponent(g);       
		g.drawString("Slope is: "+slope+"y-int is: "+yInt, 1, 20);
		g.drawLine(0,200-yInt, 250, 200-slope*250); //Line graph
    }  
}