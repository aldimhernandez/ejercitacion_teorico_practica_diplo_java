package com.admCursos;

import com.admCursos.domain.Course;
import com.admCursos.domain.Person;
import com.admCursos.domain.Professor;
import com.admCursos.domain.Student;

/**
 * General description:
 * El Instituto de Formación Profesional(IFP) tiene como objetivo desarrollar un sistema para
 * administrar los cursos que se dictan cada año. La aplicación permitirá registrar los cursos
 * que se ofrecen, junto a los alumnos inscriptos en los mismos y los profesores que los dictan.
 * Los invito a ser parte del desarrollo.
 * @author marialdanahernandez
 * @see com.admCursos.domain
 * */

public class Main {

    public static void main(String[] args) {

        Course ai1Course = new Course("AI. Nivel Principiante.", 20, "Virtual");
        Course ai2Course = new Course("AI. Nivel Intermedio.", 30, "Virtual");
        Course ai3Course = new Course("AI. Nivel Avanzado.", 40, "Virtual");

        Course robotica1Course = new Course("Robótica. Nivel Principiante.", 20, "Virtual");
        Course robotica2Course = new Course("Robótica. Nivel Intermedio.", 30, "Presencial");
        Course robotica3Course = new Course("Robótica. Nivel Avanzado.", 40, "Presencial");

        Professor dumbledore = new Professor("Albus", "Dumbledore", 1001, 80);
        dumbledore.addAssignCourse(ai1Course);
        dumbledore.addAssignCourse(ai2Course);
        dumbledore.addAssignCourse(ai3Course);
        dumbledore.addAssignCourse(robotica2Course);
        System.out.println(dumbledore.getInfoTimeManagement());

        Student student1 = new Student("María Aldana", "Hernández", 001, 2019);
    }
}
