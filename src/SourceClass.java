import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SourceClass {

    /*
    Write a Java program to calculate the factorial of a positive integer entered by a user. Implement a method called calculateFactorial that takes an integer argument and calculates its factorial. If the user enters a negative number or zero, throw a custom IllegalArgumentException with an appropriate error message. Handle the exception in the calling code and display the error message.

Try giving all three types of inputs: positive number, negative number and invalid number.
     */


    // Class name should be "Source",
// otherwise solution won't be accepted

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {

                String input = scanner.nextLine();
                System.out.print("Enter a string: " + input + "\n");

                try {
                    int number = Integer.parseInt(input);
                    System.out.println("Converted integer: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid input. The string cannot be parsed as an integer.");
                }

            } catch (NullPointerException e) {
                System.out.println("Error: Empty string entered. Please provide a non-empty string.");
            }

            scanner.close();
        }
    }

