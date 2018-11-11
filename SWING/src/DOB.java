import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DOB {
JList d,m,y;
JFrame f;
JScrollPane sd,sm,sy;
JComboBox cbd,cbm,cby; 
JLabel ld,lm,ly,res;
JButton result,saverec;
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
	saverec=new JButton("Save Record");
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
	f.add(saverec);
	//cbd.setLocation(100, 100);
	//cbm.setLocation(200, 100);
	//cby.setLocation(300, 100);
	f.setSize(500, 500);
	f.setVisible(true);
	f.setResizable(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	/*
	try {
		createDatabase();
	}
	catch(Exception e1)
	{e1.getStackTrace();}
	*/
	result.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String date1=new String((String)cbd.getSelectedItem());
			String year1=new String((String)cby.getSelectedItem());
			String month1=new String((String)cbm.getSelectedItem());
			res.setText(date1+" "+month1+" "+year1);
		}
	});
	saverec.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae) {
			String date1=new String((String)cbd.getSelectedItem());
			String year1=new String((String)cby.getSelectedItem());
			String month1=new String((String)cbm.getSelectedItem());
			String f1=date1+" "+month1+" "+year1;
			try {
				Connection con=getConnection();
				int dobid=getDobid(con);
				PreparedStatement st=con.prepareStatement("insert into DOB(DOB_ID,DOBDetails) values(?,?)");
				st.setInt(1, dobid);
				st.setString(2, f1);
				st.executeUpdate();
				JOptionPane.showMessageDialog(f, "Data Inserted");
			}
			catch(ClassNotFoundException e)
			{JOptionPane.showMessageDialog(f, "error in submitting data");
			}
			catch(SQLException se)
			{
				Logger.getLogger(DOB.class.getName()).log(Level.SEVERE, null, se);
			}
		}
	});


}
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:dob;create=true;user=app;password=app");
		return con;
	}
	public void closeConnection(Connection con) throws SQLException{
		con.close();
	}
	public int getDobid(Connection con) throws SQLException{
		int val=0;
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select Max(DOB_ID) from DOB");
		if(rs.next()) val=rs.getInt(1);
		return val+1;
	}
public static void main(String[] args) {
	new DOB();
}
public void createDatabase() throws SQLException, ClassNotFoundException
{
	Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	Connection con=DriverManager.getConnection("jdbc:derby:dob;create=true;user=app;password=app");
	String createString = "create table DOB(DOB_ID INTEGER PRIMARY KEY,\r\n"+
						"DOBDetails VARCHAR(50))";

	Statement stmt = con.createStatement();
	stmt.executeUpdate(createString);
}
}

