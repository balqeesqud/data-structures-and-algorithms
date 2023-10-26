package challenge.cc30.hashmap;

import java.util.ArrayList;
import java.util.LinkedHashSet;
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
}