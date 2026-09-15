package accountSavings;

public class Account {
    protected double balance;

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public double checkBalance(){
        return balance;
    }
}
class SavingsAccount extends Account {
    private double interestRate;
    SavingsAccount(double interestRate){
        this.interestRate = interestRate;
    }
    public void applyInterest(){
        balance *= interestRate;
    }
}
class CheckingAccount extends Account {
    private double overdraftLimit;
    CheckingAccount (double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount){
        if(amount > -overdraftLimit) super.withdraw(amount);
    }
}
