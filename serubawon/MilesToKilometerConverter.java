/** Start
* Import the scanner in java.util library
* Prompt the user input to collect the distance in miles
* Declare the variable to calculate distance in kilometer = miles * 1.60934
* prints the statement to out the value of the kilometers calculated.;
  end */


import java.util.Scanner;
	public class MilesToKilometerConverter{
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the distance in Miles: ");
			double distanceInMiles = input.nextDouble();
			
			// 1 mile = 1.60934 km
			double distanceInKilometers = distanceInMiles * 1.60934;
			
			System.out.printf("The kilometer equivalent of %.2f Miles is: %.2f Kilometers", distanceInMiles, distanceInKilometers);
	}
} 