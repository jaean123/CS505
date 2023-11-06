import java.util.Iterator;

public class CustomQueueTest {
    public static void main(String[] args) {
        CustomQueue<String> lineOfCustomers = new CustomQueue<>();
        lineOfCustomers.enqueue("Bob");
        lineOfCustomers.enqueue("Sally");
        lineOfCustomers.enqueue("Dan");
        lineOfCustomers.enqueue("Billy");
        lineOfCustomers.enqueue("Kate");

        System.out.print("There are " + lineOfCustomers.size() + " customers on line are as follows: ");
        Iterator<String> iterator = lineOfCustomers.iterator();
        while (iterator.hasNext()) {  // Alternativelly, you can use the for-each statement.
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println(lineOfCustomers.peek() + " is the first one on line.");
        while (!lineOfCustomers.isEmpty()) {
            System.out.println(lineOfCustomers.dequeue() + " has been served.");
        }
    }
}
