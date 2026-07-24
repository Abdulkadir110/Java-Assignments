
public class AbsoluteValue {
	public static void main(String [] args) {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = input.nextInt();

		double absoluteResult = isAbsolute(n);
		System.out.println("The Result is: " + absoluteResult);

	}
	public static int isAbsolute(int n)	{
		int absoluteNumber = 1;
		if ( n < 0)	{
			return (n * -1);
		}
		else {
			return n;
		}
	}
}

