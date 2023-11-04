/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge.cc30;

import challenge.cc30.hashmap.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private HashMap<String, Integer> hashMap;

    @BeforeEach
    public void setUp() {
        hashMap = new HashMap<>(10); // Create a hash map with 10 buckets
    }

    @Test
    public void testSetAndGet() {
        hashMap.set("key1", 42);
        assertEquals(42, hashMap.get("key1"));
    }

    @Test
    public void testSetCollision() {
        // Two keys with the same hash code
        hashMap.set("abc", 10);
        hashMap.set("cba", 20);

        assertEquals(10, hashMap.get("abc"));
        assertEquals(20, hashMap.get("cba"));
    }

    @Test
    public void testGetNonExistentKey() {
        assertNull(hashMap.get("nonexistent"));
    }

    @Test
    public void testContainsKey() {
        hashMap.set("key1", 42);
        assertTrue(hashMap.has("key1"));
        assertFalse(hashMap.has("nonexistent"));
    }

    @Test
    public void testKeys() {
        hashMap.set("key1", 42);
        hashMap.set("key2", 24);
        hashMap.set("key3", 36);

        // Verify that the keys() method returns a list of unique keys
        assertEquals(List.of("key3", "key1", "key2"), hashMap.keys());
    }

    @Test
    public void testHashInRange() {
        // Ensure that hash(key) returns a value within the range [0, size - 1]
        String key = "abc";
        int hash = hashMap.hash(key);
        assertTrue(hash >= 0 && hash < hashMap.getSize());
    }
}
