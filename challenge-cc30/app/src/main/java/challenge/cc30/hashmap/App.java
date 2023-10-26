/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge.cc30.hashmap;

import java.util.List;

public class App {


    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>(10);

        // Set key-value pairs
        myHashMap.set("key1", 42);
        myHashMap.set("key2", 24);
        myHashMap.set("key3", 36);

        // Retrieve values by keys
        int value1 = myHashMap.get("key1");
        int value2 = myHashMap.get("key2");

        // Check for key existence
        boolean keyExists = myHashMap.has("key1");
        boolean nonExistentKeyExists = myHashMap.has("nonexistent");

        // List unique keys
        List<String> allKeys = myHashMap.keys();

        // Display the results
        System.out.println("Value for key1: " + value1);
        System.out.println("Value for key2: " + value2);
        System.out.println("Key 'key1' exists: " + keyExists);
        System.out.println("Key 'nonexistent' exists: " + nonExistentKeyExists);
        System.out.println("All unique keys: " + allKeys);
    };

}
