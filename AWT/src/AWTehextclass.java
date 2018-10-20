import java.awt.*;
import java.awt.event.*;
public class AWTehextclass extends Frame {
TextField tf;
Label l;
AWTehextclass()
{setTitle("Core Banking");
tf=new TextField();
tf.setBounds(100, 100, 170, 30);

Button b=new Button("Submit");
b.setBounds(100,150,100,30);

l=new Label();
l.setBounds(100,50,170,30);
l.setBackground(Color.green);

add(b);add(tf);add(l);

AHandler a=new AHandler(this);
b.addActionListener(a);
tf.addTextListener(a);

setSize(700,700);
setBackground(Color.cyan);
setLayout(null);
setVisible(true);
}
public static void main(String[] args)
{AWTehextclass t=new AWTehextclass();
}
class AHandler implements ActionListener,TextListener{
	AWTehextclass obj;
	AHandler(AWTehextclass t)
	{this.obj=t;
	}
	public void textValueChanged(TextEvent e)
	{obj.l.setText("Entered Text:"+obj.tf.getText());
	}
	public void actionPerformed(ActionEvent e)
	{obj.l.setText("Welcome to Core Banking");
	}
	
}
}

