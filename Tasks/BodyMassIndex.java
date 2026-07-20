//Write a program that prompts the user to enter weight in kilograms and height in meters, 
//then calculates and displays the BMI.

import java.util.Scanner;
  public class BodyMassIndex {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Weight(kilograms): ");
		double weight = input.nextDouble();
		
		System.out.println("Enter the height(meters): ");
		double height = input.nextDouble();

		double BMI = weight/(height * height);

		System.out.printf("The body mass index is: %f", BMI);
	}
}