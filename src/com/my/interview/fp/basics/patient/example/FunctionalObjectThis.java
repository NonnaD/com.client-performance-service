package com.my.interview.fp.basics.patient.example;

public class FunctionalObjectThis {
    String fname = "Nonna";
    public void printValue(String lname, Print printer){
        printer.print(lname);
    }
}

@FunctionalInterface
interface Print{
    void print(String value);
}