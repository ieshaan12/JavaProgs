import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class gui {
	JFrame frame;
	JPanel commentPanel;
	JButton plus,minus,div,multi,option;
	JTextArea text1,text2;
	JLabel label;
	gui()
	{frame=new JFrame();
	 frame.setTitle("Calculator");
	 frame.setSize(500, 500);
	 frame.setResizable(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 //frame.setLayout(new FlowLayout());
	 
	 commentPanel=new JPanel();
	 commentPanel.setLayout(new GridLayout(0,2));
	 
	 text1=new JTextArea("Enter Details");
	 //text1.setLocation(125,125);
	 commentPanel.add(text1);
	 
	 text2=new JTextArea("Enter Details");
	 commentPanel.add(text2);
	 
	 label=new JLabel();
	 //label.setLocation(375,375);
	 commentPanel.add(label);
	 
	 plus=new JButton();
	 plus.setText("+ (Add)");
	 //plus.setLocation(200,200);
	 commentPanel.add(plus);
	 plus.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 double a,b;try {
			 a=Double.parseDouble(text1.getText());
			 b=Double.parseDouble(text2.getText());
			 double c=a+b;
			 label.setText(Double.toString(c));}
			 catch(Exception t) {
				 JOptionPane.showMessageDialog(new JFrame(), "Enter number values only","Error: Redo",JOptionPane.ERROR_MESSAGE);
			 }
		 }
	 });
	 
	 minus=new JButton();
	 minus.setText("- (Subtract)");
	 //minus.setLocation(200,250);
	 commentPanel.add(minus);
	 minus.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 double a,b;try {
			 a=Double.parseDouble(text1.getText());
			 b=Double.parseDouble(text2.getText());
			 double c=a-b;
			 label.setText(Double.toString(c));
		 }
			 catch(Exception t) {
				 JOptionPane.showMessageDialog(new JFrame(),"Enter number values only","Error: Redo",JOptionPane.ERROR_MESSAGE);
			 }
		 }
	 });
	 
	 div=new JButton();
	 div.setText("/ (Divide)");
	 //div.setLocation(200,300);
	 commentPanel.add(div);
	 div.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 double a,b;try {
			 a=Double.parseDouble(text1.getText());
			 b=Double.parseDouble(text2.getText());
			 double c=a/b;
			 label.setText(Double.toString(c));
		 }
			 catch(Exception t) {
				 JOptionPane.showMessageDialog(new JFrame(), "Enter number values only","Error: Redo",JOptionPane.ERROR_MESSAGE);
			 }
		 }
	 });
	 
	 multi=new JButton();
	 multi.setText("* (Multiply)");
	 //multi.setLocation(200,400);
	 commentPanel.add(multi);
	 multi.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 double a,b;try {
			 a=Double.parseDouble(text1.getText());
			 b=Double.parseDouble(text2.getText());
			 double c=a*b;
			 label.setText(Double.toString(c));
		 }
			 catch(Exception t) {
				 JOptionPane.showMessageDialog(new JFrame(), "Enter number values only","Error: Redo",JOptionPane.ERROR_MESSAGE);
			 }
		 }
	 });
	 option=new JButton();
	 option.setText("Invert");
	 commentPanel.add(option);
	 option.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 text1.setText(text2.getText());
			 text2.setText(text1.getText());
		 }
	 });
	 
	 label=new JLabel();
	 label.setText("Result");
	 commentPanel.add(label);
	 
	 frame.add(commentPanel);
	 frame.setVisible(true);
	}
}
public class Calc {
	public static void main(String[] args) {
		new gui();
	}

}
