public class HalvingANumber {
	public static void main(String [] args) {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = input.nextInt();

		double halfNumberResult = halfTheNumber(n);
		System.out.println("The Result is: " + halfNumberResult);

	}
	
	public static double halfTheNumber(double n)	{
		double half = n / 2;
	
		return half; 
	}
}