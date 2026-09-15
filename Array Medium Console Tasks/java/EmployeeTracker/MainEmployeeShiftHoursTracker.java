import java.util.Scanner;
public class MainEmployeeShiftHoursTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int count = 0;
        System.out.println("Enter your worked hours: ");
        while (count < 5) {
            numbers[count] = input.nextInt();
            if(numbers[count] > 12){
                System.out.println("Overtime alert");
            }
            count++;
        }
        int choice = 0;
        String menuFunction = """
        1 Calculate Total Hours
        2 Find Day with Most Hours
        3 Calculate Average Hours
        4 Exit  
        """;
        while(choice != 4) {
            System.out.println();
            System.out.println(menuFunction);
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Total hours worked: " + EmployeeShiftHoursTracker.totalHoursWorkedIn(numbers));
                    break;

                case 2:
                    System.out.println("Day with the most hours: Day " + EmployeeShiftHoursTracker.theDayWithTheMostHoursIn(numbers));
                    break;

                case 3:
                    System.out.println("Average hours worked: " + EmployeeShiftHoursTracker.AverageWorkedHours(numbers));
                    break;

                case 4:
                    System.out.println("Thank you for using this tracker");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose between(1 - 5)");
           }

        }
    }
}

