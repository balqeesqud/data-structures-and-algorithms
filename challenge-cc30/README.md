

This is a custom implementation of a HashMap in Java. This implementation provides basic functionality for storing key-value pairs in a hash table. It includes the following features:

- **Setting a Key/Value Pair**: You can set a key and its corresponding value in the hash map using the `set(K key, V value)` method.

- **Retrieving Values by Key**: You can retrieve the value associated with a key using the `get(K key)` method.

- **Checking for Key Existence**: You can check if a key exists in the hash map using the `has(K key)` method, which returns `true` if the key is found and `false` otherwise.

- **Listing Unique Keys**: The `keys()` method returns a list of all unique keys stored in the hash map.

- **Handling Collisions**: This implementation handles collisions by chaining, which means multiple key-value pairs with the same hash code are stored in a linked list within the same bucket.

- **Hashing Keys to an In-Range Value**: The `hash(K key)` method calculates the hash code of a key and maps it to a value within the range [0, size - 1], where `size` is the initial capacity of the hash map.