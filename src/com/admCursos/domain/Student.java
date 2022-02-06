package com.admCursos.domain;

/**
 * Student Class
 * @see com.admCursos.domain.Person
 * */

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    //Attributes
    private int entryYear;
    private List<Course> courses;

    //Constructor
    public Student(String firstName, String lastName, int studentId, int entryYear, Course course) {
        super(firstName, lastName, studentId);
        this.entryYear = entryYear;
        this.courses = new ArrayList<>();
    }

    //Methods
    /**
     * Método para añadir curso al Array List Courses
     * */
    public void addCourse(Course course) {
        this.courses.add(course);
    }

    //Getters and setters
    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public List<Course> getCourse() {
        return courses;
    }

    public void setCourse(List<Course> course) {
        this.courses = course;
    }
}
