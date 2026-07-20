import java.util.Scanner;
public class OperationCode {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);
	
	
	int result= 0;
	int counter = 0;
	
	System.out.print("Enter the first number: ");
	int firstNumber = input.nextInt();
	input.nextLine();

	System.out.println("Enter your operator: ");
	String operationSymbol = input.nextLine();

	System.out.print("Enter the second number: ");
	int secondNumber = input.nextInt();
	
		switch(operationSymbol)	{
		     case +:
				result = firstNumber + secondNumber;
				break;
		     case -:
				result = firstNumber - secondNumber;
				break;
		     case /:
				result = firstNumber / secondNumber;
				break;	
		     case *:
				result = firstNumber * secondNumber;
				break;
						
		}
		System.out.printf("The result is: %d%n", result);
	
	
			

	}
			


}
