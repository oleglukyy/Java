package ArraysBidimensionales;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3, 4 },
                { 2, 5, 6, 7 },
                { 3, 6, 8, 9 },
                { 4, 7, 9, 10 }
        };
        System.out.println(new Ejercicio1().simetria(array));
    }

    public boolean simetria(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != array[j][i])
                    return false;
            }
        }
        return true;
    }
}
