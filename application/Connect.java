package application;

import java.sql.*;

public class Connect {
	
	public static Connection connect() throws SQLException,ClassNotFoundException{
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Vishal@1234");	
		
		return conn;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 9433620a6fa9da910fb43c9201b222c2736fc9f3
