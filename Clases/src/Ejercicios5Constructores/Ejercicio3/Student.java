package Ejercicios5Constructores.Ejercicio3;

import java.beans.ConstructorProperties;

import javax.management.ConstructorParameters;

// Ejercicio 3

// Crea una clase Student que cumpla lo siguiente:
// El constructor recibe por parámetros el número de matrícula del alumno y el nombre. 
// Contiene los siguientes métodos:
// Método para registrar dos notas del alumno: el método recibe las dos notas 
// por parámetro y se guardan en los atributos. 
// Método para devolver la media de las notas.
// Método toString: devuelve una descripción del alumno con todos sus datos, incluida la nota media.

public class Student {

    private float[] grades;
    private String registration;
    private String name;

    // Constructor
    public Student(String registration, String name) {
        this.registration = registration;
        this.name = name;
        this.grades = new float[2];
    }

    // Set grades
    public void setGrades(float grade1, float grade2) {
        this.grades[0] = grade1;
        this.grades[1] = grade2;
    }

    // Average Grades
    public float averageGrades() {
        return (grades[0] + grades[1]) / 2;
    }
    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String toString() {
        return String.format("Student %s, with registration number %s has an average grade of %.2f",
                name, registration, averageGrades());
    }
}
