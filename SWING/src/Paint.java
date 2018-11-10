import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;
///////////////////////*
class P extends Frame implements MouseListener, MouseMotionListener{
	
	Color c=Color.RED;
	JButton b;
	//MouseEvent e;
	P()
	{setTitle("Paint");
	 setSize(700, 700);
	// frame.setResizable(true);
	 //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setVisible(true);
	 //frame.repaint();
	 setBackground(c);
	 addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent e)
		 {System.exit(0);
		 }
	 });
	 addMouseListener(this);
	 addMouseMotionListener(this);
	 addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent k) {
			char K=k.getKeyChar();
			switch(K)
			{case 'r':repaint();break;
			case 'R':repaint();break;
			}
		}
	 });
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		Graphics g=getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(), e.getY(), 1 , 1);
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		/*L
		 *E
		 *A
		 *V
		 *E
		 */
		
	}

	public void mouseClicked(MouseEvent e) {
		Graphics g=getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(), e.getY(), 30 , 30);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		/*L
		 *E
		 *A
		 *V
		 *E
		 */
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Graphics g=getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(), e.getY(), 1 , 1);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		/*L
		 * E
		 * A
		 * V
		 * E
		 */
	}
	public void paint(Graphics g)
	{g.setColor(c);
	}
	
}
public class Paint {
public static void main(String[] args) {
	new P();
}
}
