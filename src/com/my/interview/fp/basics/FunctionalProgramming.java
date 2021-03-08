package com.my.interview.fp.basics;

import java.util.Arrays;

public class FunctionalProgramming {
    public static void main(String[] args) {


      Calc add = (a , b) -> a+b;
      addPrint(add.action(5,6));
    }

    interface Calc{
        int action(int a, int b);
    }

    public static void addPrint(int result){
        System.out.println(result);
    }


}

