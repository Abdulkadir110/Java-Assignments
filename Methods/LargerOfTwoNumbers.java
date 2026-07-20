public class LargerOfTwoNumbers	{
	public static void main(String [] args) {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();

		largerBetween(firstNumber, secondNumber);
		

	}
	public static void  largerBetween(int firstNumber, int secondNumber)	{
		if (firstNumber > secondNumber) {
			System.out.println("The larger one is: " + firstNumber);
		}
		else {
			System.out.println("The larger one is: " + secondNumber);
		}
	}
}
