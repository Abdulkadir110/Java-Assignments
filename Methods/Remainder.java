public class Remainder {
	public static void main(String [] args) {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();

		int remainderResult = remainderOf(firstNumber, secondNumber);
		System.out.println("The remainder is: " + remainderResult);
		

	}
	public static int remainderOf(int firstNumber, int secondNumber)	{
		int remainder = firstNumber % secondNumber;
		return remainder;
	}
}
