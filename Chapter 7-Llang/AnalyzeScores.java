import java.util.Scanner;
public class AnalyzeScores {
    public static void main(String [] args) {
        Scanner inputCollector = new Scanner(System.in);
//         int length = 0;
//         int number = 0;
//         while(number != -1){
//            if(number <= 100){
//                System.out.print
//                number = inputCollector.nextInt();
//                length++;
//            }
//         }
             System.out.print("Enter the number of numbers you wished to input: ");
             int length = inputCollector.nextInt();
             int[] numbers = new int[length];
             for(int index = 0; index < numbers.length; index++){
                System.out.print("Enter the number at index " + index + ": ");
                numbers[index] = inputCollector.nextInt();
             }
             
         System.out.println("The Number of Numbers above the mean is: " + countNumberAboveAverageIn(numbers));
    }
//    public static int[] addEnteredNumbersInto(int [] numbers){
//        Scanner inputCollector = new Scanner(System.in);
//        for(int index = 0; index < numbers.length; index++){
//            numbers[index] = inputCollector.nextInt();
//        }
//        return numbers;
//    }
    public static int averageOf(int[] numbers){
     int sum = 0;
        for(int index = 0; index < numbers.length; index++) {
            sum += numbers[index]; 
        }
        int average = sum / numbers.length;
        return average;
    }
    public static int countNumberAboveAverageIn(int [] numbers){
        int count = 0;
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] >= averageOf(numbers)){
                count++;
            }
        }
        return count;
    }
}
