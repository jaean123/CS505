import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(0);
        arrayList.add(0, 10);  // Insert 10 at index 0
        arrayList.add(3, 30);  // Insert 30 at index 3

        System.out.println("A list of integers in the array list:");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");

        System.out.println("Display the linked list forward:");
        // Iterator is a universal interface to traverse any Collection.
        // ListIterator is specific to lists and provides bidirectional iteration.
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

        System.out.println("Display linked list backwards:");
        // Notice that the parameter to listIterator is the position not the index.
        // This is why linkedList.size() works. Position starts counting from 1.
        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}
