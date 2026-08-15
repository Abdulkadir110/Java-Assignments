public class ConsecutiveFourEqualNumbers {
    public static boolean isConsecutiveFour(int[] values){
        int consecutiveCounter = 0;
        for(int index = 0; index < values.length; index++){
            consecutiveCounter = 1;
               for(int secondIndex = index + 1; secondIndex < values.length; secondIndex++){
                        if(values[index] == values[secondIndex]){
                            consecutiveCounter++;
                        }
                        else {
                            break;
                        }
                }
            if(consecutiveCounter >= 4) {
                    return true;
            }
        }
        return false;
      }
    public static void main(String [] args) {
        int[] values = {3,4,2,5,5,5,5};
        if(isConsecutiveFour(values) == true) {
            System.out.println("The list has consecutive fours");
        }
        else if(isConsecutiveFour(values) == false) {
            System.out.println("The list has no consecutive fours");
        }
    }
}

