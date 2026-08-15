public class IndexOfTheSmallestNumber {

    public static int indexOfSmallestElement(double[] array) {
        double smallest = array[0];
        int smallestIndex = 0;
        for(int index = 0; index < array.length; index++){
            if(array[index] < smallest) {
                smallest = array[index];
            }
            if(array[index] == smallest){
                smallestIndex = index;
            }
        }
        return smallestIndex;
    }
}
