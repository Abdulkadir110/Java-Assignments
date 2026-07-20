/* 
initialize variable for total, number, counter
then create a loop that does the work for collecting input from user repeatedly until user input -1
initialize the average variable 
then print the result of the average.
**/


public class AverageOfAllPositiveNumbers {
	public static void main (String[]args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
	
	double total = 0;
	int number = 0;	
	int counter = 1;
	do {
		System.out.print("Enter a number(enter -1 to quit): ");
		number = input.nextInt();
		
		total +=number;
		counter++;
	}
	while(number < 0);
		
		double averageOfAllPositiveNumbersEntered = total / counter;

		System.out.printf("The average of all positive numbers entered is: %f", averageOfAllPositiveNumbersEntered);
	}
}