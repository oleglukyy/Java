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

    public int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número mayor o igual que 4:");
        int n = sc.nextInt();
        while (n < 4) {
            System.out.println("Debe ser >= 4:");
            n = sc.nextInt();
        }
        return n;
    }

    public int[][] generarMatriz(int n) {
        return new int[n][n];
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

    public void imprimir(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public boolean submatrizPar(int[][] array, int posX, int posY, int size) {
        for (int i = posX; i < posX + size; i++) {

            for (int j = posY; j < posY + size; j++) {
                if (!(array[i][j] % 2 == 0)) {
                    return false;
                }
            }

        }
        return true;
    }

    public int[][] rellenarSolucion(int[][] array, int n, int posX, int posY) {
        int arrayRelleno[][] = new int[n][n];
        for (int i = posX; i < array.length; i++) {
            for (int j = posY; j < arrayRelleno.length; j++) {
                arrayRelleno[i][j] = array[i][j];
                arrayRelleno[j][i] = array[j][i];
            }
        }
        return arrayRelleno;
    }

    public void ejercicio() {
        int[][] array = llenarMatriz(generarMatriz(pedirNumero()));
        int size = array.length, sizeMax = 0;
        int sumaMax, suma = 0;
        int posX = 0, posY = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                for (int z = 0; z < array.length - z - 1; z++) {
                    if (submatrizPar(array, posX, posY, size)) {
                        suma = array[i][j] + array[i + z][j + z] + array[i + z][j] + array[i][j + z];
                        size = z;
                        if (suma > sumaMax && size > sizeMax) {
                            posX = i;
                            posY = j;
                            sizeMax = z;
                            sumaMax = suma;
                            int arrayMax[][] = new int[sizeMax][sizeMax];
                            arrayMax = rellenarSolucion(array, array.length, posX, posY);
                            // maxDos[0][0] = array[i][j];
                            // maxDos[1][1] = array[i + 1][j + 1];
                            // maxDos[1][0] = array[i + 1][j];
                            // maxDos[0][1] = array[i][j + 1];
                        }
                    }
                }
            }
        }
        System.out.println("Matriz generada:");
        ;
        imprimir(array);

        if (sumaMax == 0) {
            System.out.println("No se ha encontrado ninguna submatriz compuesta de numeros pares");
        } else {
            System.out.printf("La submatriz  máxima que se ha encontrado ha sido de tamaño %d, cuyos digitos suman %d",
                    sizeMax, sumaMax);
            System.out.println(arrayMax.toString());
        }

    }
}
