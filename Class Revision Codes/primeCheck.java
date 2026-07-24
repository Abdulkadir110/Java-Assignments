
// prime numbers are numbers divisible by 1 and it self
// loop - condtion - divide


public class primeCheck {
        public static void main(String[] args) {
            java.util.Scanner input = new java.util.Scanner(System.in);
//            System.out.println("Enter the number: ");
//            int number = input.nextInt();

            
           
            for (int counter = 1; counter <= 100; counter++) {
                int primecounter = 0;
                for(int secon = 1; secon <= counter; secon++ ){
                    if(counter % secon == 0) {
                        primecounter++;
                        
                    }

                }
                    
            if(primecounter == 2){
                    System.out.println(counter);
                }
            }
                

        }    
}
