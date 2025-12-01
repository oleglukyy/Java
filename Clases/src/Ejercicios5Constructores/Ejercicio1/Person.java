package Ejercicios5Constructores.Ejercicio1;

// Copia la clase Person del ejercicio anterior y añádele un constructor por defecto que asigne los siguientes valores a sus atributos:
// name="unnamed"
// age=0
// height=0.0f
// work="unemployment"
// Crea una clase Main que haga lo siguiente: 
// Crea una persona utilizando el constructor.
// Muestra sus datos.

public class Person {

    private String name;
    private int age;
    private float height;
    private String work;

    // CONSTRUCTOR
    public Person() {
        this.setName("unnamed");
        this.setAge(0);
        this.setHeight(0.0f);
        this.setWork("unemployment");
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
