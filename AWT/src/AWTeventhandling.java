import java.awt.*;
import java.awt.event.*;
class test extends Frame implements ActionListener{
	TextField tf;
	test()
	{setTitle("Core Banking");
	tf=new TextField();
	tf.setBounds(100,50,170,30);
	Button b=new Button("Submit");
	b.setBounds(100, 100, 100, 30);
	add(b);
	add(tf);
	b.addActionListener(this);
	setSize(500,500);
	setBackground(Color.red);
	setLayout(null);
	setVisible(true);
	}
	public void actionPerformed(ActionEvent E)
	{
	tf.setText("Welcome to Core Banking");
	}
}
public class AWTeventhandling {
public static void main(String[] args)
{test t=new test();
}
}

