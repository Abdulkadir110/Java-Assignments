/*
Set a for loop that count from 1,000,000 to 1;

if the number is odd it is head else it is tail

print the result

**/

public class CoinFlippingStimulation {
	public static void main(String[] args)	{

		int headsCounter = 0;
		int tailsCounter = 0;
		for(int counter = 1_000_000; counter >= 1; counter--)	{
			if (counter % 2 == 0) {	
				tailsCounter++;
			}
			else {
				headsCounter++;
			}
		}
		System.out.println("The total number of heads are: " + headsCounter);
		System.out.println("The total number of tails are: " + tailsCounter);
	}
}