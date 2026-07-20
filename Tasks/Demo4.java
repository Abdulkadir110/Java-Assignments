import java.util.Scanner;
	public class Demo4 {
		public static void main (String [] args) {
			Scanner input = new Scanner(System.in);
			int positiveCounter = 0;
			int negativeCounter = 0;
			int largest = 0;
			double total = 0;

		System.out.print("Enter the 10 integers: ");
		int number = input.nextInt();
		largest = number;

		/** int counter = 0;

		while(counter <= 8) { 
			System.out.print("Enter the 10 integers: ");
			number = input.nextInt();
			
				if ( number > largest ) {
				    largest = number;	
				}
				if ( number > 0 ) {
					positiveCounter++;
				}
				if ( number < 0 ) {
					negativeCounter++;
				}
				if ( number < 0 || number > 0 ) {
					total++;
				}

			counter++;
		} */
		
		for(int counter = 0; counter <=8; counter++) {
			System.out.print("Enter the 10 integers: ");
			number = input.nextInt();
			
				if ( number > largest ) {
				    largest = number;	
				}
				if ( number > 0 ) {
					positiveCounter++;
				}
				if ( number < 0 ) {
					negativeCounter++;
				}
				if ( number < 0 || number > 0 ) {
					total = number++;
				}
		}
			
	System.out.printf("The Largest numbe among the listed 10 integers is : %d%n", largest);
	System.out.printf("The postive numbers are : %d%n", positiveCounter++);
	System.out.printf("The negative numbers are : %d%n", negativeCounter++);
	System.out.printf("The Average of all the listed numbers is %.2f", ( total++ / 10));
	}
}