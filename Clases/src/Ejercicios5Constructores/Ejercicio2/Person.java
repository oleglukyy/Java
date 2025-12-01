package Ejercicios5Constructores.Ejercicio2;

// Ejercicio 2
// Copia la clase Person del ejercicio anterior y añádele un constructor con parámetros.
// Crea una clase Main que haga lo siguiente: 
// Crea una persona utilizando el constructor.
// Muestra sus datos.

public class Person {

    private String name;
    private int age;
    private float height;
    private String work;

    // DEFAULT CONSTRUCTOR
    public Person() {
        this.setName("unnamed");
        this.setAge(0);
        this.setHeight(0.0f);
        this.setWork("unemployment");
    }

    // Parameterized constructor
    public Person(String name, int age, float height, String work) {
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        this.setWork(work);
    }

    // NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // AGE
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // HEIGHT
    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    // WORK
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String toString() {
        return String.format("The person %s is %d years old, their height is %.2f and its work is %s",
                name, age, height, work);
    }

}
