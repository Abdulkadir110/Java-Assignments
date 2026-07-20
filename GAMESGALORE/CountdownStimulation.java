/*
collect the user input for integer
then you set a loop that counts from the user input till 1.
then it prints "Blast off";
**/

public class CountdownStimulation {
	public static void main(String[]args)	{
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter the number to start the countdown from: ");
		int countdownBegins = input.nextInt();

		for(int counter = countdownBegins; counter >= 1; counter--)	{
			System.out.println(counter);

		} 	
			System.out.println("Blast off!");
	}
}