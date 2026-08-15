public class SmallestElementInAnArrayOfDecimals {
    public static void main(String[] args) {
        
        
    }
    public static double min(double[] array) {
        double smallest = array[0];
        for(int index = 0; index < array.length; index++){
            if(array[index] < smallest) {
                smallest = array[index];
            }
        }
        return smallest;
    }
}
