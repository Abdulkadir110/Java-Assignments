public class ArithmetricOfTwoNumbers {
        public static void main(String[] args){
            arithmetricOf(7,6, '/');
        }
        public static double multiply(double firstNumber, double secondNumber) {
            return firstNumber * secondNumber;
        }
        public static double add(double firstNumber, double secondNumber) {
            return firstNumber + secondNumber;    
        }
        public static double divide(double firstNumber, double secondNumber) {
            return firstNumber / secondNumber;     
        }
        public static double substract(double firstNumber, double secondNumber) {
            return firstNumber - secondNumber;
        }
        public static void arithmetricOf(double firstNumber, double secondNumber, char operator) {    
            switch(operator){
                case '*' : System.out.println("The product is: " + multiply(firstNumber,secondNumber));break;
                case '+' : System.out.println("The sum is: " + add(firstNumber,secondNumber));break;
                case '/' : System.out.println("The quotient is: " + divide(firstNumber,secondNumber));break;
                case '-' : System.out.println("The difference is: " + substract(firstNumber,secondNumber));break;
                default  : System.out.println("Invalid operator");
            }
        }
}
