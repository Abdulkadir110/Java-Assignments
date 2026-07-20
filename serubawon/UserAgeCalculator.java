/** Start
* Import the scanner in java.util library
* Prompt the user input to collect the person first name
* Initialize the variable for string firstName
* Prompt the user input to collect the person last name
* Initialize the variable for string lastName
* Prompt the user input to collect the person year of birth
* Initialize the variable for int BirthYear 
* Declare the age = 2025 - BirthYear
* prints the age of the person;
  end */

import java.util.Scanner;
	public class UserAgeCalculator {
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter your first name: ");
			String firstName = input.nextLine();
	
			System.out.print("Enter your last name: ");
			String lastName = input.nextLine();

			System.out.print("Enter your birth year: ");
			int birthYear = input.nextInt();

			int age = 2025 - birthYear;
			
	System.out.printf("Hello %s, %s, your age is: %d", lastName, firstName, age);
		}
	}


