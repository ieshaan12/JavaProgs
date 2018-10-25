import java.awt.*;
import java.awt.event.*;
public class AWTexample1 implements ActionListener{
Frame f1,f2;
Label l;
TextField tf;
Button b[]=new Button[3];
AWTexample1()
	{f1=new Frame("Buttons");
	 f2=new Frame("Buttons2");
	b[0]=new Button("Yes");
	b[1]=new Button("No");
	b[2]=new Button("Maybe");
	
	tf=new TextField();
	tf.setBackground(Color.GRAY);
	l=new Label();
	f1.add(tf);
	for(int i=0;i<3;i++)
	{f1.add(b[i]);
	b[i].addActionListener(this);}
	f1.setSize(300,300);
	f1.setLayout(new GridLayout(4,1));
	f1.setVisible(true);
	}
public void actionPerformed(ActionEvent e)
	{for(int i=0;i<3;i++)
		{if(e.getSource()==b[i])
			tf.setText("Button Pressed:"+b[i].getLabel());
		}
	
	}
public static void main(String[] args)
{new AWTexample1();}
}
