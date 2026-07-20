//Assume a runner runs 14km in 45minutes and 30 seconds. Write a program  that display the average speed in miles per hour
//note that 1 mile is 1.6 km.


	public class AverageSpeed {
		public static void main (String[]args) {
			double distanceKm = 14;
			double distanceInMiles = distanceKm / 1.6;
			double timeInSeconds = 2700 + 30;
			double timeInHour = timeInSeconds / 3600;
			double averageSpeed = distanceInMiles / timeInHour;

			System.out.printf("The Distance In Miles: %f%n, The time in hour is: %f%n, The Average Speed of the runner is in MilesPerHour: %f", distanceInMiles, timeInHour, averageSpeed);
		}
	}
			
			 
			