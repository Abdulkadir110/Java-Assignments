import java.util.Scanner;
public class MainTransactionLog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] history = new String[10];
        
        transactionLog logApp = new transactionLog();
        double balance = logApp.checkBalance(); 
        int exit = 1;
        while(exit != 0){
        String menu = """
        [1] Check Balance
        [2] Deposit
        [3] Withraw
        [4] Show transactionHistory
        [0] Exit
        """;
        System.out.println(menu);
        System.out.print("Enter your choice: ");
        String choice = input.next();
        
        switch (choice) {
            case "1" : {
                System.out.println("Your balance is:" + logApp.checkBalance());
                break;
            }
            case "2" : {
                System.out.print("Enter your deposit amount: ");
                double amount = input.nextDouble();
                logApp.depositInto(amount);
                System.out.println("New balance: " + logApp.checkBalance());
                break;
            }
            case "3" : {
                System.out.print("Enter your Withraw amount: ");
                double amount = input.nextDouble();
                logApp.withdrawFrom(amount);
                if(amount > logApp.checkBalance()) {
                    System.out.println("Invalid amount");
                }
                    System.out.println("New balance: " + logApp.checkBalance());
                break;
            }
            case "4" : {
                for(int index = 0; index < logApp.transactionHistory.length; index++){
                    if(logApp.transactionHistory[index] != null) {
                       System.out.println(logApp.transactionHistory[index]);
                    }
                    
                }
                break;
            }
            case "0" : {
                exit = 0;
            }
            default : System.out.println("Invalid inputs")break;
        }
        }

    }
}
