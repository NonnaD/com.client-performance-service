package com.my.interview.challange;

import java.util.Arrays;

public class Numeric {
    public static void main(String[] args) {
        //1. Fibonacci series 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 .....
        Arrays.toString(fibonacciSeries(5));

        //2. Fibonacci Number at certain position
        fibonacci(6);

        //3. Is number prime - prime number can be divided only by itself and 1
        System.out.println(isPrime(11));
        System.out.println(isPrimeRecursion(15, 15));


    }

    //=========FIBONACCI===========//
    /**
     * Is prime better performance
     * If number can be divided by 2, it can be divided by any even number
     **/
    public static boolean isPrimePerformance(int num, int recursive){
        if(recursive <= 2) return true;
        if(num%2 == 0 || num%(recursive - 3)==0) return false;
        return isPrimeRecursion(num, --recursive);
    }

    /**
     * Is prime recursion
     **/
    public static boolean isPrimeRecursion(int num, int recursive){
        if(recursive <= 2) return true;
        if(num%(recursive - 1)==0) return false;
        return isPrimeRecursion(num, --recursive);
    }

    /**
     * Is prime regular
    **/
    public static boolean isPrime(int num){
        int number = num;
        while (--num > 1){
            if (number%num==0) return false;
        }
        return true;
    }


    //=========FIBONACCI===========//

    public static int fibonacci(int position){
        if(position == 1 || position == 2) return 1;
        return fibonacci(position -1) + fibonacci(position -2);
    }

    public static int[] fibonacciSeries(int length){
        if (length < 2) return new int[]{1, 1};
        int[] fa = fibonacciSeries(length -1);
        int f  = fa.length;
        int[] fib = new int[f + 1];
        System.arraycopy(fa, 0,fib, 0, f);
        fib[f] = fa[f-1] + fa[f-2];
        return fib;
    }
}
