package com.my.interview.fp.basics.patient.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandartFunctionalInterfaces {
    public static void main(String[] args) {
        List<Patient> pats = Arrays.asList(
                new Patient(4, 77, "Delma Kors", "Athem"),
                new Patient(1, 88, "Aaron Will", "Cigna"),
                new Patient(3, 109, "Crone Coul", "Aethna"),
                new Patient(2, 99, "Blake Abuela", "Kaiser"),
                new Patient(3, 106, "Drone Bruno", "Aethna"),
                new Patient(5, 98, "Krone Bruno", "Aethna"),
                new Patient(6, 79, "Arone Bruno", "Aethna"),
                new Patient(7, 89, "Prone Bruno", "Aethna")
        );

//        //1.Sort by Name
//        sortMyList(pats, (pat1, pat2) -> {
//            return pat1.getFullName().compareTo(pat2.getFullName()); });

//        //2. Sort by Insurance
//        sortMyList(pats, (pat1, pat2)->{return pat1.getInsurance().compareTo(pat2.getInsurance());});

        //3.Create method which prints patients with provided condition
        printIf(pats, pat -> pat.getInsurance().equals("Aethna"), System.out::println);

        //4. Print all users
        //Since I use a consumer interface I have to implement print
        printIf(pats, patient -> true,
                patient -> System.out.println(patient));
    }

    //I will use merge sort here
    private static void sortMyList(List<Patient> pats, Comparator<Patient> comparator) {
        //1. Convert List to array of Patient[] object
        Patient[] patients = pats.toArray(new Patient[0]);

        //2. Call merge sort
        QuickSort.quickSort(patients, 0, patients.length, comparator);
        for (Patient pa : patients) {
            System.out.println(pa);
        }
    }

    /**
     * Instead of custom functional interface I can use:
     * Predicate FI from java.utils.function
     * Represents a predicate (boolean-valued function) of one argument
     * It takes an Object an returns the boolean value
     * To print the value I can use Consumer FI which takes object as a param
     * But does not returns any value
     */
    private static void printIf(List<Patient> pats, Predicate<Patient> predicate, Consumer<Patient> consumer) {
        System.out.println("The following patients satisfy condition");
        for (Patient pat : pats) {
            if (predicate.test(pat)) {
                consumer.accept(pat);
            }
        }
    }
}

