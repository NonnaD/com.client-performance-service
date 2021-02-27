package com.my.interview.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {7,2,0,-4,-9,4,3,5,1,-5,8};

        mergeSort(arr, 0, arr.length);
       System.out.println(Arrays.toString(arr) + " is Sorted");
    }

    /** Divide and conquer algorithm
     - Ologn (logarithmic) time complexity
     - Not inplace algorithm
     -  Logically divide an array
     Disadvantage:
     - require to crate bunch of temporary arrays..memory consuming */
    public static void mergeSort(int[] arr, int start, int end){
        if (end - start < 2){
            return;
        }
        int mid = (start + end)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end){
       if(arr[mid - 1] < arr[mid]){
           return;
       }
       int[] temp = new int[end - start];
       int t = temp.length - 1;
       int m = mid - 1;
       int s = start;
       int e = end - 1;
       while (t >= 0){
           temp[t--] = e < mid || (m >= s && arr[m] >= arr[e])?arr[m--]:arr[e--];
       }
       System.arraycopy(temp, 0, arr, start, temp.length);
    }
}
