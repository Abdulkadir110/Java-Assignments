import java.util.Scanner;
	
	public class Demo3 {
		public static void main(String [] args) {
			
		Scanner input = new Scanner(System.in);
		
		int secondSmallest = 0;
		int smallest  = 0;
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		smallest = number;
		
		int counter = 1;
		while(counter <= 9) {

		

		System.out.print("Enter an integer: ");
		number = input.nextInt();
			if (number < smallest) {
			   secondSmallest = smallest;
			   smallest = number;
			  
			}
			  if( number > smallest && number < secondSmallest) {
 				secondSmallest = number;
			  }
		counter++;
		}
		System.out.printf("The smallest is %d%n", smallest);
		System.out.printf("The Second Smallest is %d%n", secondSmallest);
		
		

	}
}