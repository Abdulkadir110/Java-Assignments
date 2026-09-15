package accountSavings;

public class AccountMain {
    void main(){
        SavingsAccount myAcc = new SavingsAccount(5);
        myAcc.deposit(5000);
        myAcc.applyInterest();
        IO.println(myAcc.checkBalance());

        CheckingAccount myCheck = new CheckingAccount(5000);
        myCheck.deposit(5000);
        myCheck.withdraw(7000);
        IO.println(myCheck.checkBalance());
    }
}
