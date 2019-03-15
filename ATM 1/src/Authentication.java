import java.util.HashMap;
import java.util.Scanner;
public class Authentication {
HashMap pinhash ;

public Authentication () { pinhash.put("0092121542121", "1998");
}
	    private String cardnumber  ;
		//private String pinhash[] ;
         
		Scanner input = new Scanner(System.in);
		public void user(String cardnumber, String pin ) 
		{
			if (pin.compareTo("1998")==0) {
	   System.out.println("PIN Ok");
				}
				else {
				   System.err.println("Sorry Wrong PIN");
				}
			
			if (pin.compareTo("0092121542121")==0) {
				 System.out.println("please enter pin code");
				}
				else {
				   System.err.println("Sorry Wrong account");
				}
}
public boolean validate (String username , String password) {
	boolean validation ;
	String enteredPassword = (String)pinhash.get(username);
	if (enteredPassword != null) { 
		validation=enteredPassword.equals(password);
		} else {
		validation=false ;
	}
	return validation ;
	

} 


}
