package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Stage window;
	@Override
	public void start(Stage primaryStage){
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
		
		Button submitButton = new Button("Submit");
<<<<<<< HEAD
		layout.setConstraints(submitButton, 0, 2);
		submitButton.setOnAction(e->CongratsWindow.display(usernameTextField.getText(),passwordTextField.getText(),window));

		Button registrationPageButton = new Button("Go To Registration Page");
		layout.setConstraints(registrationPageButton, 1, 2);
		registrationPageButton.setOnAction(e->Register.displayRegister(window));
		
		layout.getChildren().addAll(username,usernameTextField,password,passwordTextField,submitButton,registrationPageButton);
		
		Scene scene = new Scene(layout,400,400);
		window.setTitle("Login Page");
=======
		layout.setConstraints(submitButton, 1, 2);
		submitButton.setOnAction(e->Congrats.display(usernameTextField.getText(),passwordTextField.getText(),primaryStage));
		
		layout.getChildren().addAll(username,usernameTextField,password,passwordTextField,submitButton);
		
		Scene scene = new Scene(layout,400,400);
>>>>>>> 9433620a6fa9da910fb43c9201b222c2736fc9f3
		window.setScene(scene);
		window.show();		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 9433620a6fa9da910fb43c9201b222c2736fc9f3
