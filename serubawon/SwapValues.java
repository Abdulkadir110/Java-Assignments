/** Start
* Declare firstNumber and assign 100;
* Declare secondNumber and assign 50;
* Display the label for both integers before swapped
* Declare a temporary variable and assign the variable name first number to it.
* Now firstNumber variable is empty, assign secondnumber varibale to it
* then assign the temporary variable value gotten from first number previously into secondnumber variable.
End */
public class SwapValues	{
	public static void main(String[]args)	{
		int firstNumber = 100;
		int secondNumber = 50;

		
	System.out.printf("Before Swap, firstNumber is %d and secondNumber is %d%n", firstNumber, secondNumber);
		
		int temporaryVariable = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temporaryVariable;

	System.out.printf("After Swapped, firstNumber is %d and secondNumber is %d", firstNumber, secondNumber);
	
	}
}