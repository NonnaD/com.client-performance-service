package com.my.interview.fp.methodreference;

import com.my.interview.fp.basics.patient.example.Patient;

import java.util.Arrays;
import java.util.List;

public class CollectionItration {


    public static void main(String[] args) {

        List<Patient> pats = Arrays.asList(
                new Patient(4, 77, "Delma Kors", "Athem", "active"),
                new Patient(1, 88, "Aaron Will", "Cigna", "active"),
                new Patient(3, 109, "Crone Coul", "Aethna", "active"),
                new Patient(2, 99, "Blake Abuela", "Kaiser", "active"),
                new Patient(3, 109, "Crone Bruno", "Aethna", "active")

        );

        //takes Consumer finterface as an argument
        //Refered as internal iterator we use inbuilt default method of Iterable interface
        pats.forEach(pat -> System.out.println(pat.getFullName()));
        //Method reference
        pats.forEach(System.out::println);


    }
}
