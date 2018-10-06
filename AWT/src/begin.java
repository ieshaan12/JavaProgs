import java.awt.*;
class MyGui extends Frame{
MyGui(){
	setSize(1000,1000);
	setLayout(null);
	setVisible(true);
	setTitle("Core Banking");
	Button b=new Button("Submit");
	setBackground(Color.cyan);
	b.setBounds(50, 100, 80, 30);
	add(b);
}
}
public class begin
{
public static void main(String[] args)
{MyGui mi=new MyGui();
}
}
