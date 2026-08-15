import java.util.Scanner;
public class CountOccurenceOfNumbers{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter integers between 1 and 100: ");
            for(int index = 0; index < numbers.length; index++){
                     numbers[index] = inputCollector.nextInt();

            }
        countEachElementIn(numbers);
        
    }
    public static void countEachElementIn(int [] numbers) {
        int count = 0;
        for(int number = 0; number < numbers.length; number++){
            count = 0;
            for(int index = 0; index < numbers.length; index++){
                if(numbers[number] == numbers[index]){
                    count++;
                }
            }
            String word = "times";
            if(count == 1){
                word = "time";
            }
            System.out.println(numbers[number] + " occurs " + count + " "+ word);
        }
    }
}
