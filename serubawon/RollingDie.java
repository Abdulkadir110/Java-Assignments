import java.util.Scanner;

public class RollingDie {
	public static void main(String[]args)	{
		Scanner input = new Scanner(System.in);	

		int rolls = (int)(Math.random() * 6);

		System.out.print("guess a number: ");		
		int number = input.nextInt();

		int counter = 0;
		do {
		System.out.print("guess a number: ");		
		number = input.nextInt();
			
		if(number != rolls) {
			System.out.println("Oops, try again");
		}
		else {
			System.out.println("You got it, yayyyy");
		}
		counter++;
		}
		while(number != guess);

		System.out.print("the number of rolls is: " + counter)
		if ( counter < 5) {
		  System.out.print("Lucky");
		}
		else if ( counter > 5 && counter < 10) {
		  System.out.print("Average");
		}
		else {
		  System.out.print("Tough luck!");
		}
	}
}