import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(0);
        arrayList.add(0, 10);  // Insert 10 at index 0
        arrayList.add(3, 30);  // Insert 30 at index 3
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(5);
        arrayList2.add(7);
        System.out.println(arrayList.addAll(arrayList2));

        System.out.println("A list of integers in the array list:");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");
    }
}
