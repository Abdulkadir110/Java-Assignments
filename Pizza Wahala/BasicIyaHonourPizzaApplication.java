public class BasicIyaHonourPizzaApplication {
    public static void main (String[] args) {
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
    
        System.out.print("Enter the number of people for your party: ");
        int numberOfPeople = inputCollector.nextInt();
        
        inputCollector.nextLine();

        System.out.print("Order the pizza type you want: ");
        String pizzaType = inputCollector.nextLine().toLowerCase();

        int numberOfBoxes = 0;
        int remainingSlices = 0;
        int orderedPizzaPrice = 0;


        switch (pizzaType) {
            case "sapa size": {
                if(numberOfPeople % 4 == 0) {
                    numberOfBoxes = numberOfPeople / 4;
                    remainingSlices = 0;
                    
                    orderedPizzaPrice = 2500 * numberOfBoxes;
                    
                }
                else if(numberOfPeople % 4 != 0) {
                    numberOfBoxes = (numberOfPeople / 4) + 1;
                    remainingSlices = numberOfBoxes * 4 - numberOfPeople;
       
                    orderedPizzaPrice = 2500 * numberOfBoxes;        
                }
            break;
            }
            
             case "small money": {
                if(numberOfPeople % 6 == 0) {
                    numberOfBoxes = numberOfPeople / 6;
                    remainingSlices = 0;
                    
                    orderedPizzaPrice = 2900 * numberOfBoxes;
                    
                }
                else if(numberOfPeople % 6 != 0) {
                    numberOfBoxes = (numberOfPeople / 6) + 1;
                    remainingSlices = (numberOfBoxes * 6) - numberOfPeople;
       
                    orderedPizzaPrice = 2900 * numberOfBoxes;        
                }
            break;
            }
            
             case "big boys": {
                if(numberOfPeople % 8 == 0) {
                    numberOfBoxes = numberOfPeople / 8;
                    remainingSlices = 0;
                    
                    orderedPizzaPrice = 4000 * numberOfBoxes;
                    
                }
                else if(numberOfPeople % 8 != 0) {
                    numberOfBoxes = (numberOfPeople / 8) + 1;
                    remainingSlices = (numberOfBoxes * 8) - numberOfPeople;
       
                    orderedPizzaPrice = 4000 * numberOfBoxes;        
                }
            break;
            }
            
            
             case "odogwu": {
                if(numberOfPeople % 12 == 0) {
                    numberOfBoxes = numberOfPeople / 12;
                    remainingSlices = 0;
                    
                    orderedPizzaPrice = 5200 * numberOfBoxes;
                    
                }
                else if(numberOfPeople % 12 != 0) {
                    numberOfBoxes = (numberOfPeople / 12) + 1;
                    remainingSlices = (numberOfBoxes * 12) - numberOfPeople;
       
                    orderedPizzaPrice = 5200 * numberOfBoxes;        
                }
                
            }
            
            
            default: System.out.print("Invalid");
            
        
        }
        System.out.printf("The number of boxes ordered is: %d boxes%n ", numberOfBoxes);
        System.out.printf("The number of slices remaining is: %d slices left%n", remainingSlices);
        System.out.printf("The price of the ordered pizza is: ₦%d%n", orderedPizzaPrice);

    }
}
