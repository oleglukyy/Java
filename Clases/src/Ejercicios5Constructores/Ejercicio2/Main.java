package Ejercicios5Constructores.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        new Main().newPerson();
    }

    public void newPerson() {
        Person user = new Person("Tony", 46, 1.8F, "Programmer");
        System.out.println(user.toString());
    }
}