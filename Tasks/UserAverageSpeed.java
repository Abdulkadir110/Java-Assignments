//Write a program that prompts the user to enter the distance traveled in kilometers and the 
//time taken in hours and minutes, then displays the average speed.

import java.util.Scanner;
	public class UserAverageSpeed {
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the Distance traveled in Kilometers: ");
			double userDistance = input.nextDouble();
			
			
			System.out.print("Enter the Time taken in hours: ");
			double timeTakenInHrs = input.nextDouble();
			
			System.out.print("Enter the Time remaining in Minutes: ");
			double timeRemainingInMinutes = input.nextDouble();
			
			double MinuteTohour = (timeRemainingInMinutes)/60 ;

			double timeTaken = timeTakenInHrs + MinuteTohour;

			double userAverageSpeed = userDistance / timeTaken ;

			System.out.printf("The Average Speed of the User is: %f", userAverageSpeed);
	}
}
			
			
	