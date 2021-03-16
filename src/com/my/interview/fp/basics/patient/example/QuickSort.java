package com.my.interview.fp.basics.patient.example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * This sorting used for @class StandardFunctionalInterface
 * As a comparator it uses @Functional interface Comparator<T> from java.util library
 */
public class QuickSort{
    public static void quickSort(Patient[] arr, int start, int end, Comparator<Patient> comparator){
        if(end - start < 2) return;

        Patient pivotObject = sort(arr, start, end, comparator);
        //here can be implemented custom searching algorithm
        int pivot = Arrays.binarySearch(arr, pivotObject);
        quickSort(arr, start, pivot, comparator);
        quickSort(arr, pivot + 1, end, comparator);
    }

    private static Patient sort(Patient[] arr, int start, int end, Comparator<Patient> comparator){
        Patient pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j){
            //this doesn't work - we need an array for compilation and sorting
            // we can try to use here Map<Patient, int>
            //where int is result of compareTo() function
            while (i < j && comparator.compare(arr[i], arr[j]) > comparator.compare(arr[i], arr[j--]));
            if(i < j) arr[i] = arr[j];

            while (i < j && comparator.compare(arr[i], arr[j]) > comparator.compare(arr[i++], arr[j]));
            if(i < j) arr[j] = arr[i];
        }

        pivot = arr[j];

        return pivot;
    }
}
