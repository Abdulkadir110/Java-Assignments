//Question 2
import java.util.Scanner; 
public class TotalAverage {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your First integer: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter your Second Integer: ");
		int num2 = input.nextInt();
		
		System.out.println("Enter your Third integer: ");
		int num3 = input.nextInt();
		
		int average = (num1 + num2 + num3) / 3;
		int total = num1 + num2 + num3;


		
		System.out.printf("The total is %d%n The Average is %d", total , average);
	}
}

