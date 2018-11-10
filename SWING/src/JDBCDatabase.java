import java.sql.*;

public class JDBCDatabase {
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";
	   static final String USER = "username";
	   static final String PASS = "password";
	   
	   public static void main(String[] args) throws ClassNotFoundException{
		   Connection conn = null;
		   Statement stmt = null;
		   try{
			      //STEP 2: Register JDBC driver
			      Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			    //STEP 3: Open a connection
			      System.out.println("Connecting to a selected database...");
			      conn = DriverManager.getConnection("jdbc:derby:cust;create=true;user=app;password=app");
			      System.out.println("Connected database successfully...");
			      //STEP 4: Execute a query
			      System.out.println("Creating table in given database...");
			      stmt = conn.createStatement();
			      String sql = "CREATE TABLE REGISTRATION " +
		                   "(id INTEGER not NULL, " +
		                   " first VARCHAR(255), " + 
		                   " last VARCHAR(255), " + 
		                   " age INTEGER, " + 
		                   " PRIMARY KEY ( id ))";
			      stmt.executeUpdate(sql);
			      System.out.println("Created table in given database...");
		   }
		   catch(SQLException se){
			      //Handle errors for JDBC
			   System.out.println("SQLE");
			      //se.printStackTrace();
			   }
		   catch(Exception e){
			      //Handle errors for Class.forName
			   System.out.println("E");   
			   e.printStackTrace();
			      
			   }
		   finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            conn.close();
			      }catch(SQLException se){
			    	  System.out.println("FINALLY 1SQLE");
			      }// do nothing
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){ System.out.println("FINALLY 2SQLE");
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
}
}
