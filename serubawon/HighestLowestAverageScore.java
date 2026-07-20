import java.util.Scanner;
public class HighestLowestAverageScore {
	public static void main (String [] args) { 
		
		Scanner input = new Scanner(System.in);
		int highest = 0;
		int sum = 0;
		int lowest = 0;
		int average = 0;
		System.out.print("Enter the exam Score: ");
		int examScore = input.nextInt();
		int counter = 0;

		while(examScore != 0) {
			System.out.print("Enter the exam Score: ");
			examScore = input.nextInt();
	
			sum += examScore;
						
			if ( highest < examScore) {
				highest = counter;
			}
			if ( lowest > examScore) {
				lowest = examScore;
			}

			average = sum / 7;
			counter++;

	
		}
		System.out.printf("The highest number is: %d%n", highest);
		System.out.printf("The lowest number is: %d%n", lowest);
		System.out.printf("The average of the numbers is: %d%n", average);
	}

}

