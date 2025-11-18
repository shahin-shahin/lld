package com.shahin.lld.dsa.sortalgorithm;

import java.util.Arrays;

public class MergeTwoSortedArray {

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

    public static void main(String[] args){
        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(java.util.Arrays.toString(nums1));

        // Example 2
        int[] nums1b = {1};
        int[] nums2b = {};
        merge(nums1b, 1, nums2b, 0);
        System.out.println(Arrays.toString(nums1b));
        // Output: [1]

        // Example 3
        int[] nums1c = {0};
        int[] nums2c = {1};
        merge(nums1c, 0, nums2c, 1);
        System.out.println(Arrays.toString(nums1c));

    }
}
