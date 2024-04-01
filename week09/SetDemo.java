import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");

        // Attempting to add a duplicate element
        hashSet.add("Apple"); // This will not be added

        // Iterating over HashSet elements
        for (String fruit: hashSet) {
            System.out.println(fruit);
        }

        // Checking if the HashSet contains an element
        if (hashSet.contains("Banana")) {
            System.out.println("The set contains Banana");
        } else {
            System.out.println("The set does not contain Banana");
        }

        // Removing an element from the HashSet
        hashSet.remove("Date");

        // The size of the HashSet (number of elements)
        System.out.println("The size of the set is: " + hashSet.size());
    }
}
