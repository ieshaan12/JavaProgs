import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Print{
	JFrame frame;
	JPanel p1,p2,p3;
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JButton b1,b2,b3;
	JComboBox c1,c2,c3;
	JCheckBox cb1,cb2,cb3;
	JTabbedPane tp;
	JRadioButton r1,r2,r3,r4;
	Print(){
		
		//CardLayout cl=new CardLayout();
		frame=new JFrame();
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(4,0));
		p2=new JPanel();
		p2.setLayout(new GridLayout(4,0));
		p3=new JPanel();
		p3.setLayout(new GridLayout(4,0));
		tp=new JTabbedPane();
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		
		l1=new JLabel();
		l2=new JLabel();
		l3=new JLabel();
		
		b1=new JButton("Submit");
		b2=new JButton("Submit");
		b3=new JButton("Submit");
		
		cb1=new JCheckBox();
		cb2=new JCheckBox();
		cb3=new JCheckBox();
		cb1.setText("C++");
		cb2.setText("Python");
		cb3.setText("Java");
		//ButtonGroup cb=new ButtonGroup();
		//cb.add(cb1);cb.add(cb2);cb.add(cb3);
		
		
		r1=new JRadioButton();
		r2=new JRadioButton();
		r3=new JRadioButton();
		r4=new JRadioButton();
		ButtonGroup r=new ButtonGroup();
		r.add(r1);r.add(r2);r.add(r3);r.add(r4);
		
		c1=new JComboBox();
		c2=new JComboBox();
		c3=new JComboBox();
		
		c1.addItem("RED");
		
		p1.add(b1);
		p1.add(t1);
		p1.add(l1);
		p1.add(c1);
		p1.setName("Panel 1");
		
		p2.add(b2);
		p2.add(t2);
		p2.add(l2);
		p2.add(cb1);
		p2.add(cb2);
		p2.add(cb3);
		p2.setName("Panel 2");
		
		p3.add(b3);
		p3.add(t3);
		p3.add(l3);
		p3.add(r1);
		p3.add(r2);
		p3.add(r3);
		p3.add(r4);
		p3.setName("Panel 3");
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{l1.setText(t1.getText());	
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{l2.setText(t2.getText());	
			}
		});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{l3.setText(t3.getText());	
			}
		
		});
		tp.add(p1);
		tp.add(p2);
		tp.add(p3);
		frame.add(tp);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class CardLayout {
	public static void main(String[] args) {
		new Print();
	}
}
