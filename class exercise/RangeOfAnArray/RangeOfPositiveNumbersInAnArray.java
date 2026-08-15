

public class RangeOfPositiveNumbersInAnArray {
    public static int lengthOf(int[] numbers){
        return numbers.length;
    }
    
    public static int theNumberOfPositiveNumbersIn(int[] numbers) {
        int positiveNumbersCount = 0;
        for(int index = 0; index < lengthOf(numbers); index++) {
            if(numbers[index] >= 0 ) {
                positiveNumbersCount++;
            }
        }
        return positiveNumbersCount;
    }
    public static int[] thePositiveArrayOf(int[] numbers){
        int newIndex = 0;
        int[] positiveArray = new int[theNumberOfPositiveNumbersIn(numbers)];
        for(int index = 0; index < lengthOf(numbers); index++) {
            if(numbers[index] >= 0) {
                positiveArray[newIndex] = numbers[index];
                newIndex++;
            }
        }
        return positiveArray;
    }
    
    public static int theLargestNumberIn(int[] numbers) {
        int largest = 0;
        for(int firstIndex = 0; firstIndex < thePositiveArrayOf(numbers).length; firstIndex++){
            for(int index = 0; index < thePositiveArrayOf(numbers).length; index++) {
                if(thePositiveArrayOf(numbers)[firstIndex] < thePositiveArrayOf(numbers)[index]) {
                    largest = thePositiveArrayOf(numbers)[index];
                }
            }
        }
        return largest;
        
    }
    
     public static int theSmallestNumberIn(int[] numbers) {
        int smallest = 0;
        for(int firstIndex = 0; firstIndex < thePositiveArrayOf(numbers).length; firstIndex++){
            for(int index = 0; index < thePositiveArrayOf(numbers).length; index++) {
                if(thePositiveArrayOf(numbers)[firstIndex] > thePositiveArrayOf(numbers)[index]) {
                    smallest = thePositiveArrayOf(numbers)[index];
                }
            }
        }
        return smallest;
        
    }
    
    public static int theRangeOfNumberIn(int[] numbers) {
        return theLargestNumberIn(numbers) - theSmallestNumberIn(numbers);
    }
}
