package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Register {
	
	static Stage window;

	public static void displayRegister(Stage primaryStage){
		window=primaryStage;
		
		GridPane layout = new GridPane();
		layout.setPadding(new Insets(20,20,20,20));
		layout.setVgap(20);
		layout.setHgap(20);
		layout.setAlignment(Pos.CENTER);
		
		Label username= new Label("Username : ");
		layout.setConstraints(username, 0, 0);
		TextField usernameTextField = new TextField();
		layout.setConstraints(usernameTextField, 1, 0);
		usernameTextField.setPromptText("username");
		
		Label password = new Label("Password : ");
		layout.setConstraints(password, 0, 1);
		TextField passwordTextField = new TextField();
		layout.setConstraints(passwordTextField, 1, 1);
		passwordTextField.setPromptText("password");
		
		Button registerButton = new Button("Register");
		layout.setConstraints(registerButton, 1, 2);
		registerButton.setOnAction(e->Registration.register(usernameTextField.getText(),passwordTextField.getText()));
		
		layout.getChildren().addAll(username,usernameTextField,password,passwordTextField,registerButton);
		
		Scene scene = new Scene(layout,400,400);
		window.setTitle("Registration Page");
		window.setScene(scene);
		window.show();		
		
	}
	
}
