package Ejercicios5Constructores.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        new Main().newPerson();
    }

    public void newPerson() {
        Person user = new Person();
        System.out.println(user.toString());
    }
}
