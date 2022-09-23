import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Please enter a password to validate:\nPassword must be at least 8 character long and should " +
				"contain at least one uppercase, one number, and one special case [!@#$%&*()_+=|<>?{}\\[\\]~-]");
    	String pword = s.nextLine();
    	
    	if(functions.hasNum(pword) && functions.authenticateLength(pword) && functions.specialCharacter(pword)
				&& functions.oneUpperCase(pword)){
			System.out.println("Valid password");
		}
    	else
    		System.out.println("Invalid password");
    }
}
