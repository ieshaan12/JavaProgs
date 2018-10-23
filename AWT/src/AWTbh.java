import java.awt.*;
import java.awt.event.*;
public class AWTbh implements ActionListener
{Frame f;
TextField tf= new TextField();
Button b[]=new Button[3];
AWTbh()
	{f=new Frame("ButtonExample");
	Button y=new Button("Yes");
	Button n=new Button("No");
	Button m=new Button("Maybe");
	b[0]=(Button)f.add(y);
	b[1]=(Button)f.add(n);
	b[2]=(Button)f.add(m);
	for(int i=0;i<3;i++)
		{b[i].setBounds(100,100+i*50,100,30);
		}
	for(int i=0;i<3;i++)
		b[i].addActionListener(this);
	tf.setBackground(Color.cyan);
	tf.setBounds(100, 250, 200, 30);
	f.add(tf);
	f.setSize(300,300);
	f.setVisible(true);
	}
public void actionPerformed(ActionEvent e)
	{for(int j=0;j<3;j++)
		{if(e.getSource()==b[j])
			tf.setText("Button Pressed:"+b[j].getLabel());
		}
	}
public static void main(String[] args)
	{new AWTbh();
	}
}
