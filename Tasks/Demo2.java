import java.util.Scanner;
	
	public class Demo2 {
		public static void main(String [] args) {
			
		Scanner input = new Scanner(System.in);
		
		int secondLargest = 0;
		int largest  = 0;
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		largest = number;
		
		int counter = 1;
		while(counter <= 9) {

		

		System.out.print("Enter an integer: ");
		number = input.nextInt();
			if (number > largest) {
			   secondLargest = largest;
			   largest = number;
			  
			}
			  if( number < largest && number > secondLargest) {
 				secondLargest = number;
			  }
		counter++;
		}
		System.out.printf("The largest is %d%n", largest);
		System.out.printf("The Second largest is %d%n", secondLargest);
		
		

	}
}