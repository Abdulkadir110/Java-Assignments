import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciSequenceTest {
    
    @Test
    public void TestThatTheFibonacciSeqence() {
    //Given
	int numbers = 8;

	//When
	int[] expectedSequence = FibonacciSequence.fibonacciOf(numbers);

	int[] actualSequence = {0,1,1,2,3,5,8,13};

	//Check
	assertArrayEquals(expectedSequence, actualSequence);
    }    
}
