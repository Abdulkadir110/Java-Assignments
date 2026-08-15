//Question 7
import java.util.Scanner;
  public class Multiples {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your First integer: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter your Second Integer: ");
		int num2 = input.nextInt();

		
		int num1_square = num1 * num1;
		int num2_cube = num2 * num2 * num2;


		if ( num1_square % num2_cube == 0 ) {
			System.out.printf("The Squared of the %d is a multiple of the cubed of the %d", num1 , num2);
		}
		else {
			System.out.printf("The Squared of the %d is not a multiple of the cubed of the %d", num1 , num2);
		}
	}
}