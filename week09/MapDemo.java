import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);
        hashMap.put("Diana", 40);

        // Retrieving a value associated with a key
        Integer ageOfBob = hashMap.get("Bob");
        System.out.println("Bob's Age: " + ageOfBob);

        // Iterating through each entry in the map
        for (String key : hashMap.keySet()) {
            System.out.println(key + " => " + hashMap.get(key));
        }

        // Checking if a key exists in the map
        if (hashMap.containsKey("Alice")) {
            System.out.println("The map contains key 'Alice'");
        }

        // Checking if a value exists in the map
        if (hashMap.containsValue(30)) {
            System.out.println("The map contains value 30");
        }

        // Removing a key-value pair from the map
        hashMap.remove("Diana");

        // The size of the map (number of key-value pairs)
        System.out.println("The size of the map is: " + hashMap.size());
    }
}
