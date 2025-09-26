package com.shahin.lld.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> list = new ArrayDeque<>();

       list.add(1);
       list.add(8);

       list.add(4);

        System.out.println("Collections "+ list.remove(5));

        list.forEach(System.out::println);
    }
}