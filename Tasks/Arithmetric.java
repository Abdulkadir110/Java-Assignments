//Write an application that asks the user to enter two intergers,obtains them from the user, //and prints the cube of each number,the product of their cubes, and the remainder when the //larger cube is divided by the smaller cube.

import java.util.Scanner;
  public class Arithmetric {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your First integer: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter your Second Integer: ");
		int num2 = input.nextInt();
	
		int cube_num1 = num1 * num1 * num1;
		int cube_num2 = num2 * num2 * num2;

		int product = cube_num1 * cube_num2;
		int remainder;

		if(cube_num1 > cube_num2){
			remainder = cube_num1 % cube_num2;
		}
		else {
			remainder = cube_num2 % cube_num1;
		}
		
	
		System.out.printf("The Cube of the first number is %d%nThe Cube of the second number is %d%n The remainder is %d", cube_num1, cube_num2, remainder);
		
	}
 }