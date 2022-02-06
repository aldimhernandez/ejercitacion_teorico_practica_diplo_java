package com.admCursos.domain;
/**
 * Super Class: Person
 * class from which the teacher and student classes will inherit */

public class Person {
    //Attributes
    private String firstName;
    private String lastName;
    private int studentId;

    //Constructor
    public Person(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    //Methods
    //Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
