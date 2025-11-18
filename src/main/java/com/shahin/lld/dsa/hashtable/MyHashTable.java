package com.shahin.lld.dsa.hashtable;

import java.util.LinkedList;

public class MyHashTable<K, V> {
    // Array of linked lists (buckets)
    private LinkedList<HashNode<K, V>>[] buckets;
    private int capacity; // number of buckets
    private int size;     // number of key-value pairs

    // Constructor
    public MyHashTable() {
        capacity = 10; // default bucket size
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % capacity;
    }

    // Put key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<HashNode<K, V>> bucket = buckets[index];

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value; // update existing value
                return;
            }
        }

        // Add new node
        bucket.add(new HashNode<>(key, value));
        size++;

        // Resize if load factor > 0.7
        if ((1.0 * size) / capacity > 0.7) {
            resize();
        }
    }

    // Resize the hashtable when load factor is high
    private void resize() {
        LinkedList<HashNode<K, V>>[] oldBuckets = buckets;
        capacity = capacity * 2;
        buckets = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }

        size = 0;

        for (LinkedList<HashNode<K, V>> bucket : oldBuckets) {
            for (HashNode<K, V> node : bucket) {
                put(node.key, node.value);
            }
        }
    }

    // Get value for a key
    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<HashNode<K, V>> bucket = buckets[index];

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null; // key not found
    }

    // Remove key
    public V remove(K key) {
        int index = getBucketIndex(key);
        LinkedList<HashNode<K, V>> bucket = buckets[index];

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node);
                size--;
                return node.value;
            }
        }

        return null;
    }

    // Check if key exists
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // Get number of key-value pairs
    public int size() {
        return size;
    }

    // Check if table is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Print all key-value pairs (for testing)
    public void printTable() {
//        for (int i = 0; i < capacity; i++) {
//            System.out.print("Bucket " + i + ": ");
//            for (HashNode<K, V> node : buckets[i]) {
//                System.out.print("[" + node.key + "=" + node.value + "] ");
//            }
//            System.out.println();
//        }

        for (LinkedList<HashNode<K, V>> bucket : buckets) {
            for (HashNode<K, V> node : bucket) {
                System.out.println("[" + node.key + "=" + node.value + "] ");
            }
            
        }
    }


}
