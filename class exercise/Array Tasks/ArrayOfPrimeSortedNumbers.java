import java.util.Arrays;
public class ArrayOfPrimeSortedNumbers {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 3, 6, 2};
        System.out.println(Arrays.toString(sortedPrimesIn(numbers)));
//        System.out.println(Arrays.toString(primes(numbers)));
    }
    public static boolean isPrime(int number) {
    int primeCounter = 0;
        for(int denomenator = 1; denomenator <=number; denomenator++) {
            if(number % denomenator == 0) {
                primeCounter++;
            }
        }
         if(primeCounter == 2) {
            return true;
         }
            return false;
    }
    public static int countTheNumberOfPrimesIn(int[] numbers){
        int count = 0;        
        for(int number : numbers) {
            if(isPrime(number)) count++;
        }
        return count;
    }
    public static int[] primes(int [] numbers) {
        int total = 0;
        int[] newArray = new int[countTheNumberOfPrimesIn(numbers)];
        int newIndex = 0;
            for(int index = 0; index < numbers.length; index++) {
                if(isPrime(numbers[index])) {
                   newArray[newIndex] = numbers[index];
                   newIndex++;
                }
            }       
        return newArray;
    }
    public static int[] sortedPrimesIn(int[] numbers){
        int[] sortedArray = primes(numbers);
        int temp = 0;
        for(int index = 0; index < sortedArray.length; index++){
            for(int secondIndex = index + 1; secondIndex < sortedArray.length; secondIndex++){
                if(sortedArray[secondIndex] < sortedArray[index]){
                    temp = sortedArray[index];
                    sortedArray[index] = sortedArray[secondIndex];
                    sortedArray[secondIndex] = temp; 
                }
            }
        }
        return sortedArray;
    }
}
