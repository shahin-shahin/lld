package com.shahin.lld.dsa.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        MyHashTable<String, Integer> table = new MyHashTable<>();
        table.put("apple", 10);
        table.put("banana", 20);
        table.put("orange1", 30);
        table.put("orange2", 30);
        table.put("orange3", 30);
        table.put("orange4", 30);
        table.put("orange5", 30);
        table.put("orange6", 30);
        table.put("orange7", 30);

        System.out.println("Value for key 'banana': " + table.get("banana"));
//        table.remove("banana");
        System.out.println("Contains 'banana'? " + table.containsKey("banana"));

        table.printTable();

//        Map<String,Integer> map = new HashMap<>();
//
//        map.put("apple", 10);
//        map.put("banana", 20);
//        map.put("apple", 30);
//        System.out.println(map);
    }
}
