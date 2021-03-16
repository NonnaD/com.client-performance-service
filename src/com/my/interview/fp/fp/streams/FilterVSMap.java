package com.my.interview.fp.fp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterVSMap {
    public static void main(String[] args) {
        String[] numbers = {"1", "2", "4", "6", "8", "3", "9", "2", "8", "1", "4", "4"};

        List<Integer> nums = Arrays.stream(numbers)
                .map(num -> Integer.valueOf(num))
                .filter(num -> num%2==0)
                .collect(Collectors.toList());


        boolean anyMatch = Arrays.stream(numbers).anyMatch(num -> num.equals("4")); //true
        boolean allMatch = Arrays.stream(numbers).allMatch(num -> num.equals("4")); //false
        boolean nonMatch = Arrays.stream(numbers).noneMatch(num -> num.equals("4")); //false


        Optional<String> optional = Arrays.stream(numbers)
                .filter(numbe -> !numbe.equals("1"))
                .findAny();
        System.out.println(optional.get()); //2



    }
}
