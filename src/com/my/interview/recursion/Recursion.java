package com.my.interview.recursion;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {


        int[] arr = {2,1,3,4,-1,1,3,8,4,6};
        int[] arr2 = {1,3,4,6};
        System.out.println(factorial(6));


    }

    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        int k = factorial(num -1);
        return  k * num;
    }
}
