import java.util.Scanner;
  public class TheAreaAndPerimeterOfTriangle {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the right side of the triangle: ");
		double rightSide = input.nextInt();
		
		System.out.println("Enter the left side of the triangle: ");
		double leftSide = input.nextInt();
	
		System.out.println("Enter the base side of the triangle: ");
		double baseSide = input.nextInt();
		
		System.out.println("Enter the height of the triangle: ");
		double height = input.nextInt();

		double Area =  0.5 * baseSide * height;
		double perimeter = rightSide + leftSide + baseSide;


		System.out.printf("The Area of the triangle is: %f%n And the perimeter is: %f", Area, perimeter);
	}	
}