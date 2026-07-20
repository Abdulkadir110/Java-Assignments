import java.util.Scanner;
public class Calculator {
	public static void main (String[]args) {
	Scanner input = new Scanner(System.in);


	int numberOne = 3;
	int numberTwo = 5;
	

	if (numberOne > numberTwo)
		System.out.print("Awesome");
	else
		System.out.print("But Why");
	
}

}
















	
/**	
	int result= 0;
	int counter = 0;
	do {
	System.out.print("Enter the first number: ");
	int firstNumber = input.nextInt();
	input.nextLine();

	System.out.println("Enter your operator: ");
	char operationSymbol = input.next().charAt(0);

	System.out.print("Enter the second number: ");
	int secondNumber = input.nextInt();
	
		switch(operationSymbol)	{
		     case '+':
				result = firstNumber + secondNumber;
				break;
		     case '-':
				result = firstNumber - secondNumber;
				break;
		     case '/':
				result = firstNumber / secondNumber;
				break;	
		     case '*':
				result = firstNumber * secondNumber;
				break;
		}
		System.out.printf("The result is: %d%n", result);
	}
	while ( result != 0);
			

	}
			


} */
