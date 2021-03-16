package com.my.interview.fp.basics.patient.example;

public class Patient {
    private  int id;
    private  int age;
    private String fullName;
    private String insurance;
    private String status;

    public Patient(int id, int age, String fullName, String insurance, String status) {
        this(id, age, fullName, insurance);
        this.status = status;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (id != patient.id) return false;
        if (age != patient.age) return false;
        if (fullName != null ? !fullName.equals(patient.fullName) : patient.fullName != null) return false;
        if (insurance != null ? !insurance.equals(patient.insurance) : patient.insurance != null) return false;
        return status != null ? status.equals(patient.status) : patient.status == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + age;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (insurance != null ? insurance.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
