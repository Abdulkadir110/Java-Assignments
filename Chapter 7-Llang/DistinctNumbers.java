import java.util.Arrays;
import java.util.Scanner;
public class DistinctNumbers{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        int number = 0;
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
            for(int index = 0; index < 10; index++){
                  System.out.print("Enter number at index" + index + ": ");
                  numbers[index] = inputCollector.nextInt();
            }
        System.out.println(Arrays.toString(distinctOf(numbers)));
        System.out.println("The number is 6 but was: " + countDistinct(numbers));
        
    }
    public static int countDistinct(int [] numbers){
        int count = 0;
        int duplicateCounter = 0;
        
        for(int index = 0; index < numbers.length; index++) {
            duplicateCounter = 0;
            for(int secondIndex = 0; secondIndex < index; secondIndex++){
                if(numbers[index] == numbers[secondIndex]){
                    duplicateCounter++;
                }
            }
            if(duplicateCounter == 0){
                count++;
            }
        }
        return count;
    }
     
    public static int[] distinctOf(int[] numbers) {
        int length = countDistinct(numbers);
        int[] distincts = new int[length];
        int duplicateCounter = 0;
        int count = 0;
        for(int index = 0; index < numbers.length; index++){
            duplicateCounter = 0;
            for(int secondIndex = 0; secondIndex < index; secondIndex++){
                if(numbers[index] == numbers[secondIndex]){
                    duplicateCounter++;
                }
            }
            if(duplicateCounter == 0) {
                distincts[count] = numbers[index];
                count++;
            }
        }
        return distincts;
    }
}
