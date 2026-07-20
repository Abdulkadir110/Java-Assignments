// Write a program that prompts the user to enter a temperature in Celsius and converts it to 
//Fahrenheit.

import java.util.Scanner;
	public class CelsiusTemperatureConverter{
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the temperature in Celsius: ");
			double celsius = input.nextDouble();
			
			double Fahrenheit = celsius * 1.8 + 32;
			
			System.out.printf("%f Celsius to Fahrenheit is: %f", celsius, Fahrenheit);
	}
} 