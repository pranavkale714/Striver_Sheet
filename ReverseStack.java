import java.util.Stack;

class Solution {

    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();

        insertAtBottom(stack, value);

        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        reverseStack(stack);

        insertAtBottom(stack, top);
    }
}

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        Solution.reverseStack(stack);

        System.out.print("Reversed Stack: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println();
    }
}
