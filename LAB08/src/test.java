import java.util.*;
import java.sql.*;
public class test {
	public static void main(String[] args) throws Exception{
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con=DriverManager.getConnection("jdbc:myDriver:myDatabase","Ieshaan"," hello");

	}
}
