import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIndexOfTheSmallestNumber {

    @Test
    public void testForTheMinimumIndex() {
       //Given 
        double[] numbers = {1.9, 2.5, 3.7, 2, 1.5, 6 , 3 , 4, 5, 2};
        //When
        int expectedMinimumIndex = IndexOfTheSmallestNumber.indexOfSmallestElement(numbers);
        int actualMinimumIndex = 4;
        //Check
        assertEquals(expectedMinimumIndex, actualMinimumIndex);
    }
}
