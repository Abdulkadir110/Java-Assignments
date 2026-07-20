import java.util.Scanner;

public class AreaCircumDiameterOfCircle{
		public static void main(String[]args) {

		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter the radius of the circle: ");

 		double r = input.nextDouble();


		double diameter = r * 2;
		double circum = 2 * Math.PI * r;
		double area = Math.PI * r * r;
			

	System.out.printf(
         		"The diameter of the circle is: %.2f%n" +
            		"The circumference of the circle is: %.2f%n" +
            		"The area of the circle is: %.2f%n",
            		diameter, circum, area
        );	
		}
	
			
	}