public class ArrayOfEvenAndOdd {
    public int[] replacedEveryEvenAndOddIn(int[] numbers){
        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index] % 2 == 0)numbers[index] = 1;
        }
     return numbers;
    }
    public boolean[] replacedEveryEvenAndOddWithBooleanIn(int[] numbers){
        boolean[] array = new boolean[numbers.length];
        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index] % 2 != 0)array[index] = true; 
        }
     return array;
    }
}
