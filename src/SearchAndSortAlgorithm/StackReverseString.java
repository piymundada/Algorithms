package SearchAndSortAlgorithm;

import java.util.Scanner;
import java.util.Stack;

/*
You are given a string and you have to print the reverse of the string using a stack.

Input Format
A string which has to be reversed.
Output Format
The reverse of the input string
Sample Input 1:
abcd
Sample Output 1:
dcba
Sample Input 2:
abcdef
Sample Output 2:
fedcba
 */
public class StackReverseString {

    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //write your code here
        for(int i=0;i<data.length();i++) {
            s.push(data.charAt(i));
        }
        String reverse = "";
        while(!s.isEmpty()) {
            reverse = reverse+s.pop();
        }
        System.out.println(reverse);

    }
}
