package SearchAndSortAlgorithm;

import java.util.Scanner;

/*
Write a bubble sort program that prints the number of swaps made after M number of iterations (In this case, ‘M’ should be an input value).

For example, if M = 0, the bubble sort program will perform 0 swaps in 0 iterations.

In bubble sort, an iteration is defined as the total number of times the outer loop runs. Assume that:
1) M <= the array size and
2) the program sorts in descending order.

The code should ask the user to input the values for M, the array size, and finally the elements of the array. So, there will be three types of inputs —

Input 1: The value of M
Input 2: The size of the array
Input 3: The elements inside the array

Sample Input:
2
4
1
2
3
4

Sample Output:
5

 */
public class BubbleSortTillM {

    public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner input = new Scanner(System.in);

    // Get the value of M from the user
    int m = input.nextInt();

    // Get the size of the array from the user
    int count = input.nextInt();

    // Create an array of size 'count'
    int[] arr = new int[count];

    // Get the array elements from the user
        for (int i = 0; i < count; i++) {
        arr[i] = input.nextInt();
    }

    // Print the number of totalSwaps made
        System.out.println(totalBubbleSortSwaps(arr, m));

}

    static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length;
        int var = 0;
        int totalSwaps = 0;
        //Write your code here
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    totalSwaps++;
                }
            }
        }
        return totalSwaps;
    }
}
