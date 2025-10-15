package com.shahin.lld.dsa;

public class SelectionSortDesc {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i=0; i<n-1; i++){
            int maxIndex = i;

            for (int j=i+1; j<n; j++){
                if (arr[j]>arr[i]){
                    maxIndex=j;
                }
            }

            int temp = arr[maxIndex];
            arr[maxIndex]=arr[i];
            arr[i]=temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(numbers);

        selectionSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }
}
