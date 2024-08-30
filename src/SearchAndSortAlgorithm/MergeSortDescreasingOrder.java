package SearchAndSortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a code that sorts an array in decreasing order using Merge Sort algorithm.

Note that the array in the question which needs to be sorted is named as "randomNumbers". You need to sort the numbers inside the "randomNumbers" array and store the sorted array inside the "sortedNumbers" array.

Input:
         1. The first input is 'n', that is, the number of elements in the array.
         2. In the next line, n elements of the array space-separated.

Output:
The array sorted in decreasing order.

Sample Input-1:
8
9 45 76 23 47 1 5 11

Sample Output-1
[76,47,45,23,11,9,5,1]

Sample Input-1:
4
1 4 19 3

Sample Output-1
[19,4,3,1]
 */

public class MergeSortDescreasingOrder {

    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        // first denotes the starting index of the "numbers" array
        // last denotes the ending index of the "numbers" array
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid + 1, last);
            merge(numbers, first, mid, last);
        }

        //Complete this function
        return numbers;
    }

    private static int[] merge(int[] numbers, int first, int mid, int last) {
        int[] t = new int[numbers.length];
        int i = first, j = mid + 1, k = first;

        while (i <= mid && j <= last) {
            if (numbers[i] >= numbers[j]) {
                t[k] = numbers[i];
                k++;
                i++;
            } else {
                t[k] = numbers[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            t[k] = numbers[i];
            k++;
            i++;
        }

        while (j <= last) {
            t[k] = numbers[j];
            k++;
            j++;
        }

        for (int x = first; x <= last; x++) {
            numbers[x] = t[x];
        }

        return numbers;

    }


    /// .......
    // Write the Merge function here which uses the merge sort to sort the array in decreasing order...
    /// .......

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
