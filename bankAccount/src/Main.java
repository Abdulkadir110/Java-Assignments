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
    IO.print("Enter your preferably account name: ");
    String accountName = inputCollector.next();
    IO.print("Enter your preferably transaction pin: ");
    String ownerPin = inputCollector.next();

    while (!choice.equals("0")) {
        switch (choice){
            case "1" -> {
                int ownerAccountNumber = firstBank.createAccount(accountName, ownerPin);
                System.out.printf("your account Number is : %d\naccount created successfully >>>>>>>>>>>>>>", ownerAccountNumber);
                IO.println();
                IO.println(accountFunctions);
                IO.println("Enter your options: ");
                String accountChoice = inputCollector.nextLine();
                while(!accountChoice.equals("0")){
                    switch (accountChoice) {
                        case "1" -> {
                            IO.print("How much do you want to deposit: ");
                            String userAmount = inputCollector.nextLine();
                            validateDigit(userAmount);
                            int depositAmount = convertToNumbers(userAmount);
                            try {
                                firstBank.deposit(ownerAccountNumber, depositAmount);
                            }catch (IllegalArgumentException e){
                                //Expected
                            }
                            IO.println("amount deposited successfully >>>>>>>>>>>>>>>>>>");
                        }
                        case "2" -> {
                            IO.print("How much do you want to withdraw: ");
                            String userAmount = inputCollector.nextLine();
                            validateDigit(userAmount);
                            int withdrawAmount = convertToNumbers(userAmount);
                            try {
                                firstBank.withdraw(ownerAccountNumber, withdrawAmount, ownerPin);
                            }catch (IllegalArgumentException e){
                                //Expected
                            }
                            IO.println("amount withdrew successfully >>>>>>>>>>>>>>>>>>");
                        }
                        case "3" -> {
                            IO.print("How much do you want to transfer: ");
                            String userAmount = inputCollector.nextLine();
                            validateDigit(userAmount);
                            int transferAmount = convertToNumbers(userAmount);

                            IO.print("Enter the receiver's account: ");
                            String receiverAccount = inputCollector.next();
                            validateDigit(receiverAccount);
                            IO.println("Please Enter your pin to confirm your identity: ");
                            String inputtedPin = inputCollector.next();
                            validateDigit(inputtedPin);
                            int userPin = convertToNumbers(inputtedPin);

                            int receiverAccountNumber = convertToNumbers(receiverAccount);
                            try {
                                firstBank.transfer(transferAmount, ownerAccountNumber, receiverAccountNumber, userPin);
                            }catch (IllegalArgumentException e){
                                //Expected
                            }
                            IO.println("amount transferred successfully >>>>>>>>>>>>>>>>>>");
                        }
                        case "4" -> {
                            IO.println("Please Enter your pin to confirm your identity: ");
                            String inputtedPin = inputCollector.next();
                            validateDigit(inputtedPin);
                            int userPin = convertToNumbers(inputtedPin);
                            IO.println("Your Balance is : " + firstBank.checkBalance(ownerAccountNumber, inputtedPin));
                        }
                    }
                }
            }
        }
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
