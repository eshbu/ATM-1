import javafx.scene.Scene ;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class HomePage {

	Scene scene;
	loginForm LoginForm;
	Stage stage;
	public HomePage (Stage stage ){
		this.stage=stage;
	}
	
	
	public void drawScene(){
		String text;
		Label Welcome = new Label();
		Label InquiryBalance = new Label();
		Button Enter = new Button();
		Button Deposit = new Button();
		Button Withdraw = new Button();
		Button Inquirybalance = new Button();
		Button Previous = new Button();
		Button Next = new Button();
		GridPane grid = new GridPane();
		grid.add(Welcome, 30, 30);
		grid.add(InquiryBalance, 60, 70);
		grid.add(Enter, 10, 20);
		grid.add(Deposit, 20, 30);
		grid.add(Withdraw, 30, 40);
		grid.add(InquiryBalance, 40, 50);
		grid.add(Previous, 50, 60);
		grid.add(Next, 60, 70);
       scene = new Scene(grid,600,300);
	}
	
	public Scene getScene() {
		return scene;
	
	}

	public loginForm getLoginForm() {
		return LoginForm;
	}

	
	
	public void setLoginForm(loginForm loginForm) {
		LoginForm = loginForm;
	}
	
	
}
    


