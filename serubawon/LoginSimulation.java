import java.util.Scanner;

public class LoginSimulation {
	public  static void main (String[]args)	{
		Scanner input = new Scanner(System.in);	
		
		System.out.print("Enter your username: ");
		String username = input.nextLine();
		
		System.out.print("Enter your password: ");
		int password = input.nextInt();
		
		String correctUsername = "Admin";
		int correctPassword = 1234;
	
		if (username.equals(correctUsername) && password == correctPassword) {
			System.out.println("Access granted");
		}
		else {
			System.out.println("Access denied");
		}
	}
}			
