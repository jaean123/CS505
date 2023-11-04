import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        // Create a Collection<String> of states
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        Iterator<Integer> iterator = collection.iterator();

        // Print all the items in collection
        System.out.println("Printing collection using Iterator:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // You can use a for-each loop instead if a collection implements Iterator.
        System.out.println("\n\nPrinting collection using for-each loop:");
        for (Integer n: collection) {
            System.out.print(n + " ");
        }

        ListIterator<Integer> listIterator = collection.listIterator();
        System.out.println("\n\nPrinting collection using ListIterator:");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println("\n\nPrinting collection in reverse using ListIterator:");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}
