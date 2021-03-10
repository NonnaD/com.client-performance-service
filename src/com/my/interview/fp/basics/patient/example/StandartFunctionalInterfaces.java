package com.my.interview.fp.basics.patient.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

        //2. Sort by Insurance
        sortMyList(pats, (pat1, pat2)->{return pat1.getInsurance().compareTo(pat2.getInsurance());});

//        //3.Create method which prints patients with provided condition
//        printIf(pats, pat -> pat.getInsurance().equals("Aethna"));
//
//        //4. Print all users
//        printIf(pats, patient -> true);
    }

    //I will use merge sort here
    private static void sortMyList(List<Patient> pats, Comparator<Patient> comparator){
        //1. Convert List to array of Patient[] object
        Patient[] patients = pats.toArray(new Patient[0]);

        //2. Call merge sort
        QuickSort.quickSort(patients, 0, patients.length, comparator);
        for (Patient pa:patients) {
            System.out.println(pa);
        }
    }

    private static void printIf(List<Patient> pats, Condition8 condition8){
        System.out.println("The following patients satisfy condition");
        for (Patient pat: pats){
            if(condition8.test(pat)){
                System.out.println(pat);
            }
        }
    }
}

