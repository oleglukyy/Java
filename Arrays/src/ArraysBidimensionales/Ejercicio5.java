package ArraysBidimensionales;

// Realiza una función que devuelva si una matriz cuadrada es un cuadrado mágico.
//  Un cuadrado mágico es una matriz cuadrada NxN donde las sumas de cada columna, 
//  de cada fila y de cada diagonal son iguales. Ejemplo:
public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] array = {
                { 4, 15, 14, 1 },
                { 9, 6, 7, 12 },
                { 5, 10, 11, 8 },
                { 16, 3, 2, 13 }
        };
        new Ejercicio5().esMagico(array);
    }

    public void esMagico(int[][] array) {
        boolean cuadrado = true;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                cuadrado = false;
                break; // dejar de comprobar
            }
        }
        if (cuadrado) {
            System.out.println(esMagicoFuncion(array));
        } else {
            System.out.println("sorry pero no es cuadrado");
        }
    }

    public boolean esMagicoFuncion(int[][] array) {

        int sumaReferencial = 0;

        for (int i = 0; i < array.length; i++) {
            sumaReferencial += array[0][i];
        }

        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        int sumaFila = 0;
        int sumaColumna = 0;

        for (int i = 0; i < array.length; i++) {

            sumaFila = 0;
            sumaColumna = 0;

            for (int j = 0; j < array.length; j++) {

                sumaFila += array[i][j];
                sumaColumna += array[j][i];

                if (i == j) {
                    sumaDiagonal1 += array[i][j];
                }
                if (j + i == array.length - 1) {
                    sumaDiagonal2 += array[i][j];
                }

            }
            if (sumaFila != sumaReferencial || sumaColumna != sumaReferencial) {
                return false;
            }
        }

        // la comprobación se debe realizar fuera, debido que hasta que no termine el
        // bucle
        // no saldrá el valor de las diagonales
        if (sumaDiagonal1 != sumaReferencial || sumaDiagonal2 != sumaReferencial) {
            return false;
        }

        return true;
    }
}
