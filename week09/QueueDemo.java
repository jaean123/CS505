import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Create a Queue using ArrayDeque
        Queue<Integer> queue = new ArrayDeque<>();

        // Add elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Print the queue
        System.out.println("Queue: " + queue);

        // Peek at the head of the queue without removing it
        int head = queue.peek();
        System.out.println("Head of the queue (peek): " + head);

        // Remove elements from the queue
        System.out.println("Removing elements:");
        while (!queue.isEmpty()) {
            Integer element = queue.remove();
            System.out.println("Removed element: " + element);
        }

        // Check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("The queue is now empty.");
        }
    }
}
