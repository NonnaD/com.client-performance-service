package com.my.interview.fp.basics.patient.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Nonna Dzhabieva
 * Hi if you read this...you already know the answer ;-)
 * @question src/theQuestion
 */
public class AppJava8 {
    public static void main(String[] args) {
        List<Patient> pats = Arrays.asList(
                new Patient(4, 77, "Delma Kors", "Athem"),
                new Patient(1, 88, "Aaron Will", "Cigna"),
                new Patient(3, 109, "Crone Coul", "Aethna"),
                new Patient(2, 99, "Blake Abuela", "Kaiser"),
                new Patient(3, 109, "Crone Bruno", "Aethna")

        );

        //1.Sort by Name
      //  mySort(pats, (pat1, pat2) -> {pat1.getFullName().compareTo(pat2.getFullName());});

        //3.Create method which prints patients with provided condition
        printIf(pats, pat -> pat.getInsurance().equals("Aethna"));

    }

    //I will use insertion sort here, I know it's not the best choice, but I'm tooo lazy
    private static void mySort(List<Patient> pats, Comparator8 comparator8){
        //TODO

    }
    private static void printIf(List<Patient> pats, Condition condition){
        for (Patient pat: pats){
            if(condition.test(pat)){
                System.out.println(pat);
            }
        }
    }
}

interface Condition8{
    //by default interface method declarations are "public" and "abstract"
    //no need to explicitly add keywords
    public abstract boolean test(Patient pat);
}

interface Comparator8<Patient> {
    int compare(Patient o1, Patient o2);
}