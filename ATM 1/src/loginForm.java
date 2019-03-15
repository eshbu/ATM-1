//import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;

  public class loginForm {
	Stage stage;
	  Scene scene ;
	  Authentication authentication ;
	  HomePage homepage;
	  
	 public loginForm(Stage stage) {
	 this.stage= stage;  
	 }
  public void drawScene() 
  {
	authentication = new Authentication();
	Label usernameLabel = new Label ();
	Label passwordLabel = new Label ();
    TextField usernameField = new TextField();
    PasswordField passwordField = new PasswordField();
    Button submit = new Button();
    
     Label validationLabel = new Label ();
    
    GridPane grid = new GridPane();

    grid.add(usernameLabel, 50 ,30);
    grid.add(passwordLabel, 20, 50);
    grid.add(usernameField, 70, 30);
    grid.add(passwordField, 60 , 50);
    grid.add(submit, 70, 70);
    grid.add(validationLabel, 80, 80);

    submit.setOnAction(new EventHandler<ActionEvent>() {
    	public void handle(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();	
     boolean valid = authentication.validate(username,password);
      if (valid)
      { validationLabel.setText("Welcome to your bank");
    	 stage .setScene(homepage.getScene()); 
    	  
      } else { validationLabel.setText("wrong username");
    	  
      }}  
    
    });
   
}
 
public Scene getScene() {
  return this.scene;
  
  }


public HomePage getHomepage() {
	return homepage;
}


public void setHomepage(HomePage homepage) {
	this.homepage = homepage;
}}
