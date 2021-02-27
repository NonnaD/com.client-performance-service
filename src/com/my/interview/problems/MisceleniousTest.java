package com.my.interview.problems;

import java.util.Arrays;

public class MisceleniousTest {
    public static void main(String[] args) {

        int[] arr3 = {2,3,4,5,3,4,2,4,6,8,-6,-3,45,-4,234,24,36,24,7,8,5};
        int[] arr4 = {2,3,4,5,3,4,2,4,6,8,-6,-3,45,-4,234,24,36,24,7,8,5};
        System.out.println(Arrays.toString(mergeArrays(arr3, arr4)));


    }

    public static int[] mergeArrays(int[] arr, int[] arr2){
        int[] merged = new int[arr.length + arr2.length];
        int m = merged.length;
        int a = arr.length -1;
        int b = arr2.length -1;

        while (m > 0){
            merged[--m] = b < 0 || (a >= 0 && arr[a] > arr2[b]) ?arr[a--]:arr2[b--];
        }

        return merged;
    }


}
