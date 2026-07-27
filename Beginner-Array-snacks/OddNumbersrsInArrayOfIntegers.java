import java.util.Arrays;
public class OddNumbersrsInArrayOfIntegers {
    public static void main (String[] args) {
        int[] numbers = {24, 56, 23, 64, 47, 33};
        
        int[] result = ArrayKata.oddNumbersIn(numbers);
        System.out.println("The even numbers in the Array of integers are: " + Arrays.toString(numbers));            
    }
}

