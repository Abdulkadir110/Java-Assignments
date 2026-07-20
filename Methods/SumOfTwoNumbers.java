public class SumOfTwoNumbers {
	public static void main(String [] args) {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();

		int sumResult = add(firstNumber, secondNumber);
		System.out.println("The sum is: " + sumResult);
		

	}
	public static int add(int firstNumber, int secondNumber)	{
		int sum = firstNumber + secondNumber;
		return sum;
	}
}
