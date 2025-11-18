package com.shahin.lld.rokomari;

import java.util.*;

public class BFSShortestPath {

    public static int  romanToInt(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char[] c = s.toCharArray();

        int[] n = new int[c.length];

        int result = 0;

        for (int i = 0; i<n.length; i++){

            int next = (i+1<c.length)?map.get(c[i+1]):0;

            if (map.get(c[i])<next){
                result +=next - map.get(c[i]);
                i++;
            }else{
                result += map.get(c[i]);
            }

        }

        return result;

    }

    public static String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {

//        int[] a = {1, 2,3,0,0,0};
//        int[] b = {2, 5, 6};

       // int[] merged = mergeTwoSortedArrays(a, b);
//        int[] merged = merge(a,6, b,3);
//        for (int num : merged) System.out.print(num + " ");


        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(java.util.Arrays.toString(nums1));


    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // We start filling nums1 from the back (last index)
        int last = m + n - 1;   // index where we place the next largest value
        int i = m - 1;          // pointer for nums1 (actual part)
        int j = n - 1;          // pointer for nums2

        // Compare elements from the end and put the bigger one at 'last'
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[last] = nums1[i];
                i--;
            } else {
                nums1[last] = nums2[j];
                j--;
            }
            last--;
        }

        // If nums2 still has elements, copy them
        while (j >= 0) {
            nums1[last] = nums2[j];
            j--;
            last--;
        }

        // No need to copy nums1's remaining elements (they are already in place)

    }

    private static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i<a.length && j<b.length){
            System.out.println( a[i] !=0);
              if (a[i] <= b[j]) {
                  result[k++]=a[i++];
              }else {
                  result[k++] = b[j++];
              }
        }


        // Copy remaining elements
        while (i < a.length) {
            result[k++] = a[i++];
        }
        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;

    }
}
