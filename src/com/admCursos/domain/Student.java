package com.admCursos.domain;

/**
 * Student Class
 * @see com.admCursos.domain.Person
 * */

import java.util.List;

public class Student extends Person {
    //Attributes
    private int entryYear;
    private List<Course> course;

    //Constructor
    public Student(String firstName, String lastName, int studentId, int entryYear) {
        super(firstName, lastName, studentId);
        this.entryYear = entryYear;
    }

    //Methods
    public void addCourse(Course course) {

    }

    //Getters and setters
    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }
}
