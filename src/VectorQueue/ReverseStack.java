package VectorQueue;

import java.util.Scanner;
import java.util.Stack;

/*
Reverse a stack
Description
Given an input sequence of characters stored in a stack and the stack is created using a linked list. Write a code to reverse the elements within the stack without using any auxiliary memory or recursive algorithm. Your code should take following lines of input:
The number of elements to be reversed in the stack.
The elements to be reversed in the stack.
Note:
 If the stack is empty then, print "the stack is empty".
The stub code also prints the original list.

Sample Input 1:
8
A 1 B 2 C 3 D 4
Sample Output 1:
4 D 3 C 2 B 1 A
A 1 B 2 C 3 D 4
Sample Input 2:
0
Sample Output 2:
the stack is empty
 */
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            System.out.println("the stack is empty");
        } else {
            for (int i = 0; i < n; i++) {
                stack.push(in.next().charAt(0));
            }
            Stack<Character> original = new Stack<>();
            original.addAll(stack);
            reverse(stack);
            System.out.println(stack.toString().replaceAll("[\\[ \\]]+", "").replaceAll(",", " "));
            System.out.println(original.toString().replaceAll("[\\[ \\]]+", "").replaceAll(",", " "));

        }
    }
    public static void reverse(Stack<Character> stack) {
        if (stack.isEmpty()) {
            return;
        }
        char temp = stack.pop();
        reverse(stack);
        insertAtBottom(stack, temp);

    }

    public static void insertAtBottom(Stack<Character> stack, char data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        char temp = stack.pop();
        insertAtBottom(stack, data);
        stack.push(temp);

    }

}
