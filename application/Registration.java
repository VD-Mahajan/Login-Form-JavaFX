package application;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Registration {
	
	public static void register(String username,String password) {
		Connection conn=null;
		Statement st=null;
		String query = "insert into student values ('"+username+"','"+password+"')";
		try {
			conn = Connect.connect();			
			if(conn!=null)
				st = conn.createStatement();
			if(st!=null)
				st.executeUpdate(query);
		}catch(ClassNotFoundException ce) {
			
		}catch(SQLException se) {
			
		}			
		System.out.println(username+"  "+password+" inserted ");
	}
}
