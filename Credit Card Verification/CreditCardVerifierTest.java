import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CreditCardVerifierTest {
    @Test
    public void testThatTheCreditCardHasOnlyNumbers() {

     //Given
        String cardNumber = "4388576018410707";

	assertTrue(CreditCardVerifier.hasOnlyNumbers(cardNumber));
         
    }

    @Test
    public void testThatTheCreditCardIsBetween13To16Digits() {

     //Given
        String cardNumber = "4388576018410707";

	assertTrue(CreditCardVerifier.isBetweenThirteenToSixteen(cardNumber));
         
    }
    
    @Test
    public void testThatTheCreditCardStartWithAValidNumber() {

     //Given
        String cardNumber = "4388576018410707";

	assertTrue(CreditCardVerifier.isStartWithAValidCardNumber(cardNumber));
         
    }  

    @Test
    public void testThatTheCreditCardIsValid() {
        //Given
        String cardNumber = "4388576018410707";

	    assertTrue(CreditCardVerifier.isStartWithAValidCardNumber(cardNumber));
    }
    @Test
    public void testThatTheCreditCardArrayOfCardNumber() {
        //Given
        String cardNumber = "4388576018410707";

	    int[] expected = CreditCardVerifier.cardNumberInArray(cardNumber);
        int[] result = {4,3,8,8,5,7,6,0,1,8,4,1,0,7,0,7};

        assertArrayEquals(expected, result);
    }
    
     @Test
    public void testThatAddUpAllDigitsAtOddIndexOfCardNumber() {
        //Given
        String cardNumber = "4388576018410707";

	    int expected = CreditCardVerifier.doubleEverySecondDigit(cardNumber);
        int result = 29; 

        assertEquals(expected, result);
    }

     @Test
    public void testThatAddUpAllDigitsAtEvenIndexOfCardNumber() {
        //Given
        String cardNumber = "4388576018410707";

	    int expected = CreditCardVerifier.sumOfEveryDigitAtOddIndex(cardNumber);
        int result = 41; 

        assertEquals(expected, result);
    }
    
     @Test
    public void testThatTheCardNumberIsValidForTransaction() {
        //Given
        String cardNumber = "4388576018410707";

	    assertTrue(CreditCardVerifier.theCardNumberIsValid(cardNumber));
    }
}




