package com.shahin.lld.stream;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] arg){

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 28, "IT", "New York", 60000.0, "Female"),
                new Employee(2, "Bob", 35, "Finance", "Chicago", 75000.0, "Male"),
                new Employee(3, "Charlie", 30, "HR", "San Francisco", 50000.0, "Male"),
                new Employee(4, "Diana", 40, "IT", "Los Angeles", 90000.0, "Female"),
                new Employee(5, "Ethan", 25, "Marketing", "Seattle", 45000.0, "Male"),
                new Employee(6, "Fiona", 30, "Finance", "Boston", 80000.0, "Female"),
                new Employee(7, "George", 29, "IT", "Austin", 65000.0, "Male"),
                new Employee(8, "Hannah", 31, "HR", "Boston", 70000.0, "Female")
        );


        employees.sort((a, b)->Integer.compare(a.getAge(),b.getAge()));

        employees.forEach(System.out::println);



    }


}
