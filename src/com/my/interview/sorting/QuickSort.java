package com.my.interview.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-6,-3,45,-4,234,24,36,24,7,8};
        quickSort(arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    //Divide and conquer
    //Onlog - average case
    //On2 - quadratic worst case
    //In-place
    //Most practical choice
    //Everything is less then pivot goes right
    //Everything is gather then pivot goes left
    public static void quickSort(int[] arr, int start, int end){
        if(end - start < 2) return;
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot);
        quickSort(arr, pivot + 1, end);
    }

    //this is using the first element as a pivot
    private static int partition(int[] arr, int start, int end){
            int pivot = arr[start];
            int i = start;
            int j = end;

            while (i < j){
                while (i < j && arr[--j] < pivot);
                if(i<j) arr[i] = arr[j];

                while (i<j && arr[++i] > pivot);
                if(i<j) arr[j] = arr[i];
            }
            arr[j] = pivot;
            return j;


    }
}
