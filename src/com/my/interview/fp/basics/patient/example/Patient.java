package com.my.interview.fp.basics.patient.example;

public class Patient {
    private  int id;
    private  int age;
    private String fullName;
    private String insurance;

    public Patient(int id, int age, String fullName, String insurance) {
        this.id = id;
        this.age = age;
        this.fullName = fullName;
        this.insurance = insurance;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", age=" + age +
                ", fullName='" + fullName + '\'' +
                ", insurance='" + insurance + '\'' +
                '}';
    }
}
