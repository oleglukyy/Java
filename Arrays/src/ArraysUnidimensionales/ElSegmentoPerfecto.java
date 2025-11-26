package Java.Arrays.src.ArraysUnidimensionales;

public class ElSegmentoPerfecto {
    public static void main(String[] args) {
        int[] array = { 4, 2, 3, 5, 7, 8, 6, 9 };
        new ElSegmentoPerfecto().funcion(array);
    }

    public void funcion(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int max = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                }

            }

        }
    }

}
/*
 * EL EJERCICIO: "El Segmento Perfecto"
 * 
 * Dado un array de enteros, debes encontrar el segmento (subarray continuo) más
 * largo que cumpla todas estas condiciones:
 * 
 * No puede haber números repetidos dentro del segmento.
 * 
 * La diferencia entre el valor máximo y el valor mínimo del segmento debe ser
 * igual a la longitud del segmento - 1.
 * 
 * El segmento debe ser estrictamente creciente cuando lo recorras sin ordenar.
 * 
 * Debes devolver:
 * 
 * el inicio
 * 
 * el fin
 * 
 * y el contenido del segmento perfecto más largo.
 * 
 * Si hay varios segmentos válidos:
 * 
 * Elige el de mayor longitud.
 * 
 * Si aún hay empate, elige el que empieza antes.
 * 
 * 🔍 EJEMPLO
 * 
 * Entrada:
 * 
 * [4, 2, 3, 5, 7, 8, 6, 9]
 * 
 * 
 * El segmento perfecto más largo sería:
 * 
 * [2, 3, 5, 7, 8]
 */