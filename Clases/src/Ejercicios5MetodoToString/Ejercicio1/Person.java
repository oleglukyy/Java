package Ejercicios5MetodoToString.Ejercicio1;

public class Person {

    private String name;
    private int age;
    private float height;
    private String work;

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
        return String.format("The person %s is %d years old, their height is %.2f and its work is %s", name, age,
                height, work);
    }
}
