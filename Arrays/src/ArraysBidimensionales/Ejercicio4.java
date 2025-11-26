package ArraysBidimensionales;

//Realiza una función que reciba una matriz cuadrada y 
//devuelva la suma de cada fila y de cada columna.
public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3, 4 },
                { 2, 5, 6, 7 },
                { 3, 6, 8, 9 },
                { 4, 7, 9, 10 }
        };
        new Ejercicio4().suma(array);
    }

    public void suma(int[][] array) {
        boolean cuadrado = true;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                cuadrado = false;
                break; // dejar de comprobar
            }
        }
        if (cuadrado) {
            sumaFilasColumnas(array);
        } else {
            System.out.println("sorry pero no es cuadrado");
        }
    }

    public void sumaFilasColumnas(int[][] array) {
        int sumafila = 0;
        int sumacolumna = 0;

        for (int i = 0; i < array.length; i++) {
            sumafila = 0;
            sumacolumna = 0;
            for (int j = 0; j < array.length; j++) {
                sumafila += array[i][j];
                sumacolumna += array[j][i];
            }
            System.out.printf("la suma de los dígitos de la fila número %d es de %d\n", i + 1, sumafila);
            System.out.printf("la suma de los dígitos de la columna número %d es de %d\n", i + 1, sumacolumna);
        }
    }
}
