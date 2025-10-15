package BankPackage;

import java.sql.*;
public class Conn {
	public Connection c;
	public Statement s;
	//Steps for JDBC connectivity
	
	// Create Connection
	public Conn() throws SQLException {
		
		try {
			//1-Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2-create connection
			//c=DriverManager.getConnection("jdbc:mysql:///bankmanagmentsystem","root","root");
			//c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagmentsystem", "root", "root");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagmentsystem", "root", "root");

			System.out.println("Connection created");
			c.setAutoCommit(true);            // ensure auto-commit is ON

			//3-Statement creation
			s=c.createStatement();
			
			System.out.println("Connected DB (catalog): " + c.getCatalog());
		    System.out.println("Connected URL: " + c.getMetaData().getURL());
		}
		catch(Exception e) {
			System.out.println(e);
		    e.printStackTrace();

		    
		    

		}
	}
}
