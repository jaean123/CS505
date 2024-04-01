import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Print the stack
        System.out.println("Stack: " + stack);

        // Peek at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);

        // Pop elements from the stack
        System.out.println("Popping elements:");
        while (!stack.isEmpty()) {
            Integer element = stack.pop();
            System.out.println("Popped element: " + element);
        }

        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is now empty.");
        }
    }
}
