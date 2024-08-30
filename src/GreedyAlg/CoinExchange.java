package GreedyAlg;

import java.util.Scanner;

/*
Problem Statement :-

Given an unlimited supply for few denominations [1,5,7,10] and an amount n, your code should output the number of ways the amount can be paid from the given denominations.



The input should have the amount n, the amount for which you have to find the number of ways.
The output should print the number of ways the amount can be paid.


Sample Input

20

Sample Output

15



Sample Input

12

Sample Output

6
 */
public class CoinExchange {

    public static int count(int[] d, int amount) {

        int[][] V = new int[amount + 1][d.length];

        /* Write down the base solution*/
        /* Fill in the rest of the matrix using recursion relation */
        for (int i = 0; i < d.length; i++) {
            V[0][i] = 1;
        }
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < d.length; j++) {
                if (i >= d[j]) {
                    V[i][j] = V[i - d[j]][j];
                }
                if (j >= 1) {
                    V[i][j] += V[i][j - 1];
                }
            }
        }
        /* Return the solution for the complete amount */
        /* Print the solution matrix */
        return V[amount][d.length-1];
    }

    public static void main(String args[]) {
        int[] d = {1,5,7,10};
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        System.out.println(count(d, amount));
        scan.close();
    }
}
