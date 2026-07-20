//Question 9
import java.util.Scanner;
  public class SeperateTheDigitsInInteger {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the integer for Seperation: ");
		int number = input.nextInt();
		
		System.out.printf(" The Seperated integer is: %d %d %d %d ", (number % 10000/1000) , ( number % 1000/100), (number % 100/10), (number % 10) );
     }
}


	