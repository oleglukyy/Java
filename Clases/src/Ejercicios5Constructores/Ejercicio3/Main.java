package Ejercicios5Constructores.Ejercicio3;

import java.util.Scanner;

// Realiza una clase Main que haga lo siguiente:
// Solicite al usuario los datos de un alumno y sus notas.
// Construya el alumno.
// Muestre sus datos.
public class Main {
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().createPerson();
    }

    public void createPerson() {

        System.out.println("Enter students name:");
        String name = sc.nextLine();

        System.out.println("Enter students registration number:");
        String registration = sc.nextLine();

        System.out.println("Enter first students grade:");
        float grade1 = sc.nextFloat();
        sc.nextLine();

        System.out.println("Enter second students grade:");
        float grade2 = sc.nextFloat();
        sc.nextLine();

        Student num1Student = new Student(registration, name);

        num1Student.setGrades(grade1, grade2);

        System.out.println(num1Student.toString());
    }
}
