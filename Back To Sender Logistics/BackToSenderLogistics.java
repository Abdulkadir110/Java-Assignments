import java.util.Scanner;
public class BackToSenderLogistics {
    public void main(String[] args)  {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of succesful deliveries: ");
        int successfulDelivery = userInput.nextInt();
        
        logisticsPayment(successfulDelivery);
    }
    public void logisticsPayment(int successfulDelivery) {
        if(successfulDelivery < 50) {
            System.out.println("The rider wage for the day is: ₦" + riderWageForSuccessfulDeliveryBelowFiftyPercent(successfulDelivery));
        }
        else if(successfulDelivery >= 50 && successfulDelivery < 60) {
            System.out.println("The rider wage for the day is: ₦" + riderWageForSuccessfulDeliveryBetweenFiftyToFiftyNinePercent(successfulDelivery));
        }
        else if(successfulDelivery >= 60 && successfulDelivery < 70) {
            System.out.println("The rider wage for the day is: ₦" + riderWageForSuccessfulDeliveryBetweenSixtyToSixtyNinePercent(successfulDelivery));
        }
        else if(successfulDelivery >= 70) {
            System.out.println("The rider wage for the day is: ₦" + riderWageForSuccessfulDeliveryAboveSeventyPercent(successfulDelivery));
        }
        else {
            System.out.println("The Driver is lying, they were all given 100 packages each to deliver.");
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
