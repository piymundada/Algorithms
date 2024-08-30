package SearchAndSortAlgorithm;

/*
Given an array of non-negative integers, write a code to search the position of an element in the array in the reverse order. Do not print anything when the element is not present in the given array.
Also, if the key is repeated, print the index where the key is appearing for the first time in reverse order.

The code should :
Take the size of the array as an input from the user.
The elements of the array as an input from the user.
The key you are searching for, as an input from the user.

Sample Input:
7
6 8 3 5 9 1 2
9
Sample Output:
2
Here the output is 2 because the position of number 9 is 2 from the reverse order as mentioned in the question.
 */

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Get the size of the array from the user
        int count = input.nextInt();

        // Create an array of size count
        int[] arr = new int[count];

        // Get the array elements from the user
        for (int i = 0; i < count; i++) {
            arr[i] = input.nextInt();
        }

        // Get the key to search for from the user
        int key = input.nextInt();

        input.close();

        int position = 0;

        // Search for the key in the reverse order
        for (int i = count - 1; i >= 0; i--) {
            if (arr[i] == key) {
                System.out.println(position);
                return;
            }
            position++;
        }

        // If the key is not found, print nothing
        System.out.println();

    }
}
