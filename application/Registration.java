package application;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Registration {
	
//	protected static String encrypt(String username) {
//		for(int i=0;i<username.length();i++) {
//			username.charAt(i);
//		}
//		username = ;
//		return username;
//	}
	
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
