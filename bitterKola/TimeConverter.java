/** Start
* import Scanner;
* Prompt the user to collect input for hours and minutes in format HH:MM
* initialize the time variable. 
* declare a minuteToHour variable and assign minutes / 60;
* declare the total and assign the total of time in hours.
* Display the result of the total.
End */

import java.util.Scanner;
	public class TimeConverter {
		public static void main (String[]args)	{
		Scanner input = new Scanner(System.in);
		
		int hourTime = 0;
		int minuteTime = 0;
		
		System.out.print("Enter your hour and minute: ");
		hourTime = input.nextInt();
		input.nextLine();
		System.out.print(":");
		minuteTime = input.nextInt();

		
		int minuteToHour = minuteTime / 60;
		int totalTime = hourTime + minuteToHour;
		
		System.out.printf("The total time in hours is: %d", totalTime);
	}
}