package ArraysBidimensionales;

import java.util.Arrays;

// Realiza un procedimiento que reciba una matriz cuadrada. El procedimiento debe 
// buscar las filas que sean exactamente iguales a columnas y mostrar el contenido 
// indicando los índices. Por ejemplo, con la matriz del ejercicio 1, debería mostrar 
// lo siguiente:

// Fila 1: 1,2,3,4  es igual a columna 1.
// Fila 2: 2,5,6,7 es igual a columna 2.
// Fila 3: 3,6,8,9 es igual a columna 3.
// Fila 4: 4,7,9,10 es igual a columna 4.

public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3, 4 },
                { 2, 5, 6, 7 },
                { 3, 6, 8, 9 },
                { 4, 7, 9, 10 }
        };
        new Ejercicio3().iguales(array);
    }

    public void iguales(int[][] array) {
        boolean cuadrado = true;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                cuadrado = false;
                break; // dejar de comprobar
            }
        }
        if (cuadrado) {
            igualesFuncion(array);
        } else {
            System.out.println("sorry pero no es cuadrado");
        }
    }

    public void igualesFuncion(int[][] array) {
        boolean esIgual = true;
        for (int i = 0; i < array.length; i++) {
            esIgual = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != array[j][i]) {
                    esIgual = false;
                    break;
                }
            }
            if (esIgual) {
                System.out.printf("Fila %d: %s es igual a columna %d\n", i + 1, Arrays.toString(array[i]),
                        i + 1);
            }
        }
    }

}
