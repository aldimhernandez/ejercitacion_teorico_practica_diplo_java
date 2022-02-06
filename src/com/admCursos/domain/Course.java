package com.admCursos.domain;

import java.util.ArrayList;
import java.util.List;

public class Course {
    //Attributes
    private String courseName;
    private int requiredHours;
    private List<Student> students;
    private List<Float> qualifications;
    private String modality;

    //Constructor
    public Course(String courseName, int requiredHours, String modality, Student student,
                  Float qualifications) {
        this.courseName = courseName;
        this.requiredHours = requiredHours;
        this.modality = modality;
        this.students = new ArrayList<>();
        this.qualifications = new ArrayList<>();
    }

    //Methods
    /**
     * Método para añadir estudiante al Arrays List Student
     * */
    public void addStudent(Student student) {
        this.students.add(student);
    }

    //Getters and setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getRequiredHours() {
        return requiredHours;
    }

    public void setRequiredHours(int requiredHours) {
        this.requiredHours = requiredHours;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Float> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<Float> qualifications) {
        this.qualifications = qualifications;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }
}
