public class ReversedNumber {
	public static void main(String[]args)	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter your number: ");
		int number =input.nextInt();
		
		int reversedNumber = 0;
		while (number > 0) {
			reversedNumber *= 10;
			int temp = number % 10;
			reversedNumber += temp;
			number /= 10;
		}
		
		System.out.printf("the reveresed number is %d", reversedNumber);
	}
			
}

	