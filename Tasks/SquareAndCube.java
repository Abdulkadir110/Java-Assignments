//Question 10;

import java.util.Scanner;
  public class SquareAndCube {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		
		int square = number * number;
		int cube = number * number * number;
		System.out.printf("The square of the number is: %d%n The Cube of the number is %d", square, cube);
	}
}
