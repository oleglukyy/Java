package Java.Arrays.src;

public class Sergio {

    public static void main(String[] args) {
        new Sergio().parOImpar(3);
    }

    public void parOImpar(int n) {
        if (n % 2 == 0) {
            System.out.printf("El numero %d es par", n);
        } else {
            System.out.printf("El numero %d es impar", n);
        }

    }
}
