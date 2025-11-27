package ArraysBidimensionales;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Pide al usuario el tamaño n de una matriz cuadrada (n x n, n >= 4).

// Llena la matriz con números enteros aleatorios entre 1 y 50.

// Realiza las siguientes operaciones:

// a) Detecta la submatriz cuadrada más grande donde todos los elementos son pares.

// Por ejemplo, si la matriz es 6x6, busca la submatriz más grande de 2x2, 3x3, etc., que cumpla la condición.

// b) Rota la matriz 90° a la derecha sin crear una matriz nueva (rotación “in place”).

// c) Después de rotarla, calcula la suma de todas las diagonales secundarias (todas las diagonales que van de arriba-derecha a abajo-izquierda).

// Muestra:

// La matriz original.

// La posición y tamaño de la submatriz de pares más grande encontrada.

// La matriz rotada.

// La suma de las diagonales secundarias.

public class EjerciciosChatGPT {
    public static void main(String[] args) {
        new EjerciciosChatGPT().ejercicio();
    }

    public int[][] generarMatriz(int n) {
        int[][] arrayVacio = new int[n][n];
        return arrayVacio;
    }

    public int[][] llenarMatriz(int[][] arrayVacio) {
        Random random = new Random();
        for (int i = 0; i < arrayVacio.length; i++) {

            for (int j = 0; j < arrayVacio.length; j++) {
                arrayVacio[i][j] = random.nextInt(0, 50);
            }

        }
        return arrayVacio;
    }

    public void ejercicio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor, indicame un número mayor que 4 para generar una matriz con\nnumeros aleatorios:");
        int[][] array = llenarMatriz(generarMatriz(sc.nextInt()));
        int sumaMax = 0;
        int suma = 0;
        int[][] maxDos = new int[2][2];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i][j] % 2 == 0 && array[i + 1][j + 1] % 2 == 0 && array[i + 1][j] % 2 == 0
                        && array[i][j + 1] % 2 == 0) {

                    suma = array[i][j] + array[i + 1][j + 1] + array[i + 1][j] + array[i][j + 1];
                    if (suma > sumaMax) {
                        sumaMax = suma;
                        maxDos[0][0] = array[i][j];
                        maxDos[1][1] = array[i + 1][j + 1];
                        maxDos[1][0] = array[i + 1][j];
                        maxDos[0][1] = array[i][j + 1];
                    }
                }
            }

        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        if (sumaMax == 0) {
            System.out.println("No se ha encontrado ninguna submatriz 2x2 compuesta de numeros pares");
        } else {
            System.out.println("La submatriz 2x2 máxima que se ha encontrado ha sido:");
            for (int x = 0; x < 2; x++) {
                for (int y = 0; y < 2; y++) {
                    System.out.print(maxDos[x][y] + "\t");
                }
                System.out.println();
            }
        }
        sc.close();

    }
}
