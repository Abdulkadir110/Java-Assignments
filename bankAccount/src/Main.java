import tdd.Bank;

void main() {
    Scanner inputCollector = new Scanner(System.in);
    Bank firstBank = new Bank();

    String welcomeMessage = "Welcome to FirstBank Monetary Application";
    String menuFunctions = """
            [1] Create An Account
            [0] Exit
            """;
    String accountFunctions = """
            [1] Deposit
            [2] withdraw
            [3] transfer
            [4] check Balance
            [0] Back
            """;
    IO.println(menuFunctions);
    IO.print("Enter your option: ");
    String choice = inputCollector.nextLine();
    int ownerAccountNumber = 0;
    while (!choice.equals("0")) {
        switch (choice){
            case "1" -> {
                IO.print("Enter your preferably account name: ");
                String accountName = inputCollector.nextLine();
                IO.print("Enter your preferably transaction pin: ");
                String ownerPin = inputCollector.nextLine();
                try {
                    ownerAccountNumber = firstBank.createAccount(accountName, ownerPin);
                }
                catch (IllegalArgumentException e){
                    IO.println("Error: " + e.getMessage());
                    break;
                }
                System.out.printf("your account Number is : %d\naccount created successfully >>>>>>>>>>>>>>", ownerAccountNumber);
                IO.println();
                IO.println(accountFunctions);
                IO.print("Enter your options: ");
                String menuChoice = inputCollector.nextLine();
                while(!menuChoice.equals("0")){
                    switch (menuChoice) {
                        case "1" -> {
                            IO.print("How much do you want to deposit: ");
                            String userAmount = inputCollector.nextLine();
                            IO.print("Enter the account number: ");
                            String givenAccountNumber = inputCollector.nextLine();
                            try {
                                validateDigit(userAmount);
                                int depositAmount = convertToNumbers(userAmount);
                                validateDigit(givenAccountNumber);
                                int accountNumber = convertToNumbers(givenAccountNumber);
                                firstBank.deposit(accountNumber, depositAmount);
                                IO.println("amount deposited successfully >>>>>>>>>>>>>>>>>>");
                            }catch (IllegalArgumentException e){
                                IO.println("Error: " + e.getMessage());
                            }
                        }
                        case "2" -> {
                            IO.print("How much do you want to withdraw: ");
                            String userAmount = inputCollector.nextLine();
                            IO.print("Enter the account number: ");
                            String givenAccountNumber = inputCollector.nextLine();
                            try {
                                validateDigit(userAmount);
                                int withdrawAmount = convertToNumbers(userAmount);
                                validateDigit(givenAccountNumber);
                                int accountNumber = convertToNumbers(givenAccountNumber);
                                firstBank.withdraw(accountNumber, withdrawAmount, ownerPin);
                                IO.println("amount withdrew successfully >>>>>>>>>>>>>>>>>>");
                            }catch (IllegalArgumentException e){
                                IO.println("Error: " + e.getMessage());
                            }
                        }
                        case "3" -> {
                            IO.print("How much do you want to transfer: ");
                            String userAmount = inputCollector.nextLine();
                            IO.print("Enter the sender's account number: ");
                            String senderAccount = inputCollector.nextLine();
                            IO.print("Enter the receiver's account number: ");
                            String receiverAccount = inputCollector.nextLine();
                            IO.println("Please Enter your pin to confirm your identity: ");
                            String inputtedPin = inputCollector.nextLine();
                            try {
                                validateDigit(userAmount);
                                int transferAmount = convertToNumbers(userAmount);
                                validateDigit(receiverAccount);
                                int receiverAccountNumber = convertToNumbers(receiverAccount);
                                validateDigit(senderAccount);
                                int senderAccountNumber = convertToNumbers(receiverAccount);
                                firstBank.transfer(transferAmount, senderAccountNumber, receiverAccountNumber, inputtedPin);
                                IO.println("amount transferred successfully >>>>>>>>>>>>>>>>>>");
                            }catch (IllegalArgumentException e){
                                IO.println("Error: " + e.getMessage());
                            }
                        }
                        case "4" -> {
                            IO.print("Enter the account number: ");
                            String givenAccountNumber = inputCollector.nextLine();
                            IO.println("Please Enter your pin to confirm your identity: ");
                            String inputtedPin = inputCollector.nextLine();
                            try {
                                validateDigit(givenAccountNumber);
                                int accountNumber = convertToNumbers(givenAccountNumber);
                                IO.println("Your Balance is : " + firstBank.checkBalance(accountNumber, inputtedPin));
                            }catch (IllegalArgumentException e){
                                IO.println("Error: " + e.getMessage());
                            }
                        }
                        default -> IO.println("Invalid option");
                    }
                    IO.println(accountFunctions);
                    IO.print("Enter your options: ");
                    menuChoice = inputCollector.nextLine();
                }
            }
            default -> IO.println("Invalid option");
        }
        IO.println(menuFunctions);
        IO.print("Enter your option: ");
        choice = inputCollector.nextLine();
    }
    IO.println("Thank you for your using our app, rate it!!!");

}
private void validateDigit(String numbers){
    for(int index = 0; index < numbers.length(); index++){
        if(!Character.isDigit(numbers.charAt(index))) throw new IllegalArgumentException("Invalid inputs");
    }
}
private int convertToNumbers(String numbers){
    return Integer.parseInt(numbers);
}