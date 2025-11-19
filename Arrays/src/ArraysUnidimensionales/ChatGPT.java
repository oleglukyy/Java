package Java.Arrays.src.ArraysUnidimensionales;

public class ChatGPT {

    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        new ChatGPT().kadaneProducto(arr);
    }

    public int busquedaPosicion(int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            return 0;
        } else {
            return auxBusquedaPosicion(arr, x, 0, arr.length);
        }
    }

    public int auxBusquedaPosicion(int[] arr, int x, int inicio, int fin) {
        if (inicio >= fin) {
            return inicio;// posicion en la que deberia ir
        }
        int medio = (inicio + fin) / 2;
        if (arr[medio] == x) {
            return medio;
        } else if (x > arr[medio]) {
            return auxBusquedaPosicion(arr, x, medio + 1, fin);
        } else {
            return auxBusquedaPosicion(arr, x, inicio, medio);
        }
    }

    public void algoritmoDeKadane(int[] arr) {
        int suma = arr[0];
        int sumaMax = arr[0];
        int comienzo = 0;
        int comienzoTop = 0;
        int fin = -1;
        for (int i = 1; i < arr.length; i++) {
            suma += arr[i];
            if (suma - arr[i] < arr[i]) {
                suma = arr[i];
                comienzo = i;
            }
            if (suma > sumaMax) {
                sumaMax = suma;
                comienzoTop = comienzo;
                fin = i;
            }
        }
        System.out.printf("El valor maximo es de %d, y va de %d a %d", sumaMax, comienzoTop, fin);
    }

    public void kadaneProducto(int[] arr) {
        int productomax = arr[0];
        int producto = arr[0];
        for (int i = 1; i < arr.length; i++) {
            producto *= arr[i];
        }
        System.out.println(producto);
    }
}
/*
 * Ejercicio: Subarray con el Producto Máximo
 * 
 * Descripción:
 * Dado un array de enteros, encuentra el subarray contiguo cuyo producto sea el
 * máximo. Puedes suponer que el array siempre tendrá al menos un número.
 * 
 * Ejemplo 1:
 * int[] arr = {2, 3, -2, 4};
 * 
 * 
 * Salida esperada:
 * El producto máximo es 6, que proviene del subarray [2, 3].
 * 
 * Ejemplo 2:
 * int[] arr = {-2, 0, -1};
 * 
 * 
 * Salida esperada:
 * El producto máximo es 0, que proviene del subarray [0].
 * 
 * Restricciones:
 * 
 * El array puede contener tanto números positivos como negativos.
 * 
 * El array puede tener ceros, los cuales pueden "cortar" un subarray.
 * 
 * Debes considerar subarrays que contengan un solo número.
 * 
 * Pistas:
 * 
 * Si tienes un número negativo, el producto podría volverse positivo si tienes
 * un número negativo más adelante (porque dos negativos hacen un positivo).
 * 
 * No olvides el caso del cero, que hace que cualquier producto que lo incluya
 * sea cero.
 * 
 * El producto de los subarrays puede ir cambiando a medida que avanzas, por lo
 * que deberías llevar un seguimiento de los productos máximos y mínimos en cada
 * paso.
 * 
 * Enfoque:
 * 
 * Puedes intentar hacer esto de forma iterativa sin necesidad de usar
 * recursividad. Al recorrer el array, mantén dos variables:
 * 
 * maxProducto: el producto máximo hasta el momento.
 * 
 * minProducto: el producto mínimo (porque un número negativo puede convertirse
 * en positivo cuando lo multiplicas por otro negativo).
 */

/*
 * Ejercicio: Longitud de la Subcadena más Larga sin Repetir Caracteres
 * 
 * Descripción:
 * Dado un string, encuentra la longitud de la subcadena más larga que no
 * contenga caracteres repetidos. La subcadena debe ser una secuencia continua
 * de caracteres del string.
 * 
 * Ejemplo 1:
 * String s = "abcabcbb";
 * 
 * 
 * Salida esperada:
 * La subcadena más larga sin repetir caracteres es "abc", por lo tanto la
 * longitud es 3.
 * 
 * Ejemplo 2:
 * String s = "bbbbb";
 * 
 * 
 * Salida esperada:
 * La subcadena más larga sin repetir caracteres es "b", por lo tanto la
 * longitud es 1.
 * 
 * Ejemplo 3:
 * String s = "pwwkew";
 * 
 * 
 * Salida esperada:
 * La subcadena más larga sin repetir caracteres es "wke", por lo tanto la
 * longitud es 3.
 * 
 * Restricciones:
 * 
 * La longitud del string no será mayor a 10^5, por lo que tu solución debe ser
 * eficiente.
 * 
 * No debes utilizar estructuras como sets o maps para resolverlo, a menos que
 * sea estrictamente necesario.
 * 
 * Pistas:
 * 
 * Una ventana deslizante te permite mantener un rango dinámico de caracteres.
 * 
 * Necesitarás un puntero izquierdo (left) y un puntero derecho (right) para
 * expandir o contraer la ventana, y tener un seguimiento de los caracteres en
 * la ventana actual.
 * 
 * A medida que deslizas la ventana, asegúrate de mover el puntero izquierdo
 * cuando encuentres caracteres repetidos.
 * 
 * Enfoque:
 * 
 * Usa dos punteros, uno para el comienzo de la ventana (left) y otro para el
 * final de la ventana (right).
 * 
 * Desliza el puntero right a través del string.
 * 
 * Si encuentras un carácter repetido dentro de la ventana, mueve el puntero
 * left hacia la derecha hasta que no haya repeticiones.
 * 
 * En cada paso, actualiza la longitud de la ventana y guarda la longitud máxima
 * encontrada.
 * 
 * Al final, devuelve la longitud máxima de la subcadena sin caracteres
 * repetidos.
 * 
 * Posible Solución en Pseudocódigo:
 * 
 * Inicializa un mapa vacío o una estructura similar para almacenar la última
 * posición de cada carácter.
 * 
 * Establece dos punteros left y right que marquen el comienzo y el final de la
 * ventana.
 * 
 * Recorre el string utilizando el puntero right:
 * 
 * Si el carácter en s[right] ya está dentro de la ventana (es decir, si ya
 * existe en el mapa y su valor es mayor o igual a left), mueve el puntero left
 * hacia la derecha para eliminar la repetición.
 * 
 * Calcula la longitud de la ventana en cada paso.
 * 
 * Al final del recorrido, la longitud máxima es el resultado.
 * 
 * ¿Por qué es difícil?
 * 
 * Este ejercicio es complicado porque requiere que manejes la ventana
 * deslizante de manera eficiente, y debes tener en cuenta las repeticiones
 * mientras mantienes la ventana actualizada. Esto te obliga a pensar en el
 * algoritmo de forma dinámica para optimizar tanto el tiempo como la memoria.
 * 
 * Este enfoque es muy utilizado en problemas de optimización en cadenas y
 * arrays, ¡y lo vas a ver bastante en entrevistas y en problemas reales!
 * 
 * ¿Te atreves con este reto?
 * 
 * Es un desafío que mezcla tanto estructura de datos como lógica de ventanas
 * deslizantes y te obliga a pensar de manera diferente sobre cómo se resuelven
 * problemas con secuencias de datos. Si quieres que te guíe paso a paso, solo
 * avísame. 😊
 */
