public class ClassExercise {
	public static void main(String [] args ) {
		
		int doubleItResult = doubleIt(2);
		
		int averageResult = average(3, 5, 7);
		boolean rangeResult = isRange(7, 3 , 9);
		boolean negativeResult = isNegative(5);

		
		String messagePrint = printWelcomeMessage();
		
		System.out.println(messagePrint);

		System.out.println("The double of 2 is " + doubleItResult);
		System.out.println("5 is a negative number: " + negativeResult);

		printTimeTable(5);
		System.out.println();

		System.out.println("The average result is: " + averageResult);
		System.out.println(rangeResult);

	}
	
	public static String printWelcomeMessage() {
		String message = "welcome to Java";
		return message;
	}
	public static int doubleIt(int n)	{
		int doubleIt = n * 2;	
		return doubleIt;
	}
	public static boolean isNegative(int n)	{
		if ( n < 0 )	{
			return true;
		}
		else {
			return false;
		}
	}
	public static void printTimeTable(int n)		{
		
		for(int counter = 1; counter <= 5; counter++)	{
			System.out.print(n * counter + ", " );
		} 
	}
	public static int average(int a, int b, int c)	{
		int averageOfThree = (a + b + c)/ 3;
		
		return averageOfThree;
	}
	public static boolean isRange(int n, int low, int high)		{
		return (n >= low && n <= high); 
		
	}
}