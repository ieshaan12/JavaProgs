import java.awt.*;
import java.awt.event.*;
public class AWTadaptext extends Frame
{
Label l;
TextArea area;
Button b;
AWTadaptext()
	{setSize(400,400);
	 setVisible(true);
	 l=new Label();
	 l.setBounds(20, 50, 200, 20);
	 l.setBackground(Color.red);
	 b=new Button();
	 area=new TextArea();
	 area.setBounds(20, 80, 300, 150);
	 area.addMouseListener(new MouseAdapter()
			 {public void mouseReleased(MouseEvent e)
			 	{l.setText(area.getSelectedText());
			 	}
	});
	 add(l);add(area);add(b);
	}
public static void main(String[] args)
{new AWTadaptext();}
}
