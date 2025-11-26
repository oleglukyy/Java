package ArraysBidimensionales;

// Realiza una función que reciba un array de tres dimensiones de 
// números decimales y devuelva cuál es el elemento mayor. 
public class Ejercicio2 {

    public static void main(String[] args) {
        double[][][] array = {
                {
                        { 1.2, 3.4, 5.6 },
                        { 7.8, 9.1, 2.3 }
                },
                {
                        { 4.5, 6.7, 8.9 },
                        { 0.1, 1.1, 20.2 }
                }
        };
        System.out.println(new Ejercicio2().doubleMayor(array));
    }

    public double doubleMayor(double[][][] array) {
        double mayor = array[0][0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int j2 = 0; j2 < array[i][j].length; j2++) {
                    if (mayor < array[i][j][j2])
                        mayor = array[i][j][j2];
                }
            }
        }
        return mayor;
    }
}
