//initialize your password constant and assign a value to it for login menu.
//set a counts in the loop
//State a condition that when the user input 1 it exits the login menu
// if the inputted password is equal to the declared password, it should print("password //sucessfully" else try again;
//

import java.util.Scanner;
public class LoginMenu {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	
	
	
	System.out.print("Enter Username: ");
	String userName = input.nextLine();

	int password = 0;
	
	int counter = 1;		
	do {

	
	System.out.print("Enter password: ");
	password = input.nextInt();
	
	System.out.println("Login Sucessfully");
	
	input.nextLine();

	System.out.print("Enter Username: ");
	userName = input.nextLine();
	counter++;
	
	}
	while(password != 1 );

	}
}




		