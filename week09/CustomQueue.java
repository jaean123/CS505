import java.util.Iterator;
import java.util.LinkedList;

public class CustomQueue<T> implements Iterable<T> {
    private LinkedList<T> elements = new LinkedList<T>();

    /** Adds element to queue */
    public void enqueue(T element) {
        elements.add(element);
    }

    /** Dequeue element */
    public T dequeue() {
        return elements.removeFirst();
    }

    /** Returns the first element without removing it from queue */
    public T peek() {
        return elements.getFirst();
    }

    /** Clear the queue by removing all the elements */
    public void clear() {
        elements.clear();
    }

    /** Return the size of queue */
    public int size() {
        return elements.size();
    }

    /** Returns true if the queue is empty */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /** Returns the iterator. Delelegate the iterator to LinkedList.iterator()
     *  Allows us to utilize for each statement. */
    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}
