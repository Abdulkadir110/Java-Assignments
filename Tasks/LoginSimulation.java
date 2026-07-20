import java.util.Scanner;
public class LoginSimulation {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	
	
	
	System.out.print("Enter Username: ");
	String userName = input.nextLine();

	
	
	int counter = 1;		
	do {

	
	System.out.print("Enter password: ");
	String password = input.nextLine();
	
	System.out.println("Login Sucessfully");
	counter++;
	break;
	}
	while(counter <= 5 );

	}
}


