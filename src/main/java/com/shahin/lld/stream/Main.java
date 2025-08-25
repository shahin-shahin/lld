package com.shahin.lld.stream;

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
                new Employee(6, "Fiona", 32, "Finance", "Boston", 80000.0, "Female"),
                new Employee(7, "George", 29, "IT", "Austin", 65000.0, "Male"),
                new Employee(8, "Hannah", 38, "HR", "Denver", 70000.0, "Female")
        );


//        Map<String, Long> dep = employees.stream()
//                        .collect(Collectors.groupingBy(Employee::getDepartNames , Collectors.counting()));
//
//        System.out.println(dep);

//        Map<String, Double> stringDoubleMap = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//
//        System.out.println(stringDoubleMap);
//
//        Map.Entry<String, Long> deptMaxCount = employees.stream().collect(Collectors.groupingBy(
//                        Employee::getDepartNames, Collectors.counting()))
//                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
//
//        System.out.println(deptMaxCount);
//
//        Map<String, Optional<Employee>> highestSalForEachDedpt = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartNames, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
//
//        System.out.println(highestSalForEachDedpt);


//        List<Employee> emps = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
//
//        System.out.println(emps);

        Employee emp = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst().get();


//        System.out.println(emp);

        List<Employee> employees1  = employees.stream().filter(employee -> employee.getAge()>36).toList();

        System.out.println(employees1);


    }
}
