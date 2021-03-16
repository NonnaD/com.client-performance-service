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
public class AppJava7 {
    public static void main(String[] args) {

        String a = "A";
        String b  = "B";
        String c = "C";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));
        List<Patient> pats = Arrays.asList(
                new Patient(4, 77, "Delma Kors", "Athem", "active"),
                new Patient(1, 88, "Aaron Will", "Cigna", "active"),
                new Patient(3, 109, "Crone Coul", "Aethna", "active"),
                new Patient(2, 99, "Blake Abuela", "Kaiser", "active"),
                new Patient(3, 109, "Crone Bruno", "Aethna", "active")

        );

        //1.Sort by Name
        Collections.sort(pats, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });

        //2.Create a method that prints all elements in the list
        printAll(pats);

        //3.Create method which prints all patients with First Name start with C
        printWithC(pats);

        //3.Create method which prints patients with provided condition
        printIf(pats, new Condition() {
            @Override
            public boolean test(Patient p) {
                return p.getInsurance().equals("Athena");
            }
        });

    }

    //2. A method that prints all elements in the list
    private static void printAll(List<?> pats){
        for (Object pat: pats){
            System.out.println(pat);
        }
    }

    //3.A method which prints all patients with First Name start with C
    private static void printWithC(List<Patient> pats){
        for (Patient pat: pats){
            if(pat.getFullName().startsWith("C")){
                System.out.println(pat);
            }
        }
    }

    //4. Create a method which prints patient with certain condition
    //For example: If it insurance equals "Aethna"..
    // ...or any other condition we can provide later
    private static void printIf(List<Patient> pats, Condition condition){
        for (Patient pat: pats){
            if(condition.test(pat)){
                System.out.println(pat);
            }
        }
    }

}

interface Condition{
    boolean test(Patient pat);
}
