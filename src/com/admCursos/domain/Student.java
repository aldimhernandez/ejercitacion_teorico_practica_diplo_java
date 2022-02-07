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
    public Student(String firstName, String lastName, int studentId, int entryYear) {
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

    /**
     * Método que recibe la modalidad de los cursos como parámetro y devuelve el promedio de las
     * horas cursadas segun la modalidad.
     * */
    public Float getHoursCoursesAverage(String modality) {
        float totalHours = 0;
        int coursesQuantity = 0;
        for (Course c : courses) {
            if (c.getModality().equals(modality)) {
                totalHours = totalHours + c.getRequiredHours();
                coursesQuantity++;
            }
        }
        return totalHours / coursesQuantity;
    }

    //Getters and setters
    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> course) {
        this.courses = course;
    }
}
