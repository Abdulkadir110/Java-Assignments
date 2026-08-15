import java.util.Arrays;
public class ArrayOfEvenNumbers {
    public static void main (String[] args) {
        int[] numbers = {2,3,12,8,2, 7, 1,};
        
       System.out.println("The new array is: " + Arrays.toString(arrayOfEvenNumbersAndCounter(numbers)));
        
    }
    public static int lengthOfTheArray(int[] numbers) {
        int lengthOfArray = 0;
        for (int index = 0; index < numbers.length; index++) {
            if(numbers[index] % 2==0) {
                 lengthOfArray++; 
            }
        }
        return lengthOfArray;
    }
    public static int[] arrayOfEvenNumbers(int[] numbers) {
        int evenCounter = 0;
        int evenIndex = 0;
        int[] evenArray = new int [lengthOfTheArray(numbers) + 1];
        for (int index = 0; index < evenArray.length; index++) {
                if(numbers[index] % 2 == 0) {
                    evenArray[evenIndex] = numbers[index];
                    evenCounter++;
                    evenIndex++;
                }
        }
         evenArray[evenIndex] = evenCounter;
         
        return evenArray;
    }
}
