package Ejercicios5GetYSet.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().newPerson();
    }

    public void newPerson() {
        Person user = new Person();
        user.setName("Paco");
        user.setHeight(1.90f);
        user.setAge(18);
        user.setWork("Programmer");
        showInfo(user);
        updateInfo(user);
        showInfo(user);
    }

    public void showInfo(Person user) {
        System.out.printf("La persona creada actualmente se llama %s, tiene %d años, mide %.2f y trabaja de %s\n",
                user.getName(), user.getAge(), user.getHeight(), user.getWork());

    }

    public void updateInfo(Person user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nuevo nombre:");
        user.setName(scanner.nextLine());
        System.out.println("Ingrese la nueva edad:");
        user.setAge(scanner.nextInt());
        System.out.println("Ingrese la nueva altura:");
        user.setHeight(scanner.nextFloat());
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese el nuevo trabajo:");
        user.setWork(scanner.nextLine());
        scanner.close();
    }
}
