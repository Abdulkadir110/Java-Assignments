import java.util.Arrays;
public class ArrayOfIntegersAddtion {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        System.out.println(Arrays.toString(sumOf(numbers)));
    }
    public static int[] sumOf(int [] numbers) {
        int total = 0;
        int[] newArray = new int[numbers.length];
        int newIndex = 0;
        newArray[0] = numbers[0];
        for(int index = 1; index < numbers.length; index++) {
            newArray[index] = newArray[newIndex] + numbers[index];
            newIndex++;
        }
        return newArray;
    }
}
