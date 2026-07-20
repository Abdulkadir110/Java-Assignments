
public class LargestAndCountsTheNumbers {
	public static void main (String[]args)	{
		java.util.Scanner input = new java.util.Scanner(System.in);
			
			int numbersCounter = 0;
			int largest = 0;
			int numbers;	
			
			do {
				System.out.print("Enter the integers: ");
				numbers = input.nextInt();
				
				if ( largest < numbers) {
				largest = numbers;
				}
				numbersCounter++;
				
			}
			while(numbers != 0);
			System.out.println("The largest number is: " + largest);
			System.out.println("The number of times user inputs a number is: " + (numbersCounter -1));
	}
}
			