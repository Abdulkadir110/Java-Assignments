/*
Start 
import Scanner
declare an input variable for scanner
declare a counter for each of the letter grade
Set a loop that counts from one to five for five students
then the loop that keep prompting the user to enter their names;
and its keep prompting the user to enter their letter grades.
then we create a switch with cases that whenever the user input a letter, it adds it to its counter. 
and if the user input a grade that is not among the listed letter grade it gives and invalid response and also increment its counter.
then we print all the counters.
End
**/
import java.util.Scanner;
public class StudentGrades {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int gradeA_Counter = 0;
		int gradeB_Counter = 0;
		int gradeC_Counter = 0;
		int gradeD_Counter = 0;
		int gradeF_Counter = 0;
		int invalidGradeCounter = 0;
		int averageScore = 0;

		String studentName;
		int score;

			System.out.print("Enter the number of students: ");
			int numberOfStudents = input.nextInt();

		for(int counter = 1; counter <= numberOfStudents; counter++)	{
			System.out.printf("Enter name for student%d: ", counter);
			studentName = input.next();
			System.out.println();
			
			input.nextLine();
			System.out.printf("Enter score for %s's: ", studentName);
				score = input.nextInt();

	

			if(score >= 80 && score <=100)	{
				System.out.printf("%s passed with excellent", studentName);
			}
			if(score >= 60 && score < 80)	{
				System.out.printf("%s passed with very good", studentName);
			}
			if(score >= 40 && score < 60)	{
				System.out.printf("%s passed with average", studentName);
			}
			if(score >= 20 && score <40)	{
				System.out.printf("%s passed with poor", studentName);
			}
			if(score >= 0 && score <20)	{
				System.out.printf("%s failed", studentName);
			}
			
			averageScore = score/numberOfStudents;

								
		
				System.out.println();
		}
			
		
		System.out.println(" <-------- Remarks --------> ");

		System.out.println();
				
		
	System.out.printf("The average score for all the students is: %d", averageScore);
		
		
	}
}
		
		

