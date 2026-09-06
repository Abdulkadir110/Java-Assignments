import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestAddTwoIndexesTogether {

    @Test
    public void testThatWhenIAddTwoIndexesValuesInTheArrayOfEvenLengthItReflectInTheNewArray(){
        AddTwoIndexesTogether file = new AddTwoIndexesTogether(); 
        int[] numbers = {1,2,3,4,5,6};
        
        int[] expectedArray = file.addNumbersIn(numbers);
        int[] actualArray = {3,7,11};
        
        assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    public void testThatWhenIAddTwoIndexesValuesInTheArrayOfOddLengthItReflectInTheNewArray(){
        AddTwoIndexesTogether file = new AddTwoIndexesTogether(); 
        int[] numbers = {1,2,3,4,5,6, 7};
        
        int[] expectedArray = file.addNumbersIn(numbers);
        int[] actualArray = {3,7,11, 7};
        
        assertArrayEquals(expectedArray, actualArray);
    }
     @Test
    public void testThatWhenIAddTwoIndexesValuesInTheArrayOfOddLengthItReflectInTheNewArray2(){
        AddTwoIndexesTogether file = new AddTwoIndexesTogether(); 
        int[] numbers = {0,9,8,7,6,5,4};
        
        int[] expectedArray = file.addNumbersIn(numbers);
        int[] actualArray = {9,15,11,4};
        
        assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    public void testThatWhenIAddEachValuesSequentiallyInTheArrayItReflectInTheNewArray(){
        AddTwoIndexesTogether file = new AddTwoIndexesTogether(); 
        int[] numbers = {0,9,8,7,6,5,4};
        
        int[] expectedArray = file.addNumbersV2(numbers);
        int[] actualArray = {9,17,15,13,11,9};
        
        assertArrayEquals(expectedArray, actualArray);
    }
    

}
