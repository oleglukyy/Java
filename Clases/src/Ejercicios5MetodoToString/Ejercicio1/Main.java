package Ejercicios5MetodoToString.Ejercicio1;
// Copia la clase Person del ejercicio anterior y añádele el método toString().

// Crea una clase Main que haga lo siguiente: 

// Crea una persona.

// Muestra sus datos utilizando el método toString().
public class Main {
    public static void main(String[] args) {
        new Main().newPerson();
    }

    public void newPerson() {
        Person user = new Person();
        user.setAge(18);
        user.setHeight(1.87f);
        user.setName("Paco");
        user.setWork("Cajero");
        System.out.println(user.toString());
    }
}
