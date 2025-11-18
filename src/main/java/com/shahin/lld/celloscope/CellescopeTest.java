package com.shahin.lld.celloscope;

import java.util.Arrays;
import java.util.Scanner;

public class CellescopeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        miniMaxSum(arr);
    }

    public static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }

        int arrayLength = arr.length;
        int minSumValue = sum - arr[arrayLength - 1];
        int maxSumValue = sum - arr[0];

        System.out.println(minSumValue + " " + maxSumValue);
    }
}