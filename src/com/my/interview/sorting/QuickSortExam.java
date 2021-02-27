package com.my.interview.sorting;

import java.util.Arrays;

public class QuickSortExam {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3,4,2,4,6,8,-6,-3,45,-4,234,24,36,24,7,8};
        quickSort(arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr, int start, int end) {
        if(end - start < 1) return;

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot);
        quickSort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end){
       int pivot = arr[start];
       int i = start;
       int j = end;

       while (i < j){
           while (i < j && arr[--j] >= pivot);
           if(i < j) arr[i] = arr[j];

           while (i < j && arr[++i] <= pivot);
           if(i < j) arr[j] = arr[i];
       }
       //this is REALLY IMPORTANT
        arr[j] = pivot;
       return j;
    }
}
