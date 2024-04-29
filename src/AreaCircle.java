import java.util.Scanner;

public class AreaCircle {
    /*
    Write a Java program to calculate the area of a circle. Implement a method called calculateArea that considers the radius of the circle as an argument and calculates its area. If the radius provided is negative, throw a custom NegativeRadiusException. Declare the calculateArea method to throw this custom exception. Handle the exception in the calling code and display an appropriate error message.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int radius = scanner.nextInt();
            double area = calculateArea(radius);
            System.out.println("Area of the circle: " + area);
        } catch (NegativeRadiusException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a positive integer.");
        }
    }
    public static double calculateArea(double radius) throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Radius cannot be negative.");
        }
        double area = Math.PI * radius * radius;
        return area;
    }
    static class NegativeRadiusException extends Exception {
        public NegativeRadiusException(String message) {
            super(message);
        }
        public NegativeRadiusException() {
            super();
        }
        public NegativeRadiusException(String message, Throwable cause) {
            super(message, cause);
        }
        public NegativeRadiusException(Throwable cause) {
            super(cause);
        }
        protected NegativeRadiusException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}
