package tdd;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    private int generateAccountNumber() {
        return accounts.size() + 1;
    }
    public int createAccount(String accountName, String userPin) {
        int accountNumber = generateAccountNumber();
        Account account = new Account(userPin);
        accounts.add(account);
        return accountNumber;
    }
    public int numberOfCustomers(){
        return accounts.size();
    }

    public void deposit(int accountNumber, double amount) {
        Account foundAccount = findAccount(accountNumber);
        foundAccount.deposit(amount);
    }
    public double checkBalance(int accountNumber, String userPin){
        return accounts.get(accountNumber - 1).getBalance(userPin);
    }
    public void withdraw(int accountNumber, double amount, String pin){
        Account foundAccount = findAccount(accountNumber);
        validateTransaction(accountNumber, amount, pin);
        foundAccount.withdraw(amount, pin);
    }
    private Account findAccount(int accountNumber) {
        validateAccountNumber(accountNumber);
        return accounts.get(accountNumber - 1);
    }
    public void transfer(int amount, int sender, int receiver, String senderPin) {
        validateAccountNumber(sender);
        validateAccountNumber(receiver);
        withdraw(sender, amount, senderPin);
        deposit(receiver, amount);
    }
    private void validateTransaction(int accountNumber, double amount, String userPin){
        Account foundAccount = findAccount(accountNumber);
        if(foundAccount.getBalance(userPin) < amount ) throw new IllegalArgumentException("Insufficient balance");
    }
    private void validateAccountNumber(int accountNumber){
        boolean isValidAccountNumber = accountNumber > accounts.size() || accountNumber <= 0;
        if(isValidAccountNumber) throw new IllegalArgumentException("Invalid Account number");
    }
}
