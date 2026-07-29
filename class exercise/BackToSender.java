import java.util.Scanner;
public class BackToSender {
    public static void main(String[] args)  {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of succesful deliveries: ");
        int succesfulDelivery = userInput.nextInt();
        
        final int BASEPAY = 5000;
        if(succesfulDelivery <= 100) {
                if (succesfulDelivery >= 70){
                    System.out.println("The rider wage for the day is: " + (succesfulDelivery * 500 + BASEPAY));
                }
                else if (succesfulDelivery >= 60 && succesfulDelivery < 70){
                    System.out.println("The rider wage for the day is: " + (succesfulDelivery * 250 + BASEPAY));   
                }
                else if (succesfulDelivery >= 50 && succesfulDelivery < 60){
                    System.out.println("The rider wage for the day is: " + (succesfulDelivery * 200 + BASEPAY));
                }
                else if (succesfulDelivery< 60){
                    System.out.println("The rider wage for the day is: " + (succesfulDelivery * 160 + BASEPAY));
                }
          }
          else {
                    System.out.println("Oga you be theif, who gave you " + succesfulDelivery + "number of packages");
            }
       }
}
