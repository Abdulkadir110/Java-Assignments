public class StrictlIdenticalArrays{
    public static boolean isEqualTo(int[] numbers, int[] secondNumbers){
        int count = 0;
        if(isEqualInLength(numbers, secondNumbers)){
            for(int index = 0; index < numbers.length; index++){
                  if(numbers[index] == secondNumbers[index]){
                        count++;
                  }
            }
        }
        return count == secondNumbers.length;
    }
    public static boolean isEqualInLength(int[] numbers, int[] secondNumbers){
        return secondNumbers.length == numbers.length;
    }
//    public static void main(String[] args){
//      int[] numbers = {5,2,5,6,1,6};
//      int[] secondNumbers = {5,2,5,6,1,6};
//    System.out.println(isEqualTo(numbers, secondNumbers));
//    }
}
