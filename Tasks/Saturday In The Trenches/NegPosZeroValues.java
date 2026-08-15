//Question 10
import java.util.Scanner;
  public class NegPosZeroValues {
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

	
		
		if(num1 < 0 && num2 < 0 && num3 < 0 && num4 < 0 && num5< 0 && num6 < 0) {
			System.out.print("The count for all negative number are 6");
		}
		else if(num1< 0 && num2 <0  && num3 < 0 && num4 < 0 && num5 < 0) {
			System.out.print("The count for all negative number are 5");
		}
		else if(num1 < 0 && num2 < 0 && num3 < 0 && num4 < 0) {
			System.out.print("The count for all negative number are 4");
		}
		else if(num1 < 0 && num2 < 0 && num3 < 0) {
			System.out.print("The count for all negative number are 3");
		}
		else if(num1 < 0 && num2 < 0) {
			System.out.print("The count for all negative number are 2");
		}
		else if (num1 < 0) {
			System.out.print("The count for all negative number is 1");
		}
		else {
			System.out.print("No negative number counted");
		}


		if(num1> 0 && num2 > 0 && num3>0 && num4 >0 && num5 >0 && num6 > 0) {
			System.out.print("The count for all positive number are 6");
		}
		else if(num1 > 0 && num2 > 0 && num3 > 0 && num4 > 0 && num5 > 0) {
			System.out.print("The count for all positive number are 5");
		}
		else if(num1 > 0 && num2 > 0 && num3 > 0 && num4 > 0) {
			System.out.print("The count for all positive number are 4");
		}
		else if(num1 > 0 && num2 > 0 && num3 > 0) {
			System.out.print("The count for all positive number are 3");
		}
		else if(num1 > 0 && num2 > 0) {
			System.out.print("The count for all positive number are 2");
		}
		else if (num1 > 0) {
			System.out.print("The count for all positive number is 1");
		}
		else {
			System.out.print("No positive number counted");
		}

		if(num1 == 0 && num2 == 0 && num3 == 0 && num4 == 0 && num5 == 0 && num6 == 0) {
			System.out.print("The count for all zero number are 6");
		}
		else if(num1 == 0 && num2 == 0 && num3 == 0 && num4 == 0 && num5 == 0) {
			System.out.print("The count for all zero number are 5");
		}
		else if(num1 == 0 && num2 == 0 && num3 == 0 && num4 == 0) {
			System.out.print("The count for all zero number are 4");
		}
		else if(num1 == 0 && num2 == 0 && num3 == 0) {
			System.out.print("The count for all zero number are 3");
		}
		else if(num1 == 0 && num2 == 0) {
			System.out.print("The count for all zero number are 2");
		}
		else if (num1 == 0) {
			System.out.print("The count for all zero number is 1");
		}
		else {
			System.out.print("No zero number counted");
		}

		
		
		


	}
}





