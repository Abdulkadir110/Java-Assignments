//Question 6
import java.util.Scanner;
  public class InterestCalculator {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Principal Amount: ");
		double P = input.nextInt();
		
		System.out.println("Enter the Rate: ");
		double R = input.nextInt();
		
		System.out.println("Enter the Time: ");
		double T = input.nextInt();
	
	
		double SimpleInterest = (P * R * T)/100;

		System.out.printf("The Simple interest of the amount is: %f", SimpleInterest);
	}
}
