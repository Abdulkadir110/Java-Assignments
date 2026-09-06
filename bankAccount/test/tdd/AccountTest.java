import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account myAccount;

    @BeforeEach
    public void instantiateBeforeEach() {
       myAccount = new Account();
    }
    @Test
    public void testThatIDeposit5kAndTheBalanceIs5k(){
        //Given
        assertEquals(0.0, myAccount.getBalance());
        //When
        myAccount.deposit(5_000);
        //check
        assertEquals(5000, myAccount.getBalance());
    }
    @Test
    public void testThatIDepositMinus5kAndBalanceRemainsTheSame(){
        //Given
        assertEquals(0.0, myAccount.getBalance());
        //When
        myAccount.deposit(-5_000);
        //Check
        assertEquals(0.0, myAccount.getBalance());
    }
    @Test
    public void testThatIWithdraw2kFrom5k_TheBalanceIs3k() {
        //Given
        assertEquals(0.0, myAccount.getBalance());
        //When
        myAccount.deposit(5_000);
        assertEquals(5000, myAccount.getBalance());
        myAccount.withdraw(2000);
        assertEquals(3000, myAccount.getBalance());

    }

}
