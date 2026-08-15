import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAverageAnArray {
    @Test
    public void testForTheAverageOfArrayOfIntegers() {
        //Given 
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        //When
        int expectedAverage = AverageAnArray.average(numbers);
        int actualAverage = 5;
        //Check
        assertEquals(expectedAverage, actualAverage);
    }
    @Test
    public void testForTheAverageOfArrayOfDecimals() {
        //Given 
        double[] numbers = {1.3,2.5,3.3,4.4,5.5,6.6,7.7,8.9,9.2,10.2};
        //When
        double expectedAverage = AverageAnArray.average(numbers);
        double actualAverage = 5.97;
        //Check
        assertEquals(expectedAverage, actualAverage);
    }
}
