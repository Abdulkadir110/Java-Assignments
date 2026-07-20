import java.util.Scanner;
public class PositiveCounts{	
	public static void main(String[]args)	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numbers: ");
		int count = input.nextInt();
		count = input.nextInt();
		count = input.nextInt();
		count = input.nextInt();
		count = input.nextInt();
		count = input.nextInt();

		int positivecounts = 0;
		int negativecounts = 0;
		int zerocount = 0;
		for(int counter = 1; counter <= count; counter++) {
		   if( count > 0) {
			positivecounts++;
			}
		    if( count < 0) {
			negativecounts++;
			
			}
		    if( count == 0) {
			zerocount++;
			
			}
		}
		System.out.print("positive numbers are: " + positivecounts);
		System.out.print("\nnegative numbers are: " + negativecounts);
		System.out.print("\nzero numbers are: " + zerocount);
	}
}	