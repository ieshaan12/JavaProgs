import java.awt.*;
//import java.awt.event.*;
public class Minesweeeper {
Frame f;
Button b[]=new Button[25];
Minesweeeper()
{f=new Frame();
	for(int i=0;i<25;i++)
		{b[i]=new Button(String.valueOf(i));}
	for(int j=0;j<25;j++)
	{f.add(b[j]);}
	f.setLayout(new GridLayout(5,5));
	f.setSize(500, 500);
	f.setVisible(true);
	}
public static void main(String[] args)
	{new Minesweeeper();}
}
