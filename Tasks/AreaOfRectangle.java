//Question 5
import java.util.Scanner;
  public class AreaOfRectangle {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle: ");
		int length = input.nextInt();
		
		System.out.println("Enter the width of the rectangle: ");
		int width = input.nextInt();
		
		int area = length * width;
		
		System.out.printf(" The Area of the rectangle is: %d", area);
	}
}