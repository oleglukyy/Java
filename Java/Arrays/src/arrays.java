package Java.Arrays.src;

public class arrays {
    public static void main(String[] args) {
        new arrays().recorrerPaTontos();
    }

    public void recorrer() {
        int[] arrai = { 18, 19, 20, 21, 22 };
        for (int i : arrai) {

        }
    }

    public void recorrerPaTontos() {

        int[] arrai = { 1, 2, 3, 4, 5 }; // declaracion
        int[] patata = new int[3]; // declaracionx2
        patata[2] = 8; // almacenar valor en [x] posicion
        for (int i = 0; i < arrai.length; i++) { // recorrerlo
            System.out.println(arrai[i]); // imprimir todo
            // a[i]=sc.nextInt() pa que lo rellene

        }
    }
}
