import java.awt.FlowLayout;

import javax.swing.*;
class ThirdFlow{
 public static void main(String args[]){
 JFrame frame = new JFrame("My First GUI");
//defining the layout of the container
frame.setLayout(new FlowLayout());
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(300,300);

JButton button1 = new JButton("Press1");
JButton button2 = new JButton("Press2");

frame.getContentPane().add(button1);
frame.getContentPane().add(button2);
 frame.setVisible(true);
 }
}