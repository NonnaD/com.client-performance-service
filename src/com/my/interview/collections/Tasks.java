package com.my.interview.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {

    }

    /**
     * This method converts any type of array to List
     */
    public static List<?> arrayToList(Object[] arr){
        return Arrays.asList(arr);
    }

    /**
     * Reverses the list - mutate provided list
     */
    public static void reverseList(List<?> arr){
        Collections.reverse(arr);

    }




}
