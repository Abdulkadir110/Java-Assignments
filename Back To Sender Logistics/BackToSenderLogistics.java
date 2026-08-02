import java.util.Scanner;
public class BackToSenderLogistics {
    public void main(String[] args)  {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of succesful deliveries: ");
        int successfulDelivery = userInput.nextInt();
        
        int riderWage = logisticsPayment(successfulDelivery);
        System.out.println("The rider wage for the day is: ₦" + riderWage);
    }
    public int logisticsPayment(int successfulDelivery) {
        if(successfulDelivery < 50) {
            return riderWageForSuccessfulDeliveryBelowFiftyPercent(successfulDelivery);
        }
        else if(successfulDelivery >= 50 && successfulDelivery < 60) {
            return riderWageForSuccessfulDeliveryBetweenFiftyToFiftyNinePercent(successfulDelivery);
        }
        else if(successfulDelivery >= 60 && successfulDelivery < 70) {
            return riderWageForSuccessfulDeliveryBetweenSixtyToSixtyNinePercent(successfulDelivery);
        }
        else if(successfulDelivery >= 70) {
            return riderWageForSuccessfulDeliveryAboveSeventyPercent(successfulDelivery);
        }
        else {
            System.out.println("The Driver is lying, they were all given 100 packages each to deliver.");
            return 0;
        }
    }    
    
    public int riderWageForSuccessfulDeliveryBelowFiftyPercent(int successfulDelivery){
        final int BASEPAY = 5000;
        return successfulDelivery * 160 + BASEPAY; 
       
    }
    public int riderWageForSuccessfulDeliveryBetweenFiftyToFiftyNinePercent(int successfulDelivery){
        final int BASEPAY = 5000;
        return successfulDelivery * 200 + BASEPAY; 

    }
    public int riderWageForSuccessfulDeliveryBetweenSixtyToSixtyNinePercent(int successfulDelivery){
        final int BASEPAY = 5000;
        return successfulDelivery * 250 + BASEPAY; 
        
    }
    public int riderWageForSuccessfulDeliveryAboveSeventyPercent(int successfulDelivery){
        final int BASEPAY = 5000;
        return successfulDelivery * 500 + BASEPAY; 
        
    }

}


