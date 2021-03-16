package com.my.interview.fp.basics.patient.example;

import java.util.SortedSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExceptionsJava8 {
    public static void main(String[] args) {
        //create a method which takes int[] arr and int key and performs some operation - return void
        int[] arr = {1,2};
        int key = 8;

        //Add key to each value and print new value
        process(arr, key, (a, k) -> System.out.println(a + k));

        //Compare key to each value and print  true if they are equal
        process(arr, key, (a, k) -> System.out.println(a.equals(k)));

        //Add exception handler - Compare key to each value and print  true if they are equal
        process(arr, key, (a, k) -> {
            try{
                System.out.println(a.equals(k));
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        });

        //Exception handler with wrapper
        process(arr, key, exceptionWrappwer((a, k) -> System.out.println(a + k)));




    }

    public static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer){
        for(int i : arr){
            consumer.accept(i, key);
        }
    }

    //we can wrap our lambda expression into wrapper to add some additional functionality
    public static BiConsumer<Integer, Integer>  exceptionWrappwer(BiConsumer<Integer, Integer> consumer){
        return (k, v) -> {
            try{
                consumer.accept(v,k);
            }catch (Exception exp){
                System.out.println("Exception:  " + exp);
            }
        };
    }
}
