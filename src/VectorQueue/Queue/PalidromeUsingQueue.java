package VectorQueue.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
Given an input string of unknown length, write a program to check whether the string is a palindrome or not using a queue data structure. If the string comes out to be a palindrome, then print “ The given input is a palindrome.”  else print “ The given input is not a palindrome.” . Your program should take the following as input from the user:

The string to be checked for palindrome.

Note: The input is to be taken as a string and it should be case sensitive.
Sample Input 1:
DAD
Sample Output 1:
The given input is a palindrome.
Sample Input 2:
.&.*.&.
Sample Output 2:
The given input is a palindrome.
Sample Input 3:
abca
Sample Output 3:
The given input is not a palindrome.
 */
public class PalidromeUsingQueue {

    static char []stack;
    static int top = -1;

    // push function
    static void push(char ele)
    {
        stack[++top] = ele;
    }

    // pop function
    static char pop()
    {
        return stack[top--];
    }

    // Function that returns 1
// if str is a palindrome
    static int isPalindrome(char str[])
    {
        int length = str.length;

        // Allocating the memory for the stack
        stack = new char[length * 4];

        // Finding the mid
        int i, mid = length / 2;

        for (i = 0; i < mid; i++)
        {
            push(str[i]);
        }

        // Checking if the length of the String
        // is odd, if odd then neglect the
        // middle character
        if (length % 2 != 0)
        {
            i++;
        }

        // While not the end of the String
        while (i < length)
        {
            char ele = pop();

            // If the characters differ then the
            // given String is not a palindrome
            if (ele != str[i])
                return 0;
            i++;
        }

        return 1;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char str[] = input.toCharArray();

        if (isPalindrome(str) == 1)
        {
            System.out.printf("The given input is a palindrome.");
        }
        else
        {
            System.out.printf("The given input is not a palindrome.");
        }
    }
}