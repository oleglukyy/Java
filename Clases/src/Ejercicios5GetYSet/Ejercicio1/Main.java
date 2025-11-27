package Ejercicios5GetYSet.Ejercicio1;

import java.util.Scanner;

public class Main {
    private Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().crearPersona("usuario");
    }

    public void crearPersona(String name) {
        Person usuario = new Person();
        usuario.setName(name);
        System.out.printf("El nombre de la persona creada es %s, establece un nuevo nombre:", usuario.getName());
        usuario.setName(keyboard.nextLine());
        System.out.printf("El nuevo nombre es %s", usuario.getName());
        keyboard.close();
    }
}
