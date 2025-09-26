package com.shahin.lld.rokomari;

//Write the code to check whether the input 2 numbers are co prime or no

import java.util.Scanner;

public class CoPrimeCheck {

    // Function to compute GCD using Euclidean Algorithm
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Check if co-prime
        if (gcd(num1, num2) == 1) {
            System.out.println(num1 + " and " + num2 + " are Co-Prime.");
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT Co-Prime.");
        }

        sc.close();
    }
}

