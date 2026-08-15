import java.util.Arrays;
import java.util.Scanner;
public class DistinctNumbers{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        int number = 0;
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
            for(int index = 0; index < 10; index++){
                  numbers[index] = inputCollector.nextInt();
            }
          System.out.print(getDistinctCount(numbers));
//        countEachElementIn(numbers);
          System.out.print(Arrays.toString(getNewDistinctOf(numbers)));
        
    }
    public static int getDistinctCount(int [] numbers){
        int count = 0;
        int duplicateCounter = 0;
        for(int number = 0; number < numbers.length; number++){
            for(int checker = 0; checker < number; checker++) {
                if(numbers[number] == numbers[checker]){
                    duplicateCounter++
                }
            }
            count = 0;
            for(int index = 0; index < numbers.length; index++){
                if(duplicateCounter > 0){
                    count = 1;
                }
                else {
                    count++;
                }
            }
        }
         return count;
    }

    public static int[] getNewDistinctOf(int [] numbers) {
        int[] distinct = new int [getDistinctCount(numbers)];
        int distinctIndex = 0;
        
        int duplicateCounter = 0;
        for(int number = 0; number < numbers.length; number++){
            for(int checker = 0; checker < number; checker++) {
                if(numbers[number] == numbers[checker]){
                    duplicateCounter++
                }
            }
            count = 0;
            for(int index = 0; index < numbers.length; index++){
                if(duplicateCounter > 0){
                    
                }
                else {
                    count++;
                }
            }
        }
        
         return distinct;
      }
 }
