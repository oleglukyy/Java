package Java;

import java.util.Scanner;

public class pruebas {

    public static void main(String[] args) throws InterruptedException {
        String s = "Hello world im gay";

        String prefijo = "";

        for (int i = 0; i < s.length(); i++) {
            char objetivo = s.charAt(i);

            for (char c = 0; c <= objetivo; c++) {
                System.out.println(prefijo + c);
                Thread.sleep(1);
            }

            prefijo += objetivo;
        }
    }
}
