import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestConsecutiveFourEqualNumbers{
    @Test
    public void testThatTheNumberAppearConsecutivelyForFourTimes() {
        //Given
        int[] values = {3,4,5,5,5,5,4,5};
        
        
        assertTrue(ConsecutiveFourEqualNumbers.isConsecutiveFour(values));
    }
    
    @Test
    public void testThatTheNumberDoesntAppearConsecutivelyForFourTimes() {
        //Given
        int[] values = {3,4,5,5,5,4,5};
        
        
        assertFalse(ConsecutiveFourEqualNumbers.isConsecutiveFour(values));
    }
}
