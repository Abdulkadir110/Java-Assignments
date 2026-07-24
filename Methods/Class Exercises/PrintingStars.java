public class PrintingStars {
	public static void main(String [] args) {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);

		System.out.print("Enter a number: ");
		int numberOfAsterisks = input.nextInt();

		printAsterisks(numberOfAsterisks);
		

	}
	public static void printAsterisks(int numberOfAsterisks) {
		for(int counter = 1; counter <= numberOfAsterisks; counter++)	{
			System.out.print("*");
		}		
	}
}
