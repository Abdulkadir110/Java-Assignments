/** Start
* Import the scanner in java.util library
* Prompt the user input to collect the student score that is marked out of 50
* Initialize the variable for idoublent Student score
* Declare double scaledScore = (score / 50) * 100;
* prints the original score and scaled score;
  end */

import java.util.Scanner;
	public class StudentScoreCalculator {
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter your mark out of 50: ");
			double originalMarks = input.nextDouble();
	
			double scaledMarks = (originalMarks / 50) * 100;
	
	System.out.printf("The original Mark is %.2f out of 50 and the scaled mark is %.2f out of 100", originalMarks, scaledMarks);
		}
	}


