import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Factorial {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here.*/
        Scanner sc = new Scanner(System.in);

        try {
            int num = sc.nextInt();
            System.out.println("Factorial of " + num + "is: "+calculateFactorial(num));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Error: Invalid input. Please provide an integer.");
        }
    }
    public static int calculateFactorial(int num){
        if(num <= 0){
            throw new IllegalArgumentException("Error: Factorial is not defined for negative numbers.");
        }
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }
}