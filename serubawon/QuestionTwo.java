/** Start
* Import the scanner in java.util library
* Prompt the user input to collect the student name
* Initialize the variable for string username
* Prompt the user input to collect the student age
* Initialize the variable for int age
* prints "Hello, variable-studentname. You are variable-studentage years old;
  end */

import java.util.Scanner;
	public class QuestionTwo {
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the student name: ");
			String studentName = input.nextLine();
	
			System.out.print("Enter the student age: ");
			int studentAge = input.nextInt();
			
			System.out.printf("Hello, %s. You are %d years old", studentName, studentAge);
		}
	}


