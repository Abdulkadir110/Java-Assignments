/** Suppose the Triangle is labeled ABC, 
Collect input for the coordinates of triangle ABC, A(x1,y1),B(x2,y2),C(x3,y3) from the user;
    then we calculate the distance from one point to another till the triangle is completed.
 the values gotten are assigned to the variables Side1, Side2 and Side3 respectively to calculate for s.
 So we calculate Area by substituting the values in the formula fro area.
 print the Area of the Triangle ABC. */

    

import java.util.Scanner;
public class GeometryAreaOfATriangle {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double x3 = 0;
		double y3 = 0;	
		System.out.print("Enter three points for a triangle: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
			
		double DistancefromPointAToPointB = Math.pow( ( ( (x2 - x1) * (x2 - x1) ) + ( (y2 - y1) * (y2 - y1) ) ), 0.5);
		double DistancefromPointBToPointC = Math.pow( ( ( (x3 - x2) * (x3 - x2) ) + ( (y3 - y2) * (y3 - y2) ) ), 0.5);
		double DistancefromPointCToPointA = Math.pow( ( ( (x3 - x1) * (x3 - x1) ) + ( (y3 - y1) * (y3 - y1) ) ), 0.5);
		
		double side1 = DistancefromPointAToPointB;
		double side2 = DistancefromPointBToPointC;
		double side3 = DistancefromPointCToPointA;
	
		double s = (side1 + side2 + side3)/2;
		double area = Math.pow( (s * ((s -side1)*(s-side2)*(s-side3)) ), 0.5);
	
		System.out.printf("The area of the triangle is %.1f", area);
	}
}