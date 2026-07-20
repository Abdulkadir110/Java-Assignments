/** Collect input from the user about the d=number of days
*   if the inputted number is a multiple of 7 print Wednesday
*   if not, print the modulus of 7 with remainder 1 to be thursday;
*/





import java.util.Scanner;
	public class DaysOfTheWeek {
		public static void main (String[]args) {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter the number of days you wished to add: ");
			int number = input.nextInt();
			
			if (number % 7 == 0 )	{
				System.out.print("The Day is Wednesday");
			}
			if (number % 7 != 0)  {
				if( number % 7 == 1) {
				System.out.print("The Day is Thurday");
				}
				else if( number % 7 == 2) {
				System.out.print("The Day is Friday");
				}
				else if( number % 7 == 3) {
				System.out.print("The Day is Saturday");
				}
				else if( number % 7 == 4) {
				System.out.print("The Day is Sunday");
				}
				else if( number % 7 == 5) {
				System.out.print("The Day is Monday");
				}
				if( number % 7 == 6) {
				System.out.print("The Day is Tuesday");
				}
			}
		}
	}
			


































/**				if (number == 6) {
						System.out.print("The Day is tuesday ");
					}
					if (number == 4) {
						System.out.print("The Day is Sunday ");
					}
					if (number == 2) {
						System.out.print("The Day is Friday ");
					}
					

				}
				else if (number == 1 ) {
					System.out.print("The Day is Thursday ");
					}
				else if (number % 3 == 0)	{
					System.out.print("The Day is Saturday ");
				}
				else if (number % 5 == 0)	{
					System.out.print("The Day is Monday ");
				}
				else if (number % 3 == 0)	{
					System.out.print("The Day is Saturday ");
				}
			}
		}	
	} */




//int day = 3;

//for(int count = 1; count <=100; count++)	{
	
	

	