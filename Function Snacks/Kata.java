public class Kata {
    public static boolean isEven(int number){
        return (number % 2 == 0);
    }

     public static boolean isPrime(int number){
        
        int primeCounter = 0;
        for (int counter = 2; counter<= number/2; counter++) {
                if (number % counter == 0 ) return false;
        }   
            return true;
                 
    }

    public static int subtract(int firstNumber, int secondNumber) {

        int sub = 0;

        if (firstNumber > secondNumber)sub = firstNumber - secondNumber;
        else sub = secondNumber - firstNumber;
       
        return sub;
    }

    public static float divide(float dividend, float divisor) {
        float quotient = dividend / divisor;
            if(divisor == 0){
                quotient = 0;        
            }

            return quotient;
        
   }

    public static int factorOf(int number) {
        int numberOfFactors = 0;
            for(int counter = 1; counter <= number; counter++){
                if (number % counter == 0)numberOfFactors++;
            }
            return numberOfFactors;
    }

    public static boolean isSquare(double number) {
       double root = Math.pow(number, 0.5);

        return (root * root == number);
     }

    public static boolean isPalindrome(int number) {
        return ((number % 10) == ((number / 10000) % 10) && ((number /10) % 10) == ((number / 1000) % 10));
    }

    public static long factorialOf (long number) {
        long factorial = 0;
        for (long counter = number - 1; counter >= 1; counter--) {
                factorial = number * counter;
                number = factorial;
         }
            return factorial;   
    }

    public static long squareOf(long number) {
        long squareNumber = number * number;

        return squareNumber;
    }
    
 }




