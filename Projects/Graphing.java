import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class Graphing {	//Setup class, prepares the GUI
   
   static double slopeIn; //Allows variables to be shared between methods
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
	double slope = test.getSlope();
	int yInt = (int)test.getIntercept();
	
	int yIntNew = 480-yInt;
	int slopePoint = (int)slope*500+yInt;

   public GraphPanel() {
       // setBorder(BorderFactory.createLineBorder(Color.black));
		setBackground(Color.white);
    }
    

    public Dimension getPreferredSize() {
        return new Dimension(520,500);
    }
    
    protected void paintComponent(Graphics g) {
		super.paintComponent(g);       
		g.drawString("Slope is: "+slope+" y-int is: "+yInt, 21, 20);
		g.drawLine(20, 0, 20, 500); //Y-axis
		g.drawLine(0, 480, 500, 480); //X-axis
		for(int i=0; i<=500; i++){
			if(i%20==0){
				g.drawLine(i, 485, i, 475); //X-axis markers
				g.drawLine(15, i-20, 25, i-20);} //Y-axis markers
			if(i%40==0){
				g.drawString(""+i, i+13, 495);
				g.drawString(""+(500-i), 0, i-15);}
		}
		
		g.drawLine(20,yIntNew, 500, 480-slopePoint); //Line
    }  
}