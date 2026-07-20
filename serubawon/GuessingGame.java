import java.util.Scanner;

public class GuessingGame {
	public static void main(String[]args)	{
		Scanner input = new Scanner(System.in);	

		int guess = (int)(Math.random() * 10);

		System.out.print("guess a number: ");		
		int number = input.nextInt();

		int counter = 0;
		do {
		System.out.print("guess a number: ");		
		number = input.nextInt();
			
		if(number != guess) {
			System.out.println("Oops, try again");
		}
		else {
			System.out.println("You got it, yayyyy");
		}
		counter++;
		}
		while(number != guess);
	}
}