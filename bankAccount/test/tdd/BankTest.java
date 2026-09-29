package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankTest {
    private Bank firstBank;
    private String correctPin = "1234";
    private String accountName = "Abdulkadir";
    @BeforeEach
    public void startWith(){
        firstBank = new Bank();
    }
    @Test
    public void I_Create_A_Bank_AccountNumber_Generated_NumberOfCustomersIncreases(){
        int accountNumber = firstBank.createAccount(accountName, correctPin);
        assertEquals(1,accountNumber);
        assertEquals(1, firstBank.numberOfCustomers());
    }
    @Test
    public void I_deposit_5k_into_theAccount(){
        int accountNumber = firstBank.createAccount(accountName, correctPin);
        firstBank.deposit(accountNumber, 5_000);
        assertEquals(5_000, firstBank.checkBalance(accountNumber,correctPin));
    }
    @Test
    public void I_deposit_5k_Withdraw_2kFromTheAccount(){
        int accountNumber = firstBank.createAccount(accountName, correctPin);
        firstBank.deposit(accountNumber, 5_000);
        firstBank.withdraw(accountNumber, 2_000, correctPin);
        assertEquals(3_000, firstBank.checkBalance(accountNumber,correctPin));
    }
    @Test
    public void deposit_5k_toSender_transfer_3k_to_receiver(){
        int sender = firstBank.createAccount(accountName, correctPin);
        int receiver = firstBank.createAccount("tunde", "4321");
        firstBank.deposit(sender, 5000);
        firstBank.transfer(3000, sender, receiver, correctPin);
        assertEquals(2000, firstBank.checkBalance(sender, correctPin));
        assertEquals(3000, firstBank.checkBalance(receiver, "4321"));
        assertEquals(2, firstBank.numberOfCustomers());
    }
    @Test
    public void deposit_3k_toSender_transfer_5k_to_receiver_throwsException(){
        int sender = firstBank.createAccount(accountName, correctPin);
        int receiver = firstBank.createAccount("tunde", "4321");
        firstBank.deposit(sender, 3000);
        assertThrows(IllegalArgumentException.class, () -> firstBank.transfer(5000, sender, receiver, correctPin));
        assertEquals(3000, firstBank.checkBalance(sender, correctPin));
        assertEquals(0, firstBank.checkBalance(receiver, "4321"));
        assertEquals(2, firstBank.numberOfCustomers());
    }
    @Test
    public void deposit_5k_toSender_transfer_3k_to_AnUnknownAccount_throwsException(){
        int sender = firstBank.createAccount(accountName, correctPin);
        firstBank.deposit(sender, 5000);
        assertThrows(IllegalArgumentException.class, () -> firstBank.transfer(3000, sender, 3, correctPin));
        assertEquals(5000, firstBank.checkBalance(sender, correctPin));
        assertEquals(1, firstBank.numberOfCustomers());
    }
}