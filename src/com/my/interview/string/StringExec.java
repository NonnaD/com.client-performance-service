package com.my.interview.string;

public class StringExec {

    public static void main(String[] args) {

        String  nonna = "Nonna";
        NonnasString non = new NonnasString(new char[]{'n', 'o', 'n', 'n', 'a'});
        NonnasString non1 = new NonnasString(new char[]{'N', 'o', 'n', 'n', 'a'});
        NonnasString non2 = new NonnasString(new char[]{'n', 'o', 'f', 'n', 'a'});
        System.out.println("non.isEmpty() " + non.isEmpty());
        System.out.println("non.length() " + non.length());
        System.out.println("non.equals(non1) " + non.equals(non1));
        System.out.println("non.equals(non2) " + non.equals(non2));
        System.out.println("non.equalsIgnoreCase(non2) " + non.equalsIgnoreCase(non1));
        System.out.println(non);

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

}



