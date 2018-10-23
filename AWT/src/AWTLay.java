import java.awt.*;
public class AWTLay {
Frame f;
AWTLay()
	{f=new Frame();
	Button b[]=new Button[5];
	for(int i=0;i<5;i++)
		{b[i]=new Button(String.valueOf(i));
		}
	for(int i=0;i<5;i++)
		f.add(b[i]);
	f.setLayout(new FlowLayout(FlowLayout.RIGHT));
	f.setSize(100,100);
	f.setVisible(true);
	}
public static void main(String[] args)
	{new AWTLay();
	}
}
