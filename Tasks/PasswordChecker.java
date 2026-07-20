//initialize your password constant and assign a value to it.
//set a counts that loops from 1 to 5, inorder to counts the number of times the user //inputted  wrong passowrd
// if the inputted password is equal to the declared password, it should print("password //sucessfully" else try again;

import java.util.Scanner;
public class PasswordChecker {
	public static void main(String[]args)	{
	   Scanner input = new Scanner(System.in);
		
		int password = 878;
		
		
		System.out.print("Enter the password: ");
		int userInputPassword = input.nextInt();


		int counter = 1;
		
		while (userInputPassword != 1) {
		
		System.out.print("Enter the password: ");
		userInputPassword = input.nextInt();


		if(userInputPassword == password)	{
			System.out.print("The password is correct! ");
			break;
		}
		
		
		else {
			System.out.println("Try again");
			
			System.out.print("Enter the password: ");
			userInputPassword = input.nextInt();
				System.out.println("Try again");
			}
			counter++;

		}
	}
}



		