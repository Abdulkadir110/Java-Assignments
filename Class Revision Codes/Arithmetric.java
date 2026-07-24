public class Arithmetric {
    public static void main(String ... args) {
        
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter your third number: ");
        int num3 = input.nextInt();

        System.out.println("The sum of the numbers is: " + kala.add(num1, num2, num3));


        kala n = new kala();
        System.out.println("The difference of the numbers is: " + n.substract(num1, num2, num3));
        
    }
}
