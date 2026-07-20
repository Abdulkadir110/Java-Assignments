/** Start
* import Scanner;
* Prompt the user to collect input for hours and minutes in format HH:MM
* initialize the time variable. 
* declare a minuteToHour variable and assign minutes / 60;
* declare the total and assign the total of time in hours.
* Display the result of the total.
End */

import java.uti.Scanner;
	public class TimeConverter {
		public static void main (String[]args)	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your hour and minute: ");
		int hourTime = input.nextInt();
		System.out.print("::");
		int minuteTime = input.nextInt();

		
		int minuteToHour = minuteTime / 60;
		int totalTime = hourTime + minuteToHour;
		
		System.out.printf("The total time in hours is: %d", totalTime);
	}
}