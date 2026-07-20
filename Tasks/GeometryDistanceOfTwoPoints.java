/**  
Collect input for the coordinates of the two point A and B, A(x1,y1),B(x2,y2), from the user;
 then we calculate the distance between the two points.
 */

    

import java.util.Scanner;
public class GeometryDistanceOfTwoPoints {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;	
		System.out.print("Enter x1 and y1: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
	
			
		double DistancefromPointAToPointB = Math.pow( ( ( (x2 - x1) * (x2 - x1) ) + ( (y2 - y1) * (y2 - y1) ) ), 0.5);
		
		System.out.printf("The distance between the two points is: %f", DistancefromPointAToPointB);
	}
}