import java.util.Arrays;
public class EvenNumbersInArrayOfIntegers {
    public static void main (String[] args) {
        int[] numbers = {24, 56, 23, 64, 47, 33};
        
        int[] result = ArrayKata.evenNumbersIn(numbers);
        System.out.println("The even numbers in the Array of integers are: " + Arrays.toString(numbers));            
    }
}

