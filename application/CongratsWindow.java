package application;

import java.sql.*;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.*;

public class CongratsWindow {
	
//	static Stage window = new Stage();
	static Scene scene = null;
	static Connection conn = null;
	static Statement stmt=null;
	static ResultSet rs = null;
	public static void display(String username,String password,Stage window) {
		
		String query = "select * from student where username='"+username+"'"+"and password='"+password+"'";
		
		try {
			conn=Connect.connect();
			
			if(conn!=null)
				stmt=conn.createStatement();
			if(stmt!=null)
				rs=stmt.executeQuery(query);
			
			if(rs.next()==true) {
				show(true,window);
			}else {
				show(false,window);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}finally {
			try {
				conn.close();				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void show(boolean val,Stage window) {
		
		Label message = null;
		StackPane layout1 =null;
		Label l2 = new Label("invalid Username and password");
		if(val==true) {
			message = new Label("Congrats you logged in successfully");
		}else {
			message = new Label("Access Denied");			
		}
		
		layout1 = new StackPane();
		layout1.getChildren().addAll(message);
		layout1.setAlignment(Pos.CENTER);
		scene = new Scene(layout1,400,400);
		window.setScene(scene);
		window.show();
	}
}