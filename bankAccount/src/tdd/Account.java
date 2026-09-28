package tdd;

public class Account {
    private double balance;
    private String pin;
    public Account(String pin){
        if(pin.length() != 4) throw new IllegalArgumentException("Length should be 4");
        this.pin = pin;
    }
    public double getBalance(String pin) {
        if(!pin.equals(this.pin)) throw new IllegalArgumentException("Incorrect Pin");
        return balance;
    }
    public void deposit(double amount) {
        if(amount > 0)balance += amount;
    }
    public void withdraw(double amount, String pin) {
        if(amount > 0 && amount <= balance && pin.equals(this.pin)) {
            balance -= amount;
        }
        else if (!pin.equals(this.pin)){
            throw new IllegalArgumentException("Incorrect Pin");
        }
    }
}