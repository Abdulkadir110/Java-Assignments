import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestArrayOfEvenAndOdd {
    @Test
    void testThatOddNumbersAreReplacedWithZeroAndEvenNumbersAreReplacedWithOne(){
        ArrayOfEvenAndOdd file = new ArrayOfEvenAndOdd();
        int[] numbers = {3,5,2,8,1,5};
        
        int[] expectedArray = file.replacedEveryEvenAndOddIn(numbers);
        int[] actualArray = {0,0,1,1,0,0};
        
        assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    void testThatOddNumbersAreReplacedWithZeroAndEvenNumbersAreReplacedWithOne_2(){
        ArrayOfEvenAndOdd file = new ArrayOfEvenAndOdd();
        int[] numbers = {3,8,2,8,1,5};
        
        int[] expectedArray = file.replacedEveryEvenAndOddIn(numbers);
        int[] actualArray = {0,1,1,1,0,0};
        
        assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    void testThatOddNumbersAreReplacedWithTrueAndEvenNumbersAreReplacedWithFalse(){
        ArrayOfEvenAndOdd file = new ArrayOfEvenAndOdd();
        int[] numbers = {3,5,2,8,1,5};
        
        boolean[] expectedArray = file.replacedEveryEvenAndOddWithBooleanIn(numbers);
        boolean[] actualArray = {true,true,false,false,true,true};
        
        assertArrayEquals(expectedArray, actualArray);
    }
}
