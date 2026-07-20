/**  
Collect input for amount of water in kilograms, the initial and final temperatures of the water from the user;
then we calculate the energy needed to heat water from the initial temperatures to the final temperatures of the water. using the formula Q = M * (finalTemperature - initialTemeperature) * 4184; where M is the weight of the water in kg.
 */

    

import java.util.Scanner;
public class CalculatingEnergy {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		double weightOfTheWater = 0;
		double initialTemperatureOfTheWater = 0;
		double finalTemperatureOfTheWater = 0;

		System.out.print("Enter the amount of water in kilogams: ");
		 weightOfTheWater = input.nextDouble();
		System.out.print("Enter the initial temperature: ");
		 initialTemperatureOfTheWater = input.nextDouble();
		System.out.print("Enter the final temperatue: ");
		 finalTemperatureOfTheWater= input.nextDouble();
	
		 
			
		double Energy =  weightOfTheWater * (finalTemperatureOfTheWater - initialTemperatureOfTheWater) * 4184;
		System.out.printf("The energy needed is: %.2f ", Energy);
	}
}