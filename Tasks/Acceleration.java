/**  
Collect input for the starting velocity(v0)m/s, the ending velocity(v1)m/s and time taken (t) in seconds, from the user;
 then we calculate the average acceleration by substituting the collected inputs in to the formula for acceleration.
*/

    

import java.util.Scanner;
public class Acceleration {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		double startingVelocity = 0;
		double endingVelocity = 0;
		double timeTaken = 0;
			
		System.out.print("Enter v0, v1 and t: ");
		startingVelocity = input.nextDouble();
		endingVelocity = input.nextDouble();
		timeTaken = input.nextDouble();
	
			
		double averageAcceleration = (endingVelocity - startingVelocity) / timeTaken;	
		System.out.printf("The average acceleration is: %.4f", averageAcceleration);
	}
}