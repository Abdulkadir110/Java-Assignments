package tdd;

public class Account {
    private double balance;
    private String pin;

    public Account(String defaultPin){
        if(defaultPin.length() != 4) throw new IllegalArgumentException("Length should be 4");
        this.pin = defaultPin;
    }
    public double getBalance(String userPin) {
        validate(userPin);
        return balance;
    }
    public void deposit(double amount) {
        validate(amount);
        balance += amount;
    }
    public void withdraw(double amount, String userPin) {
        validate(userPin);
        validate(amount);
        boolean isValidTransaction = amount <= balance;
        if(isValidTransaction)balance -= amount;
    }
    private void validate(String userPin){
        if(!pin.equals(userPin)) throw new IllegalArgumentException("Invalid pin");
    }
    private void validate(double amount){
        if(amount < 0) throw new IllegalArgumentException("Invalid amount");
    }
}