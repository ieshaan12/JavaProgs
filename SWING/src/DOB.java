import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DOB {
JList d,m,y;
JFrame f;
JScrollPane sd,sm,sy;
JComboBox cbd,cbm,cby; 
JLabel ld,lm,ly,res;
JButton result;
DOB()
{	cbd= new JComboBox();
	cbm= new JComboBox();
	cby= new JComboBox();
	ld=new JLabel("Date");
	lm=new JLabel("Month");
	ly=new JLabel("Year");
	res=new JLabel("");
	result=new JButton("Submit");
	
	String[] date=new String[32];
	for(int i=1; i<32;i++)
	{cbd.addItem(Integer.toString(i));}
	String[] year=new String[120];
	for(int i=1900;i<2019;i++)
	{cby.addItem(Integer.toString(i));}
	String[] month= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	for(String i:month)
	{cbm.addItem(i);}
	d=new JList(date);
	m=new JList(month);
	y=new JList(year);
	sd=new JScrollPane(d);
	sm=new JScrollPane(m);
	sy=new JScrollPane(y);	
	f=new JFrame();
	f.setLayout(new GridLayout(0,2));
	f.add(ld);
	f.add(cbd);
	f.add(lm);
	f.add(cbm);
	f.add(ly);
	f.add(cby);
	f.add(result);
	f.add(res);
	//cbd.setLocation(100, 100);
	//cbm.setLocation(200, 100);
	//cby.setLocation(300, 100);
	f.setSize(500, 500);
	f.setVisible(true);
	f.setResizable(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	result.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String date1=new String((String)cbd.getSelectedItem());
			String year1=new String((String)cby.getSelectedItem());
			String month1=new String((String)cbm.getSelectedItem());
			res.setText(date1+" "+month1+" "+year1);
		}
	});
	}
public static void main(String[] args) {
	new DOB();
}
}

