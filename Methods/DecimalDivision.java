public class DecimalDivision {
	public static void main(String [] args) {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);

		System.out.print("Enter the first number: ");
		double firstNumber = input.nextDouble();

		System.out.print("Enter the second number: ");
		double secondNumber = input.nextDouble();

		double divisionResult = divide(firstNumber, secondNumber);
		System.out.println("The result is: " + divisionResult);
		

	}
	public static double divide(double firstNumber, double secondNumber)	{
		double division = firstNumber / secondNumber;
		return division;
	}
}
