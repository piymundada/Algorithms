package VectorQueue;

import java.util.Stack;

/*
Find the kth largest element of stack
 */
public class SortStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(1);

        sortStack(stack);
        System.out.println(stack.elementAt(3));



    }

    private static boolean sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return true;
    }


}
