//Question 6
import java.util.Scanner;
  public class DivisibleBy7 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int number = input.nextInt();
		
		if ( number % 7 == 0) {
			System.out.println("The number is divisible by 7 ");
		}
		else if ( number % 7 != 0) {
			System.out.println("The number is not divisible by 7");
		
		}
		else {
			System.out.println("The number is equal to zero ");
		}



		
		if ( number % 2 == 0) {
			System.out.println("The number is an even number");
		}
		else {
			System.out.println("The number is an odd number");
		}

	}
}
