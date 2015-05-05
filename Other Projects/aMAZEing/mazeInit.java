import javax.swing.JFrame;

public class mazeInit {
	public static void main(String[] args){
		int[][] layout={{1,1,1,1,1,1},
					{1,1,1,1,3,1},
					{1,1,1,0,0,1},
					{1,1,1,0,1,1},
					{1,1,0,0,1,1},
					{1,1,2,1,1,1}}; 
		JFrame f = new JFrame("Maze Game Test");
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.add(new mazeBase(layout));
	        f.pack();
	        f.setVisible(true);
	}
}
