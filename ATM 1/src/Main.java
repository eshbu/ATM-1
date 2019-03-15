import java.util.ArrayList ;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import java.util.Scanner;

public class  Main extends Application  {
	
    private double balance=0;
	private static Scanner in;
    double amount;
    double output;
    float deposit  ;
    Scanner input = new Scanner(System.in);
     public static void main (String[] args ) {
    	 launch(args); 
       in = new Scanner(System.in);
        transaction(); }
     
    private static void transaction(){
         
         
System.out.println("Welcome to your bank please select an option"); 
		System.out.println("Withdraw");
		System.out.println("Deposit");
		System.out.println("Inquiry Balance");

    }
 
      public void   withdrawl (double amount){
		System.out.println("Please enter the amount you want to withdrawl "); 
	    amount = in.nextFloat();
		Scanner scanner = new Scanner(System.in);
	if (amount <= balance){
    	balance = balance - amount;
    	
    	 }  else {
    		System.err.println("Sorry check your balance");
     
    	}
	
    }
	public void deposit(double amount){
		
		
		System.out.println("Please enter the amount you want to deposit ");
		amount=in.nextDouble();
		balance = balance + amount;
		System.out.println("you just have deposited "+deposit+"");
		
		  }
    public  double inquiryBalance () {
    	return balance;}


public void start (Stage primaryStage) throws Exception {
	primaryStage.setTitle("MyAtm");
   
loginForm LoginForm =new loginForm(primaryStage);
HomePage homePage = new HomePage(primaryStage);

LoginForm.drawScene();
homePage.drawScene();

LoginForm.setHomepage(homePage);
primaryStage.setScene(LoginForm.getScene());
primaryStage.show();  }}