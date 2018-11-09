import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.*;
public	class SecondGrid {
		JFrame f;
		JPanel p1, p2, p3;
		JTabbedPane tp;
		JLabel namelabel1, emaillabel1, countrylabel1, genderlabel1,
		deletelabel, idlabel2, namelabel2, emaillabel2, countrylabel2,
		genderlabel2;
		JTextField name1, email1, gender1, delete_id, name2, email2,
		gender2, id2;
		JButton savebtn, resetbtn, editbtn1, editbtn2, deletebtn;
		JComboBox country1, country2;
	SecondGrid() {
		f = new JFrame("Customer Form");
		p1 = new JPanel(new GridLayout(5, 2));
		p2 = new JPanel(new GridLayout(6, 2));
		p3 = new JPanel(new GridLayout(4, 3));
		tp = new JTabbedPane();
		
		namelabel1 = new JLabel("Customer Name:");
		emaillabel1 = new JLabel("Customer email:");
		countrylabel1 = new JLabel("Customer Country:");
		genderlabel1 = new JLabel("Customer Gender:");
		deletelabel = new JLabel("Enter Customer ID to delete record:");
		idlabel2 = new JLabel("Customer ID:");
		namelabel2 = new JLabel("Customer Name:");
		emaillabel2 = new JLabel("Customer email:");
		countrylabel2 = new JLabel("Customer Country:");
		genderlabel2 = new JLabel("Customer Gender:");
		
		name1 = new JTextField(12);
		email1 = new JTextField(12);
		gender1 = new JTextField(12);
		delete_id = new JTextField(12);
		name2 = new JTextField(12);
		email2 = new JTextField(12);
		gender2 = new JTextField(12);
		id2 = new JTextField(12);
		
		country1 = new JComboBox();
		country1.addItem("INDIA");
		country1.addItem("AMERICA");
		country1.addItem("AUSTRALIA");
		country1.addItem("PHILLIPHINES");
		country1.addItem("SPAIN");
		
		country2 = new JComboBox();
		country2.addItem("INDIA");
		country2.addItem("AMERICA");
		country2.addItem("AUSTRALIA");
		country2.addItem("PHILLIPHINES");
		country2.addItem("SPAIN");
		
		savebtn = new JButton(" Add ");
		resetbtn = new JButton(" Reset");
		editbtn1 = new JButton(" Edit ");
		editbtn2 = new JButton(" Save");
		deletebtn = new JButton("Delete");
		
		p1.add(namelabel1);
		p1.add(name1);
		p1.add(emaillabel1);
		p1.add(email1);
		p1.add(countrylabel1);
		p1.add(country1);
		p1.add(genderlabel1);
		p1.add(gender1);
		p1.add(savebtn);
		p1.add(resetbtn);
		
		p2.add(idlabel2);
		p2.add(id2);
		p2.add(namelabel2);
		p2.add(name2);
		p2.add(emaillabel2);
		p2.add(email2);
		p2.add(countrylabel2);
		p2.add(country2);
		p2.add(genderlabel2);
		p2.add(gender2);
		p2.add(editbtn1);
		p2.add(editbtn2);
		
		p3.add(deletelabel);
		p3.add(delete_id);
		p3.add(deletebtn);
		
		}
		void dis() {
		f.getContentPane().add(tp);
		tp.addTab("Add Record", p1);
		tp.addTab("Edit Record", p2);
		tp.addTab("Delete Record", p3);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setResizable(true);
		}
		public static void main(String z[]) throws Exception {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			Connection con=DriverManager.getConnection("jdbc:myDriver:myDatabase","Ieshaan"," hello");

		SecondGrid pro = new SecondGrid();
		pro.dis();
		}
		}

