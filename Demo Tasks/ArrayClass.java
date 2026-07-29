import java.util.Arrays;

public class ArrayClass {
    public static void main(String [] args) {
        int[] scores = new int[5];

        int sum = 0;
        
        for (i = 0; i < scores.length; i++) {
            sum+= scores[i];
        }
        
        double average = (double) sum / scores.length;




//        scores[0] = 30;
//        scores[1] = 50;
//        scores[2] = 60;
//        scores[3] = 40;
//        scores[4] = 90;
//
//        int largest = scores[0];
//
//        for(int index; index < scores.length; index++) {
//            if(scores[index] > largest) largest = scores[index];
//        }
    }    
}
