//write a method that takes in an array and gives me an array that is in descending order.
import java.util.Arrays;
public class DescendingOrderArrays {

    public static void main (String[] args) {
        int[] numbers = {1,14,6,5,3,2};

          System.out.println("In descending order, it is, " + Arrays.toString(descendingArray(numbers)));
    }

    public static int[] descendingArray(int[] numbers) {

        for (int index = 0; index < numbers.length; index++) {

                for(int newIndex = 0; newIndex < numbers.length; newIndex++) {

                    if(numbers[newIndex] < numbers[index]) {
                        int temp = numbers[newIndex];
                        numbers[newIndex] = numbers[index];
                        numbers[index] = temp;
                        
                   //     numbers[index] = numbers[0];
                    }
                        
                }

        }

      return numbers;
    }
}
          







