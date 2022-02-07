package com.admCursos.domain;
/**
 * Professor Class
 * @see com.admCursos.domain.Person
 * */
import java.util.ArrayList;
import java.util.List;

public class Professor extends Person{
    //Attributes
    private int maxCapacityHours;
    private List<Float> salary;
    private List<Course> assignedCourses;

    //Constructor
    public Professor(String firstName, String lastName, int docketId, int maxCapacityHours) {
        super(firstName, lastName, docketId);
        this.maxCapacityHours = maxCapacityHours;
        this.salary = new ArrayList<>();
        this.assignedCourses = new ArrayList<>();
    }

    //Methods
    /**
     * Método para añadir cursos al arreglo de cursos asignados, solo si el curso asignado posee
     * un requisito de horas menor al que dispone el profesor.
     * */
    public void addAssignCourse(Course assignedCourse) {
        if (assignedCourse.getRequiredHours() <= this.getAvailableHours()) {
            this.assignedCourses.add(assignedCourse);
        } else {
            System.out.println("El curso '" + assignedCourse.getCourseName() + "' es demasiado largo" +
                    " para las horas disponibles de " + this.getLastName());
        }
    }
    /**
     * Método que retorna el total de horas asignadas al profesor
     * */
    public float getTotalHoursAssigned() {
        float totalHoursAssigned = 0;
        for (Course aC : assignedCourses) {
            totalHoursAssigned = totalHoursAssigned + aC.getRequiredHours();
        }
        return totalHoursAssigned;
    }
    /**
     * Método que retorna el total de horas aun disponibles del profesor
     * */
    public Float getAvailableHours() {
        float hoursAvailable = 0;
        if (this.getTotalHoursAssigned() <= maxCapacityHours) {
               hoursAvailable = maxCapacityHours - this.getTotalHoursAssigned();
        }
        return hoursAvailable;
    }
    /**
     * Método que retorna la información de maxCapacityHours, getTotalHoursAssigned() y
     * getAvailableHours()
     * */
    public String getInfoTimeManagement() {
        return  "Profesor: " + this.getLastName() + ": " +
                "Cantidad máxima de horas para trabajar: " + this.maxCapacityHours + ". " +
                "Horas asignadas a cursos: " + this.getTotalHoursAssigned() + ". " +
                "Horas disponibles para asignar a cursos: " + this.getAvailableHours() + ". ";
    }

    //Getters and setters
    public int getMaxCapacityHours() {
        return maxCapacityHours;
    }

    public void setMaxCapacityHours(int maxCapacityHours) {
        this.maxCapacityHours = maxCapacityHours;
    }

    public List<Float> getSalary() {
        return salary;
    }

    public void setSalary(List<Float> salary) {
        this.salary = salary;
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    public void setAssignedCourses(List<Course> assignedCourse) {
        this.assignedCourses = assignedCourse;
    }
}
