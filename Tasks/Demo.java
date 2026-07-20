import java.util.Scanner;
	
	public class Demo {
		public static void main(String [] args) {
			
		Scanner input = new Scanner(System.in);
		
		int PostiveCounter = 0;
		int NegativeCounter = 0;
		int largest  = 0;
		
		
		

		int counter = 1;
		
		while(counter <= 10) {
			System.out.print("Enter the integers: ");
		int number = input.nextInt();
		largest = number;
			
			if ( number < 0) {
				NegativeCounter++;
			
			}
			if ( number > 0) {
				PostiveCounter++;
			
			}
			if ( largest < number) {
				largest = number;
			}
			counter++;

		}
		System.out.printf("The largest number is: %d%n", largest);
		System.out.printf("The Positive number counts are: %d%n", PostiveCounter);
		System.out.printf("The Negative number counts are: %d%n", NegativeCounter);

	}
}