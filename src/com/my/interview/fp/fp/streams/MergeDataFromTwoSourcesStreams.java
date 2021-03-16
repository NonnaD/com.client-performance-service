package com.my.interview.fp.fp.streams;

import com.my.interview.fp.basics.patient.example.Patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MergeDataFromTwoSourcesStreams {
    public static void main(String[] args) {

        /**
         * Add data from 2 DB to our merged List<Patient>
         * Nola clinics and Alan clinics can share same patients
         * merged can contain duplicates
         */
        List<Patient> merged = new ArrayList<>();
        merged.addAll(getDataFromAlansClinicsDB());
        merged.addAll(getDataFromNolaClinicDB());

        //1. Select all patients older > 50
        System.out.println(filterByAge(merged, pat -> pat.getAge() > 50));


        //1. Select all DISTINCT patients from merged list older > 50, skip first 3 results, limit to 5 objects
       // System.out.println(slice(merged));
    }

    public static List<Patient> slice(List<Patient> patients, Predicate<Patient> predicate){
        return patients.stream()
                //select all > 50 years
                .filter(predicate)
                //only unique objects
                .distinct()
                //skip first 3 results
                .skip(3)
                //limit results to 5
                .limit(5).collect(Collectors.toList());

    }

    public static List<Patient> filterByAge(List<Patient> patients, Predicate<Patient> predicate) {
        //instead of hardcoding age to 50 here, I use instance of Predicate functional interface to make this function reusable
        return patients.stream().filter(predicate).collect(Collectors.toList());
    }


    public static List<Patient> getDataFromNolaClinicDB() {
        return Arrays.asList(
                new Patient(4, 77, "Delma Kors", "Athem", "active"),
                new Patient(1, 88, "Aaron Will", "Cigna", "active"),
                new Patient(3, 109, "Crone Coul", "Aethna", "active"),
                new Patient(2, 99, "Blake Abuela", "Kaiser", "inactive"),
                new Patient(3, 109, "Crone Oruno", "Aethna", "active"),
                new Patient(5, 67, "Krage Willson", "Athem", "active"),
                new Patient(9, 38, "Igor Petrov", "Cigna", "inactive"),
                new Patient(8, 54, "Alex Rodriges", "Aethna", "active"),
                new Patient(3, 89, "Mario Caassa", "Kaiser", "active"),
                new Patient(3, 19, "Drake Markus", "Aethna", "active"),
                new Patient(2, 29, "Malermo Vitache", "Cigna", "inactive"),
                new Patient(4, 19, "Jrone Loul", "Cigna", "active"),
                new Patient(5, 99, "Olake Kbuela", "Kaiser", "active"),
                new Patient(6, 79, "Prone Aruno", "Aethna", "active")
        );
    }

    public static List<Patient> getDataFromAlansClinicsDB() {
        return Arrays.asList(
                new Patient(5, 67, "Krage Willson", "Athem", "active"),
                new Patient(9, 38, "Igor Petrov", "Cigna", "active"),
                new Patient(8, 54, "Alex Rodriges", "Aethna", "inactive"),
                new Patient(3, 89, "Mario Caassa", "Kaiser", "active"),
                new Patient(3, 19, "Drake Markus", "Aethna", "active"),
                new Patient(2, 29, "Malermo Vitache", "Cigna", "inactive"),
                new Patient(4, 23, "Gravia Leman", "Kaiser", "active"),
                new Patient(5, 54, "Andre Purtio", "Aethna", "inactive"),
                new Patient(3, 109, "Crone Coul", "Aethna", "active"),
                new Patient(2, 99, "Blake Abuela", "Kaiser", "active"),
                new Patient(3, 109, "Crone Oruno", "Aethna", "active")
        );
    }
}
