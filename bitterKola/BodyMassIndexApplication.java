/** Start
* import Scanner from the library;
* Prompt the user to collect input for weight
* initialize the first number variable. 
* Prompt the user to collect input for height
* initialize the second number variable. 
* Declare tthe BMI variable and assign the formula to it.
* if BMI <= 18.5, print underweight else if BMI <=24.9, print normal, else if BMI <= 29.9, print overweight and else print obese.

End */

import java.util.Scanner;
  public class BodyMassIndexApplication {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Weight(kilograms): ");
		double weight = input.nextDouble();
		
		System.out.print("Enter the height(meters): ");
		double height = input.nextDouble();

		double BMI = weight/(height * height);
		
		if(BMI <= 18.5) {
			System.out.print("the person is underweight");
		} else if(BMI <= 24.9) {
			System.out.print("the person is normal");
		} else if(BMI <= 29.9) {
			System.out.print("the person is overweight");			 
		} else {
			System.out.print("the person is obese");
		}
	}
}