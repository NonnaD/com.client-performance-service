package com.my.interview.string;

import java.util.Arrays;

/**
 * Trying to create my own String implementation...
 * I knooow...it's just for better understanding of String class
 * If you see some grammatical errors...Just know - IDC
 */
public class NonnasString {
    //final because String is immutable
    private final char[] value;
    private int length;

    public NonnasString(NonnasString obj) {
        value = obj.value;
        length = obj.value.length;
    }

    public NonnasString(char[] arr){
        value = arr;
        length = value.length;
    }

    public NonnasString() {
        value = null;
    }

    /**
     * @return int length of the NonnaString object
     */
    public int length() {
        return length;
    }

    public boolean isEmpty(){
        return this.length < 1;
    }

    /**
     * Compares given NonnaString object with current object
     * Returns true if all chars are equals
     */
    public boolean equals(NonnasString nstring){
        assert this.value != null;
        if (nstring.length() != this.value.length) return false;
        for(int i = value.length - 1; i > 0; i--){
            assert nstring.value != null;
            if (nstring.value[i]!= value[i]) return false;
        }
        return true;
    }

    /**
     * Compares given NonnaString object with current object
     * Returns true if all chars are equals
     */
    public static boolean equals(NonnasString nstring, NonnasString nstring2){
        if (nstring.length() != nstring2.length) return false;
        for(int i = nstring.length - 1; i > 0; i--){
            if (nstring.value[i]!= nstring2.value[i]) return false;
        }
        return true;
    }

    /**
     * Compares given NonnaString object with current object
     * Returns true if all chars are equals - ignores case
     */
    public boolean equalsIgnoreCase(NonnasString nstring){
        NonnasString thisObject;
        if (nstring.length() != value.length) return false;
        char[] thisValue = new char[this.length];
        for(int i = 0; i < this.length; i++){
            //I know using Character methods is not a good idea
            //but i'ts Friday evening and I just want to finish and watch my Netflix show
            thisValue[i] = Character.toLowerCase(value[i]);
            nstring.value[i] = Character.toLowerCase(nstring.value[i]);
        }
        thisObject = new NonnasString(thisValue);
        return equals(thisObject, nstring);
    }

    /**
     * Finds and returns index of first occurrence of first element
     * for provided NonnasString object
     * @param nstring
     */
    public int indexOf(NonnasString nstring){
        if(nstring == null || nstring.length < 1) return -1;
        for (int i = 0; i < this.length; i++){
            if(value[i] == nstring.value[0]){
                return i;
            };
        }
        return -1;
    }

    /**
     * Finds and returns index of last occurrence of first element
     * for provided NonnasString object
     * @param nstring
     */
    public int lastIndexOf(NonnasString nstring){
        if(nstring == null || nstring.length < 1) return -1;
        for (int i = this.length-1; i > 0; i--){
            if(value[i] == nstring.value[0]){
                return i;
            };
        }
        return -1;
    }

    /**
     * Check if this object contains provided object
     * For now we just check the first occurrence
     * But what if sequence present at second occurrence
     * TODO: Fix: the corner case
     * @param nstring
     */
    public boolean contains(NonnasString nstring){
        int firstChar = this.indexOf(nstring);
        for(int i = firstChar; i < nstring.length; i++){
            assert this.value != null;
            if(this.value[i] != nstring.value[i]) return false;
        }
        return true;
    }

    /**
     * This function will print all char's from value array
     * So it will look like string but both of us know it's not
     */
    public void print(){
        assert value != null;
        for(char c: value){
            System.out.print(c);
        }
    }

    @Override
    public String toString() {
        return  Arrays.toString(value);
    }
}
