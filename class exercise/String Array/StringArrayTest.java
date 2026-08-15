import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class StringArrayTest {
    @Test
    public void testForTheLengthOfTheArrayOfWords() {
        //Given
        String[] list = {"Banana", "Mango", "PawPaw", "Strawberry"};
        
        //When
        int expectedLength = StringArray.lengthOfTheArray(list);
        int resultLength = 4;
        
        //Check
        assertEquals(expectedLength,resultLength);
    }
    
    @Test
    public void testForTheLengthOfTheArrayOfNumbers() {
        //Given
        double[] list = {1, 2, 3, 4, 7, 8};
        
        //When
        int expectedLength = StringArray.lengthOfTheArrayOf(list);
        int resultLength = 6;
        
        //Check
        assertEquals(expectedLength,resultLength);
    }
    
     @Test
    public void testForTheReverseOfTheArray() {
        //Given
        String[] list = {"Banana", "Mango", "PawPaw", "Strawberry"};
        
        //When
        String[] expectedArray = StringArray.reverseTheArrayOf(list);
        String[] resultArray = {"Strawberry","PawPaw","Mango", "Banana"};
        
        //Check
        assertArrayEquals(expectedArray,resultArray);
    }
    @Test
    public void testForTheReverseOfArrayOfNumbers() {
        //Given
        double[] list = {1,2,3,4,5,6};
        
        //When
        double[] expected = StringArray.reverseTheNumbersArray(list);
        double[] actual = {6,5,4,3,2,1};
        
        //Check
        assertArrayEquals(expected, actual);
    }
    
//    @Test
//    public void testToCheckTheValueAtIndex(){
//        //Given
//        double[] list = {0.01, 0.4, 0.7, 0.8, 1.1};
//        int firstIndex = 2;
//        int secondIndex = 4;
//        //When
//        double[] expectedValue = StringArray.valueAtEachIndexOf(list, firstIndex, secondIndex);
//        double[] actualValue = {0.7, 1.1};
//       
//        //Check
//        assertArrayEquals(expectedValue, actualValue);
//    }
    
    @Test
    public void testToCheckTheValueAtIndex(){
        //Given
        double[] list = {0.01, 0.4, 0.7, 0.8, 1.1};
        int firstIndex = 2;
        int secondIndex = 4;
        //When
        double[] expectedValues = StringArray.valueAtEachIndexOf(list, firstIndex, secondIndex);
        double[] actualValues = {0.7, 0.8, 1.1};
       
        //Check
        assertArrayEquals(expectedValues, actualValues);
    }
    
    @Test
    public void testToCheckTheStringAtIndex(){
        //Given
        String list = "Banana";
        int firstIndex = 0;
        int secondIndex = 3;
        //When
        String expected = StringArray.valueAtEachIndexOf(list, firstIndex, secondIndex);
        String actual = "Bana";
       
        //Check
        assertEquals(expected, actual);
    }
//    
}
