

public class FibonacciSequence {

    public static int[] fibonacciOf(int number) {
        int[] fibonacci = new int[number];
        int sum = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        for(int index = 0; index < number; index++) {
                fibonacci[index] = firstNumber;
                sum = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = sum;
                        

        }
        return fibonacci;
        
    }
}
