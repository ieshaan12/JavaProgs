import java.awt.*;
import java.awt.event.*;
public class AWTKeyEvents extends Frame implements KeyListener 
{String msg="";
AWTKeyEvents()
	{addKeyListener(this);
	setSize(400,400);
	setLayout(null);
	setVisible(true);
	setBackground(Color.cyan);
	addWindowListener(new WindowAdapter()
	{public void windowClosing(WindowEvent e)
		{System.exit(0);}
	});
	}
public void keyPressed(KeyEvent e)
	{int key=e.getKeyCode();
	switch(key)
		{case KeyEvent.VK_F1:msg+="<F1>";break;
		case KeyEvent.VK_PAGE_UP:msg+="<PgUp>";break;
		case KeyEvent.VK_LEFT:msg+="<Left Arrow>";break;
		}
	repaint();
	}
public void keyReleased(KeyEvent e)
{
repaint();	
}
public void keyTyped(KeyEvent e)
{
msg+=e.getKeyChar();
repaint();
}
public void paint(Graphics g)
{g.drawString(msg,50,50);	
}
public static void main(String[] args)
{new AWTKeyEvents();	
}
}
