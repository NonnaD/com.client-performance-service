package com.my.interview.fp.basics.patient.example;

public class FunctionalThis {
    String lname = "LastName";

    public void doSomething(String value, Print pr){
        pr.print(value);
    }

    public void instanseMethod(){
        doSomething("Alex", n -> {
            System.out.println(n + this.lname);
        });
    }


    public static void main(String[] args) {
        String lname = "Dzh";
        FunctionalObjectThis fthis = new FunctionalObjectThis();
        fthis.printValue(lname, new Print() {
            String fname = "Alan";
            @Override
            public void print(String value) {
                System.out.println(this.fname);
            }
        });

        //fthis.printValue(lname,n -> System.out.println(this.fname));


    }

}
