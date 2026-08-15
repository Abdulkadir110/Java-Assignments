import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOfEvenNumbersTest {

    @Test
    public void testThatTheLengthOfTheArrayIsCorrect() {
        int[] numbers = {1,2,3,4,5,6,7};
        
        int expected = ArrayOfEvenNumbers.lengthOfTheArray(numbers);
        int result = 3;

        assertEquals(expected, result);
    }
    @Test
    public void testThatTheEvenNumbersArrayIsCorrect(){
        int[] numbers = {1,3,4,5,6,7,8}
        
        int[] expected = ArrayOfEvenNumbers.arrayOfEvenNumbers(numbers);
        int[] actual = {4,6,8};
        
        assertArrayEquals(expected, result);
    }
}
