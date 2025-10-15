package com.shahin.lld.dsa;

public class InsertionSortAsc {

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i=1; i<n; i++){
            int key = arr[i];

            int j = i-1;

            // Move elements of arr[0..i-1], that are greater than key,
            // one position ahead to make space for the key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

//            descending order

//            while (j >= 0 && arr[j] < key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }


            // Insert the key at the correct position
            arr[j + 1] = key;

        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
