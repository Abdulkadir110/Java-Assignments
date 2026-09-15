public class EmployeeShiftHoursTracker {
    public static int totalHoursWorkedIn(int[] week){
        int total = 0;
        for(int index = 0; index < week.length; index++){
            total += week[index];
        }
        return total;
    }
    public static boolean isFlagged(int day) {
            if (day > 12){
                return true;
            }
        return false;
    }
    public static int theDayWithTheMostHoursIn(int[] week) {
        int day = 0;

        for (int index = 1; index < week.length; index++) {
            if (week[index] > week[day]) {
                day = index;
            }
        }

        return day + 1;
    }
    public static double AverageWorkedHours(int[] week){
        return totalHoursWorkedIn(week) / week.length;
    }
    public static void main(String[] args){
        int[] numbers = {23,45,30,12,70};
        System.out.println(theDayWithTheMostHoursIn(numbers));
        System.out.println(AverageWorkedHours(numbers));
    }
    
}
