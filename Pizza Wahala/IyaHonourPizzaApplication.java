import java.util.Scanner;

public class IyaHonourPizzaApplication {

    public void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
                
        System.out.println("Welcome To Iya Honour Pizza,Place your Order Here");
        System.out.println();

        System.out.print("Enter the number of people for your party: ");
        int numberOfPeople = inputCollector.nextInt();
        inputCollector.nextLine();

        
        System.out.print("Order the pizza type you want: ");
        String pizzaType = inputCollector.next().toLowerCase();

        int numberOfBoxes;
        int remainingSlices;
        int orderedPizzaPrice;

        switch (pizzaType) {
            case "sapa" : {
                numberOfBoxes = calculateNumberOfBoxesForSapaSizePizza(numberOfPeople);
                remainingSlices = calculateForSapaSizePizzaRemainingSlices(numberOfPeople);
                orderedPizzaPrice = calculateForSapaSizeOrder(numberOfPeople);
                printResult(numberOfBoxes, remainingSlices, orderedPizzaPrice);
            }
            break;

            case "small" : {
                numberOfBoxes = calculateNumberOfBoxesForSmallMoneyPizza(numberOfPeople);
                remainingSlices = calculateForSmallMoneyPizzaRemainingSlices(numberOfPeople);
                orderedPizzaPrice = calculateForSmallMoneyOrder(numberOfPeople);
                printResult(numberOfBoxes, remainingSlices, orderedPizzaPrice);
            }
            break;

            case "big" : {
                numberOfBoxes = calculateNumberOfBoxesForBigBoysPizza(numberOfPeople);
                remainingSlices = calculateForBigBoysPizzaRemainingSlices(numberOfPeople);
                orderedPizzaPrice = calculateForBigBoysOrder(numberOfPeople);
                printResult(numberOfBoxes, remainingSlices, orderedPizzaPrice);
            }
            break;

            case "odogwu" : {
                numberOfBoxes = calculateNumberOfBoxesForOdogwuPizza(numberOfPeople);
                remainingSlices = calculateForOdogwuPizzaRemainingSlices(numberOfPeople);
                orderedPizzaPrice = calculateForOdogwuOrder(numberOfPeople);
                printResult(numberOfBoxes, remainingSlices, orderedPizzaPrice);
            }
            break;

            default : System.out.println("This is Iya Honor Pizza ,not Dominos!.");
        }

    }

    public void printResult(int numberOfBoxes, int remainingSlices, int orderedPizzaPrice) {
        System.out.println();
        System.out.printf("The number of boxes ordered is: %d boxes%n", numberOfBoxes);
        System.out.printf("The number of slices remaining is: %d slices left%n", remainingSlices);
        System.out.printf("The price of the ordered pizza is: ₦%d%n", orderedPizzaPrice);
        System.out.println();
        System.out.println("Thank you for your patronage! See you again");
    }

///////////////////////////////////////////////////////////////////////////////////////////////////

    public  int calculateNumberOfBoxesForSapaSizePizza(int numberOfPeople) {
        if (numberOfPeople % 4 == 0) {
            return numberOfPeople / 4;
        } 
        else {
            return (numberOfPeople / 4) + 1;
        }
    }

    public  int calculateForSapaSizePizzaRemainingSlices(int numberOfPeople) {

        int numberOfBoxes = calculateNumberOfBoxesForSapaSizePizza(numberOfPeople);
        if (numberOfPeople % 4 == 0) {
            return 0;
        } 
        else {
            return (numberOfBoxes * 4) - numberOfPeople;
        }
    }

    public  int calculateForSapaSizeOrder(int numberOfPeople) {
        int numberOfBoxes = calculateNumberOfBoxesForSapaSizePizza(numberOfPeople);
        return 2500 * numberOfBoxes;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////


    public  int calculateNumberOfBoxesForSmallMoneyPizza(int numberOfPeople) {
        if (numberOfPeople % 6 == 0) {
            return numberOfPeople / 6;
        } 
        else {
            return (numberOfPeople / 6) + 1;
        }
    }
    public  int calculateForSmallMoneyPizzaRemainingSlices(int numberOfPeople) {
        if (numberOfPeople % 6 == 0) {
            return 0;
        } 
        else {
            int numberOfBoxes = calculateNumberOfBoxesForSmallMoneyPizza(numberOfPeople);
            return (numberOfBoxes * 6) - numberOfPeople;
        }
    }
    public  int calculateForSmallMoneyOrder(int numberOfPeople) {
        int numberOfBoxes = calculateNumberOfBoxesForSmallMoneyPizza(numberOfPeople);
        return 2900 * numberOfBoxes;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////


    public  int calculateNumberOfBoxesForBigBoysPizza(int numberOfPeople) {
        if (numberOfPeople % 8 == 0) {
            return numberOfPeople / 8;
        } 
        else {
            return (numberOfPeople / 8) + 1;
        }
    }
    public  int calculateForBigBoysPizzaRemainingSlices(int numberOfPeople) {
        if (numberOfPeople % 8 == 0) {
            return 0;
        } 
        else {
            int numberOfBoxes = calculateNumberOfBoxesForBigBoysPizza(numberOfPeople);
            return (numberOfBoxes * 8) - numberOfPeople;
        }
    }
    public  int calculateForBigBoysOrder(int numberOfPeople) {
        int numberOfBoxes = calculateNumberOfBoxesForBigBoysPizza(numberOfPeople);
        return 4000 * numberOfBoxes;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////

    public  int calculateNumberOfBoxesForOdogwuPizza(int numberOfPeople) {
        if (numberOfPeople % 12 == 0) {
            return numberOfPeople / 12;
        } 
        else {
            return (numberOfPeople / 12) + 1;
        }
    }
    
    public int calculateForOdogwuPizzaRemainingSlices(int numberOfPeople) {
        if (numberOfPeople % 12 == 0) {
            return 0;
        } 
        else {
            int numberOfBoxes = calculateNumberOfBoxesForOdogwuPizza(numberOfPeople);
            return (numberOfBoxes * 12) - numberOfPeople;
        }
    }
    public  int calculateForOdogwuOrder(int numberOfPeople) {
        int numberOfBoxes = calculateNumberOfBoxesForOdogwuPizza(numberOfPeople);
        return 5200 * numberOfBoxes;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////
}







