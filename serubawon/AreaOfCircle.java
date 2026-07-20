/** Start
* Import the scanner in java.util library
* Prompt the user input to collect the radius
* Initialize the variable for double price
* Declare the variable for Pi = 3.142;
* Declare area = Pi * r * r;
* prints the result of the area;
  end */


import java.util.Scanner;
	public class AreaOfCircle{
		public static void main(String[]args) {

		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter the radius of the circle: ");

 		double r = input.nextDouble();
		double Pi = 3.142;
		double area = Pi * r * r;
			

		System.out.printf("The area of the circle is: %.2f%n", area);	
		}
	
			
	}