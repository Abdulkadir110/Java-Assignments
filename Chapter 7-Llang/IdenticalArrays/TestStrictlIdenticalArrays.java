import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestStrictlIdenticalArrays{
    @Test
    public void testThatTheFirstArrayLengthIsEqualToTheSecondArrayLength(){
        //Given
        int[] numbers = {5,2,5,6,1,6};
        int[] secondNumbers = {5,2,5,6,1,6};
        
        //Check
        assertTrue(StrictlIdenticalArrays.isEqualInLength(numbers, secondNumbers));
    }
    @Test
    public void testThatTheFirstArrayIsEqualToTheSecondArray(){
        //Given
        int[] numbers = {5,2,5,6,1,6};
        int[] secondNumbers = {5,2,5,6,1,6};
        
        //Check
        assertTrue(StrictlIdenticalArrays.isEqualTo(numbers, secondNumbers));
    }
    @Test
    public void testThatTheFirstArrayIsNotEqualToTheSecondArray(){
        //Given
        int[] numbers = {5,2,5,6,6,1};
        int[] secondNumbers = {5,2,5,6,1,6};
       
        
        
        //Check
        assertFalse(StrictlIdenticalArrays.isEqualTo(numbers, secondNumbers));
    }
    
}
