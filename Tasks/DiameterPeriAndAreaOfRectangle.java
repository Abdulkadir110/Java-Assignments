//Question 8
import java.util.Scanner;
  public class DiameterPeriAndAreaOfRectangle {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle: ");
		int a = input.nextInt();
		
		System.out.println("Enter the width of the rectangle: ");
		int b = input.nextInt();

		
		System.out.printf( " The Perimeter of the rectangle is %d\n The Area of the rectangle is %d\n The length of the diagonal is %f ", (2 * (a + b)) , (a * b) , ( ( (1.41421 * ( (a * a) + (b * b) )) / 2) ));
	}
}  