import java.awt.*;

public class AWTbyassociaion {
public static void main(String[] args)
{Frame f=new Frame("Core Banking");
Button b=new Button("Submit");
b.setBounds(50,100,80,30);
f.add(b);
f.setSize(1000, 1000);
f.setBackground(Color.cyan);
f.setLayout(null);
f.setVisible(true);
}
}
