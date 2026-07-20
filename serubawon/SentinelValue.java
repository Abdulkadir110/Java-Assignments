//Question 62;

//A sentinel value is value that when inputted by the user, it terminates the loop.
import java.util.Scanner;
public class SentinelValue {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int number = 0;
		while(number != -999) {
			System.out.print("Enter the integer: ");
			number = input.nextInt();
	
			counter++;

		}

	System.out.printf("The count of numbers is: %d%n", counter);
	}
}
