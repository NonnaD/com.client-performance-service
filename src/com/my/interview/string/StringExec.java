package com.my.interview.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringExec {

    public static void main(String[] args) {

        String  nonna = "Nonna";
        NonnasString non = new NonnasString(new char[]{'n', 'o', 'n', 'n', 'a'});
        NonnasString non1 = new NonnasString(new char[]{'N', 'o', 'n', 'n', 'a'});
        NonnasString non2 = new NonnasString(new char[]{'n', 'o', 'f', 'n', 'a'});
        NonnasString non3 = new NonnasString(new char[]{'n', 'a'});

//        System.out.println("non.isEmpty() " + non.isEmpty());
//        System.out.println("non.length() " + non.length());
//        System.out.println("non.equals(non1) " + non.equals(non1));
//        System.out.println("non.equals(non2) " + non.equals(non2));
//        System.out.println("non.equalsIgnoreCase(non1) " + non.equalsIgnoreCase(non1));
//        System.out.println("non.indexOf(non2) " + non.indexOf(non3));
//        System.out.println("non.lastIndexOf(non3) " + non.lastIndexOf(non3));
//        System.out.println("non.contains(non3) " + non.contains(non3));
//        System.out.println("non.startsWith(non3) " + non.startsWith(non3));
//        System.out.println("non.endsWith(non3) " + non.endsWith(non3));

        String no = "Aloha! My, name is - Nonna1";
        System.out.println(removeSpecialChars(no));
        System.out.println(Arrays.toString(splitBySpecialChars(no)));
        System.out.println(String.valueOf(3));
        List l = new ArrayList();


    }

    public static void concat(){
        //String concatenation sequence
        System.out.println("I am " + 20 + 3 + "years old");
        //I am 203years old
        System.out.println(20 + 3 + " years old I am");
        //23years old I am
        System.out.println("You know how old am I ? " + 20 + 3 );
        //You know how old am I ? 203
    }

    public static String removeSpecialChars(String s){
        return s.replaceAll("[^a-zA-Z0-9 ]", "");
    }

    public static String[] splitBySpecialChars(String s){
        return s.split("[^a-zA-Z0-9 ]");
    }

}



