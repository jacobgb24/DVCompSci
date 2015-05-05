import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class mazeBase extends JPanel implements KeyListener{
	static boolean winner=false;
	static int x,y=0;
	static int[][] map;
	public mazeBase(int[][] layout){
		map = layout;
		setBackground(Color.white);
		addKeyListener(this);
		setFocusable(true);
	}
	public Dimension getPreferredSize(){
		return new Dimension(300,300);
	}
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_LEFT){
		}
		else if(key==KeyEvent.VK_RIGHT){
			moveRight();
			repaint();
		}
		else if(key==KeyEvent.VK_UP){
			moveUp();
			repaint();
			
		}
		else if(key==KeyEvent.VK_DOWN){
			
		}

	}
	private void moveUp(){
		for(int row=0; row<map.length; row++){
			for(int col=0; col<map[0].length; col++){
				if(map[row][col]==2 && map[row-1][col]==0){
					map[row][col]=0;
					map[row-1][col]=2;
					x=row*50;
					y=col*50;
				}
				else if(map[row][col]==2 && map[row-1][col]==3){
					map[row][col]=0;
					map[row-1][col]=4;
					winner=true;
				}
			}
		}
	}
	private void moveRight(){
		for(int row=0; row<map.length; row++){
			for(int col=0; col<map[0].length; col++){
				if(map[row][col]==2 && map[row][col+1]!=1){
					map[row][col]=0;
					map[row][col+1]=2;
					x=row*50;
					y=col*50;
				}
			}
		}
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		Font font = new Font("System", Font.BOLD, 28);
		g.setFont(font);
		g.setColor(Color.BLACK);
		for(int row=0; row<map.length; row++){
			for(int col=0; col<map[0].length; col++){
				y=row*50;
				x=col*50;
				if(map[row][col]==1)
					g.fillRect(x, y, 50, 50);
				else if(map[row][col]==2){
					g.setColor(Color.RED);
					g.fillOval(15+x, 15+y, 20, 20);
					g.setColor(Color.BLACK);
				}
				else if(map[row][col]==3){
					g.setColor(Color.BLUE);
					g.fillRect(x,y,50,50);
					g.setColor(Color.BLACK);
				}
				else if(map[row][col]==4){
					g.setColor(Color.BLUE);
					g.fillRect(x,y,50,50);
					g.setColor(Color.RED);
					g.fillOval(15+x, 15+y, 20, 20);
					g.setColor(Color.BLACK);
				}
			}
		}
		if(winner!=false){
			g.setColor(Color.WHITE);
			g.drawString("A WINNER IS BE YOU", 5, 40);
		}
	}
	public void keyReleased(KeyEvent e) {
		System.out.println(e);
	}
	public void keyTyped(KeyEvent e) {
		System.out.println(e);
		System.out.println(map.length);	//down
		System.out.println(map[0].length);	//side
	}
}
