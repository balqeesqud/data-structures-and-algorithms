package challenge.cc31.hashmap;

import java.util.AbstractMap;

public class HashMapPair<K,V> extends AbstractMap.SimpleEntry<K,V>

{
    public HashMapPair (K key, V value)
    {
        super(key,value);
    }



}