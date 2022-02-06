package com.admCursos.domain;
/**
 * Professor Class
 * @see com.admCursos.domain.Person
 * */
import java.util.ArrayList;
import java.util.List;

public class Professor extends Person{
    //Attributes
    private int hoursLeft;
    private List<Float> salary;
    private List<Course> courses;

    //Constructor
    public Professor(String firstName, String lastName, int docketId, int hoursLeft, Float salary
            , Course course) {
        super(firstName, lastName, docketId);
        this.hoursLeft = hoursLeft;
        this.salary = new ArrayList<>();
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
    public int getHoursLeft() {
        return hoursLeft;
    }

    public void setHoursLeft(int hoursLeft) {
        this.hoursLeft = hoursLeft;
    }

    public List<Float> getSalary() {
        return salary;
    }

    public void setSalary(List<Float> salary) {
        this.salary = salary;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
