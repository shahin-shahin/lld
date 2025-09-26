package com.shahin.lld.rokomari;

import java.util.List;

public class Java9Example {
    public static void main(String[] args) {
        // Simple sentence printing
        System.out.println("Hello! Welcome to Java 9.");

        // Feature of Java 9: Creating an immutable list using List.of()
        var fruits = List.of("Apple", "Banana", "Orange");
        System.out.println("Fruits: " + fruits);
    }

//    public static void main(String[] args) {
//        // Simple sentence printing
//        System.out.println("Hello! Welcome to Java 11.");
//
//        // Feature of Java 11: String.isBlank()
//        String text = "   ";
//        if (text.isBlank()) {
//            System.out.println("The string is blank!");
//        } else {
//            System.out.println("The string is not blank.");
//        }
//    }


//    public static void main(String[] args) {
//        // Simple sentence printing
//        System.out.println("Hello! Welcome to Java 17.");
//
//        // Feature of Java 17: Enhanced switch expression
//        String day = "MONDAY";
//        String typeOfDay = switch (day) {
//            case "SATURDAY", "SUNDAY" -> "Weekend";
//            default -> "Weekday";
//        };
//
//        System.out.println(day + " is a " + typeOfDay);
//    }

    // Define a record (Java 16+ feature)
//    record Person(String name, int age) {}
//
//    public class Java21Example {
//        public static void main(String[] args) {
//            // Simple sentence printing
//            System.out.println("Hello! Welcome to Java 21.");
//
//            // Feature of Java 21: Record pattern matching
//            Object obj = new Person("Alice", 25);
//
//            if (obj instanceof Person(String name, int age)) {
//                System.out.println("Name: " + name + ", Age: " + age);
//            }
//        }
//    }


//    24

//    public static void main(String[] args) {
//        int x = 65;
//
//        // Using primitive type in instanceof pattern
//        if (x instanceof char c) {
//            System.out.println("Character: " + c); // Output: Character: A
//        }
//    }
}
