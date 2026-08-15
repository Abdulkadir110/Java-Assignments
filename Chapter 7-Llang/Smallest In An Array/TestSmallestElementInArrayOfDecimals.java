import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSmallestElementInArrayOfDecimals {

    @Test
    public void testForTheMinimumIn() {
       //Given 
        double[] numbers = {1.9, 2.5, 3.7, 2, 1.5, 6 , 3 , 4, 5, 2};
        //When
        double expectedMinimum = SmallestElementInAnArrayOfDecimals.min(numbers);
        double actualMinimum = 1.5;
        //Check
        assertEquals(expectedMinimum, actualMinimum);
    }
}
