package VectorQueue;

import java.util.Stack;
import java.util.EmptyStackException;

public class Parenthesis4 {
 /*
   NOTE
   ----
   We implement the parenthesis matching algorithm using a stack.
 */

    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        String inputString= "(a+((b+c))))+a";
        for(int k=1;k<inputString.length()-1;k++) {
            stack.push(inputString.charAt(k+1));
            if(inputString.charAt(k+1)==')'&& !stack.isEmpty())
                stack.pop();
            if(inputString.charAt(k-1)=='(' && !stack.isEmpty())
                stack.pop();
        }
        while (!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }

    private static Stack<Character> stack = new Stack<Character>();


    public static void main1(String[] args) {
        try {

            System.out.println(match("{[(}"));
            System.out.println(match("[{{{{{{{}}}}}}}]"));

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean match(String parens) throws Exception {
        Stack<Character> stack = new Stack<Character>();
        for(char c : parens.toCharArray()) {
            if(c == '(' || c == '{'|| c == '[') {
                stack.push(c);
            }
            else if(c == ')') {
                try {
                    char t = stack.pop();
                    if(t != '(') {
                        return false;
                    }
                }
                catch(EmptyStackException e) {
                    return false;
                }
            }
            else if(c == '}') {
                try {
                    char t = stack.pop();
                    if(t != '{') {
                        return false;
                    }
                }
                catch(EmptyStackException e) {
                    return false;
                }
            } else if(c == ']') {
                try {
                    char t = stack.pop();
                    if(t != '[') {
                        return false;
                    }
                }
                catch(EmptyStackException e) {
                    return false;
                }
            }
            else {
                throw new Exception("Unexpected character " + c);
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
