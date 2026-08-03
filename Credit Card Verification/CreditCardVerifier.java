public class CreditCardVerifier {
    public static void main(String [] args) {
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card details to verify");
        String cardNumber = inputCollector.nextLine();
        
        System.out.println("*****************************************");
        System.out.print("**Credit Card Tyoe: "); cardName(cardNumber);
        System.out.println("**Credit Card Number: " + cardNumber(cardNumber));
        System.out.println("**Credit Card Digit Length: " + lengthOfTheCardDigit(cardNumber));
        System.out.println("**Credit Card Validity Status: " + validityOf(cardNumber));
        System.out.println("*****************************************");
    }
    public static boolean hasOnlyNumbers(String cardNumber) {
        boolean isOnlyNumber = true;
        for(int index = 0; index < cardNumber.length(); index++) {
              int eachCharacter = cardNumber.charAt(index);
            if(!Character.isDigit(eachCharacter)) {
                 isOnlyNumber = false;
            }
        }
        return isOnlyNumber; 
    }

    private static String cardNumber(String cardNumber) {
         String validNumber = "";
        if(hasOnlyNumbers(cardNumber) == true) {
             validNumber = cardNumber;
        }
        else {
             validNumber = "Inavlid inputs";
        }
    return validNumber;
    }  
  
    public static boolean isBetweenThirteenToSixteen(String cardNumber) {
        return (cardNumber.length() >= 13 && cardNumber.length() <= 16);
    }

    private static int lengthOfTheCardDigit(String cardNumber) {
        int cardDigitLength = 0;
        if(isBetweenThirteenToSixteen(cardNumber) == true) {
            cardDigitLength = cardNumber.length();
        }
        else {
            cardDigitLength = cardNumber.length();
        }
     return cardDigitLength;
    }

    private static void cardName(String cardNumber) {
        if(isStartWithAValidCardNumber(cardNumber) == true) {
            if(cardNumber.charAt(0) == '4') {
                System.out.println("Visa Cards");
            }
            else if (cardNumber.charAt(0) == '5') {
                System.out.println("MasterCard");
            }
            else if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7' ) {
                System.out.println("American Express Cards");
            }
            else if(cardNumber.charAt(0) == '6') {
                System.out.println("Discover cards");
            }
        }
    }

    public static boolean isStartWithAValidCardNumber(String cardNumber) {
     boolean isValid = false;
          if(hasOnlyNumbers(cardNumber) == true) {
                if(cardNumber.charAt(0) == '4') {
                    isValid = true;
                }
                else if (cardNumber.charAt(0) == '5') {
                    isValid = true;
                }
                else if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7' ) {
                    isValid = true;
                }
                else if(cardNumber.charAt(0) == '6') {
                    isValid = true;
                }
          }
        return isValid;
    }
    
    public static int doubleEverySecondDigit(String cardNumber) {
        int [] cardNumbers = cardNumberInArray(cardNumber);
        int sumOfTheDigitsAtEvenIndex = 0;
        int doubledDigits = 0;
 
        for (int index = 0; index < cardNumbers.length; index++) {
            if(index % 2 == 0 || index == 0) {
                doubledDigits = cardNumbers[index] * 2;
                    if(doubledDigits > 9) {
                        doubledDigits = (doubledDigits % 10)  + ((doubledDigits / 10) % 10);          
                    } 
                sumOfTheDigitsAtEvenIndex += doubledDigits;
            }
        }
        return sumOfTheDigitsAtEvenIndex;
    }

    public static int sumOfEveryDigitAtOddIndex(String cardNumber) {
        int [] cardNumbers = cardNumberInArray(cardNumber);
        int sumOfTheDigitsAtOddIndex = 0;
 
        for (int index = 0; index < cardNumbers.length; index++) {
            if(index % 2 != 0) {
                sumOfTheDigitsAtOddIndex += cardNumbers[index];
                
            }
        }
        return sumOfTheDigitsAtOddIndex;
    }

    public static int[] cardNumberInArray(String cardNumber) {
        return convertingCardNumberToArrayOfIntegers(cardNumber);

    }

    private static int[] convertingCardNumberToArrayOfIntegers(String cardNumber) {
        String[] stringArray = new String[cardNumber.length()];
        stringArray = cardNumber.split("");
        int numbers = 0;
        int[] CardNumbers = new int [cardNumber.length()];

            for (int index = 0; index < cardNumber.length(); index++) {

                  CardNumbers[index] = Integer.parseInt(stringArray[index]);
            }
        return CardNumbers;
     }
        
      private static int sumOfTheDigitsResult(String cardNumber) {
            int result = doubleEverySecondDigit(cardNumber) + sumOfEveryDigitAtOddIndex(cardNumber); 
            return result;
      }
        
      public static boolean theCardNumberIsValid(String cardNumber) {
         boolean validCard = false;
            if(sumOfTheDigitsResult(cardNumber) % 10 == 0) {
                validCard = true;
            }
            else {
                validCard = false;
            }
        return validCard;
      }
    
     public static String validityOf(String cardNumber) {
        String validityChecker = "" ;       
        if (theCardNumberIsValid(cardNumber) == true) {
            validityChecker = "Valid";
        }
        else {
            validityChecker = "Invalid";
        } 
       return validityChecker;
     } 


}
