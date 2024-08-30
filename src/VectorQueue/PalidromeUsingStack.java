package VectorQueue;

import java.util.Stack;

public class PalidromeUsingStack {
    public static void main(String[] args) {
        String input = "MALAYALAM";
        System.out.println(isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            if (stack.pop() != input.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
