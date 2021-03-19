package com.my.interview.fp.fp.streams;

import com.my.interview.fp.basics.patient.example.Patient;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StreamPractice {
    public static void main(String[] args) {
        List<Patient> pats = Arrays.asList(
                new Patient(4, 77, "Delma Kors", "Athem", "active"),
                new Patient(1, 88, "Aaron Will", "Cigna", "inactive"),
                new Patient(3, 109, "Crone Coul", "Aethna", "active"),
                new Patient(2, 99, "Blake Abuela", "Kaiser", "active"),
                new Patient(3, 109, "Crone Oruno", "Aethna", "active"),
                new Patient(4, 19, "Jrone Loul", "Cigna", "active"),
                new Patient(5, 99, "Olake Kbuela", "Kaiser", "active"),
                new Patient(6, 79, "Prone Aruno", "Aethna", "active")

        );


        /*
        Print full name of all patients older 60 years, with insurance Aethna
        */
        pats.stream()
                .filter(pat -> pat.getAge() > 60)
                .filter(patient -> patient.getInsurance().equals("Aethna"))
                .forEach(pat -> System.out.println(pat.getFullName()));

         /*
        Sort by id
        */
        pats.stream()
                .sorted((pat1, pat2) -> Math.max(pat1.getId(), pat2.getId()))
                .forEach(System.out::println);

    }

}
