import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestTwinPrime {
    
    @Test
    public void testThatTheNumberIsPrime(){
        //Given
        int number = 5;
        //When
        boolean actual = TwinPrime.isPrimeIn(number);
        //check
        assertTrue(actual);
    }
    
//    @Test
//    public void testThatReturnsAnArrayOfPrimeNumber(){
//        //Given
//        int number = 6;
//        //When
//        int[] actualArray = TwinPrime.arrayOfPrime(number);
//        int[] expectedArray = {2,3,5,7,11,13};
//        //Check
//        assertArrayEquals(actualArray,expectedArray);
//    }
//    
    @Test
    public void testThatReturnsAnArrayOfTwinPrimeNumber(){
        //Given
        int number = 5;
        //When
        int[][] actualArray = TwinPrime.arrayOfTwinPrime(number);
        int[][] expectedArray = {{3,5},{5,7},{11,13},{17,19}, {29, 31}};
        //Check
        assertArrayEquals(actualArray,expectedArray);
    }
}
