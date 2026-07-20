/** Question 75
To read 5 student marks


sequence : executing the intructions in the exact order as they appear 
collect input, read the user 5 student marks, check through the condtion block to know which grade to run

selection: The program chooses which block to run based on the condition and the student mark inputted to pass through the program

iteration: This repeatedly repeats a user input until it is 5.

*/

import java.util.Scanner;

public class StudentMarksAndGrade {
	public static void main(String[]args)	{
		Scanner input = new Scanner(System.in);
	
		for (int count = 1; count <= 5; count++)	{
			System.out.print("Enter your mark: ");
			int studentMark = input.nextInt();
			
			if (studentMark > 90) {
				System.out.println("your grade is A");
			}
			else if (studentMark < 90 && studentMark > 80) {
				System.out.println("your grade is B");
			}
			else if (studentMark < 80 && studentMark > 70) {
				System.out.println("your grade is C");
			} 
			else if (studentMark < 70 && studentMark > 60) {
				System.out.println("your grade is D");
			}
			else if (studentMark < 60 && studentMark > 50) {
				System.out.println("your grade is E");
			}
			else {
				System.out.println("your grade is F");
			}
		}

	}
}

		