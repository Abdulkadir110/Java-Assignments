import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RangeOfPositiveNumbersInAnArrayTest {

    @Test
    public void testThatCheckLengthOfTheArray() {

    //Given
	int[] numbers = {-2, -1, 5, 10, 7};

	//When
	int expectedLength = RangeOfPositiveNumbersInAnArray.lengthOf(numbers);

	int actualLength = 5;

	//Check
	assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testThatCountsTheNumberOfPositiveNumbersInTheArray() {

    //Given
	int[] numbers = {-2, -1, 5, 10, 7};

	//When
	int expectedPositiveNumbers = RangeOfPositiveNumbersInAnArray.theNumberOfPositiveNumbersIn(numbers);

	int actualPositiveNumbers = 3;

	//Check
	assertEquals(expectedPositiveNumbers, actualPositiveNumbers);
    }

    @Test
    public void testThatCalculateTheLargestNumberInTheArray() {

    //Given
	int[] numbers = {-2, -1, 5, 10, 7};

	//When
	int expectedLargest = RangeOfPositiveNumbersInAnArray.theLargestNumberIn(numbers);

	int actualLargest = 10;

	//Check
	assertEquals(expectedLargest, actualLargest);
    }

    @Test
    public void testThatCalculateTheSmallestNumberInTheArray() {

    //Given
	int[] numbers = {-2, -1, 5, 10, 7};

	//When
	int expectedSmallest = RangeOfPositiveNumbersInAnArray.theSmallestNumberIn(numbers);

	int actualSmallest = 5;

	//Check
	assertEquals(expectedSmallest, actualSmallest);
    }
    
     @Test
    public void testThatCalculateTheRangeInTheArray() {

    //Given
	int[] numbers = {-2, -1, 5, 10, 7};

	//When
	int expectedRange = RangeOfPositiveNumbersInAnArray.theRangeOfNumberIn(numbers);

	int actualRange = 5;

	//Check
	assertEquals(expectedRange, actualRange);
    }

     @Test
    public void testThatReturnsTheNumberOfPositiveIntegersOf() {

    //Given
	int[] numbers = {-2, -1, 5, 10, 7};

	//When
	int[] expectedArrayOfNumbers = RangeOfPositiveNumbersInAnArray.thePositiveArrayOf(numbers);

	int[] actualArrayOfNumbers = {5, 10, 7};

	//Check
	assertArrayEquals(expectedArrayOfNumbers, actualArrayOfNumbers);
    }
    
    
}
