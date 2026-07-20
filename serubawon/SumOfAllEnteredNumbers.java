import java.util.Scanner;
public class SumOfAllEnteredNumbers {
	public static void main (String [] args) { 
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter the integer: ");
		int number = input.nextInt();
		int counter = 0;
		while(number != 0) {
			System.out.print("Enter the integer: ");
			number = input.nextInt();
	
			sum += number;
			System.out.printf("The sum of the numbers is: %d%n", sum);
			counter++;

	
		}
	}

}

