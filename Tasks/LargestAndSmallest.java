//Question 5
import java.util.Scanner;
  public class LargestAndSmallest {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your First integer: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter your Second Integer: ");
		int num2 = input.nextInt();
		
		System.out.println("Enter your Third integer: ");
		int num3 = input.nextInt();
		
		System.out.println("Enter your Fourth Integer: ");
		int num4 = input.nextInt();
		
		System.out.println("Enter your Fifth Integer: ");
		int num5 = input.nextInt();
		
		System.out.println("Enter your Sixth Integer: ");
		int num6 = input.nextInt();
		
		

		if     ( num1 > num2 && num2 > num3 && num3 > num4 && num4 > num5 && num5 > num6) {
			System.out.printf("The largest number is %d", num1);
		}
		else if( num2 > num1 && num1 > num3 && num3 > num4 && num4 > num5 && num5 > num6) {
			System.out.printf("The largest number is %d", num2);
		}
		else if( num3 > num1 && num1 > num2 && num2 > num4 && num4 > num5 && num5 > num6) {
			System.out.printf("The largest number is %d", num3);
		}
		else if( num4 > num1 && num1 > num2 && num2 > num3 && num3 > num5 && num5 > num6) {
			System.out.printf("The largest number is %d", num4);
		}
		else if( num5 > num1 && num1 > num2 && num2 > num3 && num3 > num4 && num4 > num6) {
			System.out.printf("The largest number is %d", num5);
		}

		else{ 
			System.out.printf("The largest number is %d%n", num6);
		}
		
				

		if    ( num1 < num2 && num2 < num3 && num3 < num4 && num4 < num5 && num5 < num6 ) {
			System.out.printf("The Smallest number is %d", num1);
		}
		else if( num2 < num1 && num1 < num3 && num3 < num4 && num4 < num5 && num5 < num6) {
			System.out.printf("The Smallest number is %d", num2);
		}
		else if( num3 < num1 && num1 < num2 && num2 < num4 && num4 < num5 && num5 < num6) {
			System.out.printf("The Smallest number is %d", num3);
		} 
		else if( num4 < num1 && num1 < num2 && num2 < num3 && num3 < num5 && num5 < num6) { 
			System.out.printf("The Smallest number is %d", num4);
		}
		else if( num5 < num1 && num1 < num2 && num2 < num3 && num3 < num4 && num4 < num6) { 
			System.out.printf("The Smallest number is %d", num5);
		}
		else {
			System.out.printf("The Smallest number is %d%n", num6);
		}


		
	}
}
