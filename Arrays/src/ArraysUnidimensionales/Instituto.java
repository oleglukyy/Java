package Java.Arrays.src.ArraysUnidimensionales;

import java.util.Arrays;
import java.util.EventObject;
import java.util.Scanner;

public class Instituto {

    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        double[] arrai = { 5.3, 6.4, 7.1, 9.2 };
        System.out.println(new Instituto().Ejercicio25(arrai, 9.2));

    }

    public void Ejercicio1() {
        System.out.println("java");
        int arrai[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < arrai.length; i++) {
            if (arrai[i] % 2 == 0) {
                System.out.printf("Posicion %d -> par\n", i);
            } else {
                System.out.printf("Posicion %d -> impar\n", i);
            }
        }
    }

    public void Ejercicio2() {
        Scanner keyboard = new Scanner(System.in);

        int arrai[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println("true or false?");
        boolean valor = keyboard.nextBoolean();
        keyboard.close();
        for (int i = valor ? 0 : 1; i < arrai.length; i += 2) {
            System.out.printf("Posicion %d -> %d\n", i, arrai[i]);

        }
        for (int numeros : arrai) {
            System.out.println(numeros);
        }

    }

    public void Ejercicio11(int... numeros) {
        int resultado = 1;
        for (int n : numeros) {
            resultado *= n;
        }
        System.out.printf("el resultado es -> %d", resultado);
    }

    public void Ejercicio12(int[] enteros) {// se modifica el valor inicial del array
        enteros[0] = 1;
        System.out.println(Arrays.toString(enteros));
    }

    public void Ejercicio13(int[] arrai) {
        int suma = 0;
        for (int numeros : arrai) {
            suma += numeros;

        }
        System.out.println(suma);
    }

    public void Ejercicio14(int[] arrai, int num) {
        int apariciones = 0;
        for (int numero : arrai) {
            if (numero == num) {
                apariciones++;
            }
        }
        int posiciones[] = new int[apariciones];
        for (int i = 0, posicion = 0; i < arrai.length; i++) {
            if (num == arrai[i]) {
                posiciones[posicion] = i;
                posicion++;// el ++ se puede meter dentro del array de arriba, pero asi nmas visual
            }
        }
        System.out.printf("El numero %d, aparece %d veces, en las posiciones %s", num, apariciones,
                Arrays.toString(posiciones));
    }

    public void Ejercicio15(int... num) {
        int[] apariciones = new int[10];
        for (int i = 0; i < num.length; i++) {// ---> contar las veces que aparece cada numero
            apariciones[num[i]] += 1;
        }

        int valorMaximo = 0;
        for (int valor : apariciones) {// ---> encontrar el valor máximo
            if (valor > valorMaximo) {
                valorMaximo = valor;
            }
        }

        // System.out.println(Arrays.toString(apariciones));
        for (int filas = valorMaximo; filas > 0; filas--) {// ---> imprimir histograma vertical
            System.out.print(filas);
            for (int columnas = 0; columnas < 10; columnas++) {
                if (filas <= apariciones[columnas]) {
                    System.out.print((columnas % 2 == 0 ? BLUE_BACKGROUND : YELLOW_BACKGROUND) + "  " + RESET);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.print(" ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", i);
        }
    }

    public boolean Ejercicio16(int[] arrai) {
        if (arrai.length <= 1) {
            return true;
        } else if (arrai[0] == arrai[arrai.length - 1]) {
            return Ejercicio16(Arrays.copyOfRange(arrai, 1, arrai.length - 1));
        } else {
            return false;
        }
    }

    public void Ejercicio21(char[] arrai, char c, int n) {
        for (int i = arrai.length - 1; i > n; i--) {
            arrai[i] = arrai[i - 1];
        }
        arrai[n] = c;
        System.out.println(Arrays.toString(arrai));
    }

    public int[] Ejercicio22(int[] arrai) {
        int[] invertedArrai = new int[arrai.length];
        for (int i = 0, j = arrai.length - 1; i <= arrai.length - 1; i++, j--) {
            invertedArrai[i] = arrai[j];
        }
        return invertedArrai;
    }

    public void Ejercicio23(int[] arrai) {
        for (int x = arrai.length - 1; x >= 1; x--) {
            for (int i = 0, aux; i < x; i++) {

                if (arrai[i] > arrai[i + 1]) {
                    aux = arrai[i];
                    arrai[i] = arrai[i + 1];
                    arrai[i + 1] = aux;
                }

            }
        }
        System.out.println(Arrays.toString(arrai));
    }

    public int[] Ejercicio24(int[] arrai) {
        if (arrai.length <= 1) {
            return arrai;
        } else {
            return aux(arrai, 0);
        }
    }

    public int[] aux(int[] arrai, int i) {
        int aux;
        if (i < (arrai.length - 1) / 2) {

            aux = arrai[i];
            arrai[i] = arrai[arrai.length - 1 - i];
            arrai[arrai.length - 1 - i] = aux;
            return aux(arrai, i + 1);
        } else {
            return arrai;
        }

    }

    public int Ejercicio25(double[] arrai, double d) {
        return aux25(arrai, d, 0, arrai.length);
    }

    public int aux25(double[] arrai, double d, int minimo, int limite) {
        if (minimo >= limite) {// chequear si nos hemos pasado
            return -1;// no està
        }
        int actual = (minimo + limite) / 2;
        if (arrai[actual] == d) {
            return actual;
        } else if (d > arrai[actual]) {
            return aux25(arrai, d, actual + 1, limite);
        } else {
            return aux25(arrai, d, minimo, actual);
        }
    }
    /*
     * public void arrayBidimensional() {
     * int[][] bidi = new int[5][5];// rellenar array
     * for (int i = 0; i < bidi.length; i++) {
     * for (int j = 0; j < bidi[i].length; j++) {
     * bidi[i][j] = i * 5 + j;
     * }
     * }
     * for (int[] fila : bidi) { // primera forma de mostrar por pantalla
     * for (int valorElemento : fila) {
     * System.out.printf("dentro contiene el entero: %d\n", valorElemento);
     * }
     * }
     * System.out.println(Arrays.deepToString(bidi)); // segunda forma
     * 
     * for (int[] fila : bidi) { // tercera
     * for (int valorElemento : fila) {
     * System.out.print(String.format("%3d ", valorElemento));
     * }
     * System.out.println();
     * }
     * }
     */
}
