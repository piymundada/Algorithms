import java.util.Arrays;
import java.util.Scanner;

/*
An integer value is given to you as an input, and you need to print the pattern for the number of rows given as input. For example:



Sample Input:

5

Sample Output:

*

**

***

****

*****



Sample Input:

3

Sample Output:

*

**

***
 */
public class RecursionPrintPattern {
        // function to print the required pattern

    public static void factorial2(int n) {
        int[] factorials = new int[n + 1];
        Arrays.fill(factorials, 1);
        for (int i = 0; i <= n - 1; i++) {
            factorials[i + 1] = (i + 1) * factorials[i];
        }
        System.out.println(factorials[n]);
    }
        public static void main(String[] args) {
            factorial2(12);
        }

    }