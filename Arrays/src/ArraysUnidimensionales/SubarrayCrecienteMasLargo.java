package Java.Arrays.src.ArraysUnidimensionales;

/*Dado un array de enteros arr, escribe un método que encuentre el subarray contiguo más largo que sea estrictamente creciente.

Tu método debe devolver:

El inicio del subarray

El fin del subarray

Y, opcionalmente, los elementos del subarray

Condiciones:

Cada número del subarray debe ser mayor que el anterior.

Si hay varios subarrays con la misma longitud máxima, devuelve el primero que aparezca.

No se pueden usar listas ni sets; solo arrays y bucles. */

public class SubarrayCrecienteMasLargo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 1, 2, 3, 4, 5 };
        new SubarrayCrecienteMasLargo().funcion(arr);
    }

    public void funcion(int[] arr) {
        if (arr.length == 0) {
            System.out.println("El array está vacío");
            return;
        }

        int inicioActual = 0; // Inicio del subarray que estamos recorriendo
        int longitudActual = 1; // Longitud del subarray actual

        int inicioMax = 0; // Inicio del subarray más largo encontrado
        int longitudMax = 1; // Longitud del subarray más largo encontrado

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                // Sigue siendo creciente
                longitudActual++;
            } else {
                // Se rompe el subarray creciente
                inicioActual = i;
                longitudActual = 1;
            }

            // Actualizamos si encontramos uno más largo
            if (longitudActual > longitudMax) {
                longitudMax = longitudActual;
                inicioMax = inicioActual;
            }
        }

        // Imprimir resultados
        int finMax = inicioMax + longitudMax - 1;
        System.out.print("Subarray creciente más largo: [");
        for (int i = inicioMax; i <= finMax; i++) {
            System.out.print(arr[i]);
            if (i < finMax)
                System.out.print(", ");
        }
        System.out.println("]");
        System.out.printf("Va de índice %d a %d\n", inicioMax, finMax);
    }
}
