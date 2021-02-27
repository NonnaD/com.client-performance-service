package com.my.interview.string;

/**
 * Trying to create my own String implementation...
 * I knooow...it's just for better understanding of String class
 */
public class NonnasString {
    //final because String is immutable
    private final char[] value;

    public NonnasString(NonnasString obj) {
        value = new char[0];
    }
}
