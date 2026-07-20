/** Start
* Import the scanner in java.util library
* Prompt the user input to collect the celsius
* Initialize the variable for double celsius
* Declare the variable to calculate Fahrenheit
* prints the statement to out the value calculated.;
  end */


import java.util.Scanner;
	public class CelsiusToFahrenheitConverter{
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the temperature in Celsius: ");
			double celsius = input.nextDouble();
			
			double Fahrenheit = (celsius * 1.8) + 32;
			
			System.out.printf("%f Celsius to Fahrenheit is: %.2f", celsius, Fahrenheit);
	}
} 