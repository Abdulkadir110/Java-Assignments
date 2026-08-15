public class creditCard {
    public static void main (String[] args) {
        long cardNumber = 4388576018402626l;       
        int length1 = length(cardNumber);
        boolean validLength = isTheCardNumberLengthValid(cardNumber);
        boolean validCard = isValidCardNetwork(cardNumber);
        int totalOfDigitsAtOddPlaces = getSecondDigitAtOdd(cardNumber);
        System.out.println(length1);
        System.out.println(validLength);
        System.out.println(totalOfDigitsAtOddPlaces);
    }    
    public static int length(long cardNumber) {
        int length = 0;
        while(cardNumber != 0) {
            cardNumber /= 10;        
            length++;
        }
        return length;
    }
    public static boolean isTheCardNumberLengthValid(long cardNumber) {
        boolean isValidNumberLength = false;
        if(length(cardNumber) >= 13 && length(cardNumber) <=16 ) {
            isValidNumberLength = true;
        }
        return isValidNumberLength;
    }
    public static boolean isValidCardNetwork(long cardNumber) {
        boolean isValidCardNetwork = false;
        long cardNumberForAmericanCard = cardNumber;
        long cardNumberForOtherCards = cardNumber;
        while(cardNumberForOtherCards >= 10) {
            cardNumberForOtherCards /= 10;
        }
        while (cardNumberForAmericanCard >=100){
            cardNumberForAmericanCard /= 10;
        }
        if(isTheCardNumberLengthValid(cardNumber) == true){
            if(cardNumberForOtherCards == 4 || cardNumberForOtherCards == 5 || cardNumberForOtherCards == 6 || cardNumberForAmericanCard == 37) {
                isValidCardNetwork = true;
            }
        }
        return isValidCardNetwork;
    }
    public static int getSecondDigitAtOdd(long cardNumber) {
        int evenCounter = 0;
        int sum= 0;
        while(cardNumber != 0) {
            long digit = cardNumber % 10;

            if(evenCounter % 2 ==0) {
                sum += (int)digit;
            }
            evenCounter++;
            cardNumber /= 10;
        }
        return sum;
    }
}
