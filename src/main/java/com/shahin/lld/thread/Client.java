package com.shahin.lld.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    public static int get(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // not found
    }


    public static void main(String[] args){

    int[] a = {2,6,7,87};

    int b = get(a, 87);

    if (b==-1){
        System.out.println("not found");
    }else {
        System.out.println("found "+ a[b]);
    }

        List<Integer> list = new ArrayList<>();


    }

}
