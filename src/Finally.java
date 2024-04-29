import java.util.Scanner;

public class Finally {
    /*
    Write a Java program to divide two numbers entered by a user. Implement a method called divideNumbers that takes two integer arguments representing the dividend and divisor. Calculate the quotient by dividing the two numbers. Handle exceptions that may occur during the division process using try-catch blocks. Finally, print a message indicating the end of the division process regardless of whether an exception occurred or not.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int dividend = scanner.nextInt();
            int divisor = scanner.nextInt();
            divideNumbers(dividend, divisor);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter two positive integers.");
        }

    }

    public static void divideNumbers(int dividend, int divisor) {
        try {
            int quotient = dividend / divisor;
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Division process completed.");
        }
    }
}
