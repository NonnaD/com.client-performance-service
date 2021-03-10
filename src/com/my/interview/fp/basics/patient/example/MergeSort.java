package com.my.interview.fp.basics.patient.example;

/**
 * This merge sort used for AppJava8
 * With functional interface Comparator8
 */
public class MergeSort {
    static void sort(Patient[] arr, int start, int end, Comparator8<Patient> comparator8){

        if(end - start < 2) return;

        int mid = (start + end)/2;
        sort(arr, start, mid, comparator8);
        sort(arr, mid, end, comparator8);
        merge(arr, start, mid, end, comparator8);
    }

    private static void merge(Patient[] arr, int start, int mid, int end, Comparator8<Patient> comparator8){
        Patient[] temp = new Patient[end - start];
        int t = temp.length -1;
        int m = mid - 1;
        int e = end -1;

        while (t >= 0){
            temp[t--] = e < mid || (m >= start && comparator8.compare(arr[m], arr[e]) > 0 )?arr[m--]:arr[e--];
        }

        System.arraycopy(temp, 0, arr, start, temp.length);
    }
}
