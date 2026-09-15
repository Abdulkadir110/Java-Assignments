import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmployeeShiftHoursTracker {
    @Test
    public void testForTheTotalHoursWorkedInAWeek(){
        int[] week = {8, 5, 12, 8, 9};
        
        int expectedTotalHours = EmployeeShiftHoursTracker.totalHoursWorkedIn(week);
        int actualTotalHours = 42;
        
        assertEquals(expectedTotalHours, actualTotalHours);
    }
    @Test
    public void testToFindTheDayWithTheMostHours() {
        int[] week = {8, 5 ,12, 8 ,5};
        
        int expectedDay = EmployeeShiftHoursTracker.theDayWithTheMostHoursIn(week);
        int actualDay = 3;
        
        assertEquals(expectedDay, actualDay);
    }
    @Test
    public void testToGetTheAverageHoursPerDay(){
        int[] week = {8, 5 ,12, 8 ,5};
        
        double expectedaverage = EmployeeShiftHoursTracker.AverageWorkedHours(week);
        double actualaverage = 8.4;
        
        assertEquals(expectedaverage, actualaverage);
    }
}
