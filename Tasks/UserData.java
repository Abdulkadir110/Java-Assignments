//Write a program that collects the user's name and age then if the user is older than 18, it tells the user is an adult if not he is a child




/** Start
* Import the scanner in java.util library
* Prompt the user input to collect the username
* Initialize the variable for string username
* Prompt the user input to collect the age
* Initialize the variable for int age
* if the user age is greater than 18; print the username is an adult
* else the user name is a child.
end */

import java.util.Scanner;
	public class UserData {
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter your name: ");
			String userName = input.nextLine();
	
			System.out.print("Enter your age: ");
			int ageOfTheUser = input.nextInt();
			
			if(ageOfTheUser > 18)	{
				System.out.printf("%s is an adult", userName);
			}
			else	{
				System.out.printf("%s is a child", userName);
			}
		}
	}

	