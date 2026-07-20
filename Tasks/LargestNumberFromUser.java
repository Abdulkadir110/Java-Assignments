import java.util.Scanner;
	
	public class LargestNumberFromUser {
		public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		 	int count = 1;

			System.out.print("Enter the integers: ");
			
			int largest = input.nextInt();
			
			while (count <= 5) {
				System.out.print("Enter the integers: ");
				int number = input.nextInt();
				
				if ( largest < number) {
				largest = number;
				}
			
				count++;
			}
			System.out.printf("The largest number is: %d", largest);
	}	
		

}


	 