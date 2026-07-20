import java.util.Scanner;
	
	public class SmallestNumberFromUser {
		public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		 	int count = 1;

			System.out.print("Enter the integers: ");
			
			int smallest = input.nextInt();
			
			while (count <= 5) {
				System.out.print("Enter the integers: ");
				int number = input.nextInt();
				
				if ( smallest > number) {
				smallest = number;
				}
			
				count++;
			}
			System.out.printf("The smallest number is: %d", smallest);
	}	
		

}


	 