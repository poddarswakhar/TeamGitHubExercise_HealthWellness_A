import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter a password");
    	String pword = s.nextLine();
    	
    	if(functions.hasNum(pword))
    		System.out.println("Valid password");
    	else
    		System.out.println("Invalid password");
    }
}
