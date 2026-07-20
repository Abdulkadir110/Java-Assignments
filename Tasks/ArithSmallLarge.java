// Question 3
import java.util.Scanner;
  public class ArithSmallLarge {
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


		int sum = num1 + num2 + num3 + num4;
		int average = (num1 + num2 + num3 + num4) / 4;
		int product = num1 * num2 * num3 * num4;

		System.out.printf("The sum of the four integers is: %d", sum);
		System.out.printf("The product of the four integers is: %d", product);
		System.out.printf("The average of the four integers is: %d", average);
		
		if( num1 < num2 && num2 < num3 && num3 < num4) {
			System.out.printf("The Smallest number is %d", num1);
		}
		else if( num2 < num1 && num1 < num3 && num3 < num4) {
			System.out.printf("The Smallest number is %d", num2);
		}
		else if( num3 < num1 && num1 < num2 && num2 < num4) {
			System.out.printf("The Smallest number is %d", num3);
		} else{ 
			System.out.printf("The Smallest number is %d", num4);
		}



		if( num1 > num2 && num2 > num3 && num3 > num4) {
			System.out.printf("The largest number is %d", num1);
		}
		else if( num2 > num1 && num1 > num3 && num3 > num4) {
			System.out.printf("The largest number is %d", num2);
		}
		else if( num3 > num1 && num1 > num2 && num2 > num4) {
			System.out.printf("The largest number is %d", num3);
		}else{ 
			System.out.printf("The largest number is %d", num4);
		}
	}
}
		
		
		
		

		
