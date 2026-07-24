import java.util.Arrays;
public class MaximumAndMinimumNumbersInArrayOfIntegers {
    public static void main (String[] args) {
        int[] numbers = {24, 56, 23, 64, 47, 33};
        int[] result = ArrayKata.minimumAndMaximumOf(numbers);
        System.out.println("The minimum and maximum numbers are: " + Arrays.toString(result));            
    }
}

