import java.util.Arrays;
public class SquareNumbersInArrayOfIntegers {
    public static void main (String[] args) {
        int[] numbers = {24, 81, 23, 64, 47, 33};
        
        int[] result = ArrayKata.squareNumbersIn(numbers);

   System.out.println("The square numbers in the Array of integers are: " + Arrays.toString(result)); 
      
    }
}
