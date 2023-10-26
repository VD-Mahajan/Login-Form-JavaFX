package application;

import java.sql.*;

public class Connect {
	
	public static Connection connect() throws SQLException,ClassNotFoundException{
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Vishal@1234");	
		
		return conn;
	}
}
