/*
You are given an array of n integers, both negative and positive. You need to partition them into two different arrays without directly comparing any element to 0, 1, -1 or any other fixed value. Consider 0 as a positive number. If arr[0] is a positive number, then print all the positive numbers in the given order in the first line of output and then all the negative numbers in the given order in the second line of output, vice - versa.
Note:
If the array contains only positive numbers then print the positive numbers in the first line and in the second line print “Array doesn't have negative numbers”.
If the array contains only negative numbers then print the negative numbers in the first line and in the second line print “Array doesn't have positive numbers”.

Input: The input should be in the following format:
The first line should be the number of elements in the array.
The second line should be n elements of array space separated.

Output: The output should be in the following format:
If arr[0] is a negative number, then print all the negative numbers in the given order in the first line of output and then all the positive numbers in the given order in the second line of output, vice - versa.
Each element of each output line should be separated by a space.

 */

import java.util.*;

@Deprecated
class Source11112121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionNegativeAndPositive(n, arr);
    }




    // Method to partition negative and positive numbers without comparing with 0
    static void partitionNegativeAndPositive(int n, int arr[]) {
        // Write your code here
        @Deprecated
        int positive[] = new int[n];
        int negative[] = new int[n];
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positive[positiveCount++] = arr[i];
            } else {
                negative[negativeCount++] = arr[i];
            }
        }

           /*
           If arr[0] is a negative number, then print all the negative numbers in the given order in the first line of output and then all the positive numbers in the given order in the second line of output, vice - versa.
Each element of each output line should be separated by a space.
            */
        if (arr[0] < 0) {
            for (int i = 0; i < negativeCount; i++) {
                System.out.print(negative[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < positiveCount; i++) {
                System.out.print(positive[i] + " ");
            }
        } else {
            for (int i = 0; i < positiveCount; i++) {
                System.out.print(positive[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < negativeCount; i++) {
                System.out.print(negative[i] + " ");

            }
        }
    }

    }