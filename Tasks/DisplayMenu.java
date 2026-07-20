import java.util.Scanner;
public class DisplayMenu {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	
	
	
	System.out.print("Enter Username: ");
	String userName = input.nextLine();

	
	
	String counter = "R";		
	do {

	
	System.out.print("Enter password: ");
	String password = input.nextLine();
	
	System.out.println("Login Sucessfully");
	
	
	}
	while(counter != "exits" );

	}
}


