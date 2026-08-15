//	QUESTION 2

import java.util.Scanner;
  public class ComparingIntegers {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your First integer: ");
		int number = input.nextInt();

		int number_cube = number * number * number;
		
		if ( (number + number_cube) > 500 ) {
			System.out.println("The number and its Cube are greater than 500");
		} else if ((number + number_cube) == 500 ) {
			System.out.println("The number and its Cube are equal to 500");
		} else {
			System.out.println("The number and its Cube are less than 500");
		}
	}
}