import java.util.Arrays;
import java.util.Scanner;
public class ReversedNumbersEntered {
    public static void main (String [] args) {
        Scanner inputCollector = new Scanner(System.in);
        int[] numbers = new int [10];
        int number = 0;
        for(int index = 0; index < 10; index++) {
            System.out.print("Enter number at index " + index + " : ");
            number = inputCollector.nextInt();
            numbers[index] = number;
        }
        System.out.println(Arrays.toString(reversedOf(numbers)));
    }
    public static int[] reversedOf(int [] numbers) {
        int[] reversed = new int[10];
        int reversedIndex = 0;        
        for(int index = 9; index >= 0; index--){
            reversed[reversedIndex] = numbers[index];
            reversedIndex++;
        }
        return reversed;
    }
}

