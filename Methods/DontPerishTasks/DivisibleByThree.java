
public class DivisibleByThree {
	public static void main(String [] args) {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = input.nextInt();

		boolean divisibleResult = isDivisibleByThree(n);
		System.out.println("The Outcome is: " + divisibleResult);

	}
	public static boolean isDivisibleByThree( double n)	{
		return (n % 3 == 0);
	}	
}

