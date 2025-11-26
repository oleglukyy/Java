package ArraysBidimensionales;

public class Ejercicio6 {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";
    public static final String RED_BACKGROUND = "\u001B[41m";

    private int[] reinas = new int[8]; // índice = fila, valor = columna

    public static void main(String[] args) {
        new Ejercicio6().resolver();
    }

    public void resolver() {
        colocarReina(0); // empieza desde la fila 0
    }

    private void colocarReina(int fila) {
        if (fila == 8) {
            // Todas las reinas colocadas → imprimir tablero
            imprimirTablero();
            System.out.println();
            return;
        }

        for (int col = 0; col < 8; col++) {
            if (esSeguro(fila, col)) {
                reinas[fila] = col; // colocar reina
                colocarReina(fila + 1); // pasar a siguiente fila
            }
        }
    }

    private boolean esSeguro(int fila, int col) {
        for (int f = 0; f < fila; f++) {
            int c = reinas[f];
            // misma columna
            if (c == col)
                return false;
            // misma diagonal
            if (Math.abs(fila - f) == Math.abs(col - c))
                return false;
        }
        return true;
    }

    private void imprimirTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (reinas[i] == j) {
                    System.out.print(RED_BACKGROUND + "  " + RESET);
                } else if ((i + j) % 2 == 0) {
                    System.out.print(WHITE_BACKGROUND + "  " + RESET);
                } else {
                    System.out.print(BLACK_BACKGROUND + "  " + RESET);
                }
            }
            System.out.println();
        }
    }
}
