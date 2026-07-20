import java.util.Scanner;
	public class MonthsAndLeapYear {
		public static void main (String[]args) {
		Scanner input = new Scanner(System.in);	
		
		System.out.print("Enter an integer between 1 to 12: ");
		int month = input.nextInt();
		
		switch (month) {
		
		case 1:
			System.out.print("January is 31 days");
			break;
		case 2:
			System.out.print("February\n");
			if (month == 2) {
			System.out.print("Enter the year: ");
			int year = input.nextInt();
			
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.printf("February has 29 days in the year %d", year);
			}
			else {
				System.out.printf("February is 28 days in the year %d", year);
			}
			}
			break;
		case 3:
			System.out.print("March is 31 days");
			break;
		case 4:
			System.out.print("April is 30 days ");
			break;
		case 5:
			System.out.print("May is 31 days");
			break;
		case 6:
			System.out.print("June is 30 days");
			break;
		case 7:
			System.out.print("July is 31 days");
			break;
		case 8:
			System.out.print("August is 31 days");
			break;
		case 9:
			System.out.print("September is 30 days");
			break;
		case 10:
			System.out.print("October is 31 days");
			break;
		case 11:
			System.out.print("November is 30 days");
			break;
		case 12:
			System.out.print("December is 31 days");
			break;

		default:
			System.out.print("Invalid input");

		
		}
		
		
	}
}	