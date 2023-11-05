package challenge.cc31.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HashMap<K, V> {

    ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;
    int size;

    public HashMap(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("HashMap size must be 1 or greater!");
        }
        this.size = size;
        this.bucketArrayList = new ArrayList<>(size);

        for (int i = 0; i < this.size; i++) {
            bucketArrayList.add(i, new LinkedList<>());
        }

    }


    public void set(K key, V value){
        int hashCode = hash(key);
        LinkedList<HashMapPair<K, V>> bucket = bucketArrayList.get(hashCode);

        for (HashMapPair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value); // Update the value if the key already exists
                return;
            }
        }

        // Key doesn't exist in the bucket, so I will add a new pair
        HashMapPair<K, V> newPair = new HashMapPair<>(key, value);
        bucket.add(newPair);
    }

    public V get(K key){
        int hashCode = hash(key);
        LinkedList<HashMapPair<K, V>> bucket = bucketArrayList.get(hashCode);

        for (HashMapPair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null; // Key not found in the HashMap
    }

    public boolean has(K key)
    {
        int hashCode = hash(key);
        LinkedList<HashMapPair<K, V>> bucket = bucketArrayList.get(hashCode);

        for (HashMapPair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                return true; // Key found in the HashMap
            }
        }

        return false;
    }

    public List<K> keys(){
        List<K> keyList = new ArrayList<>();

        for (LinkedList<HashMapPair<K, V>> bucket : bucketArrayList) {
            for (HashMapPair<K, V> pair : bucket) {
                // Check if the key is not already in the list to ensure uniqueness
                if (!keyList.contains(pair.getKey())) {
                    keyList.add(pair.getKey());
                }
            }
        }

        return keyList;
    }

    public int hash (K key){
        return Math.abs(key.hashCode()) % size;
    }

    public int getSize() {
        return size;
    }


    ///// CC 31

    public String repeatedWord(String text) {
        String[] words = text.split("\\s+");   // Split the input string into words


        // Create a HashSet to store the splitted words
        HashSet<String> encounteredWords = new HashSet<>();

        for (String word : words) {
            // Remove the punctuation marks from the word and convert it to lowercase
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                // Check if the word is already in the HashSet
                if (encounteredWords.contains(word)) {
                    return word;
                } else {
                    // Add the word to the HashSet
                    encounteredWords.add(word);
                }
            }
        }

        // If no repeated word is found
        return "No repeated Word has found";
    }
}