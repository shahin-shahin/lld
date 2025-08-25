package com.shahin.lld.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

      Set<Integer> set = new TreeSet<>((Integer val1, Integer val2)->val2-val1);

      set.add(4);
      set.add(29);
      set.add(5);

      Iterator<Integer> integerIterator = set.iterator();



      set.forEach((System.out::println));
    }
}