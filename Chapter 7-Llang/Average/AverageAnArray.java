public class AverageAnArray{
    public static int average(int[] array) {
        int sum = 0;
        for(int index = 0; index < array.length; index++) {
            sum += array[index];
            
            
        }
        return sum / array.length ;
    }
    public static double average(double[] array) {
        double sum = 0;
        for(int index = 0; index < array.length; index++) {
            sum += array[index];
            

        }
        
     return Math.ceil((sum / array.length) * 100.0)  / 100.0;
    }
}
