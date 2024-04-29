package Lista5;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Lista5_09 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int[][] matriz = new int[3][3];
        double diagonalSec = 0, resultMult = 1;
        DecimalFormat decimal = new DecimalFormat("#0.00");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = gerador.nextInt(10);
            }
        }
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            diagonalSec += matriz[i][2 - i];
        }
        double mediaDiagonalSecundaria = diagonalSec / 3;
        for (int i = 0; i < 3; i++) {
            resultMult += matriz[i][i] * mediaDiagonalSecundaria;
        }
        System.out.println("\nA media da diagonal secundaria eh: " + decimal.format(mediaDiagonalSecundaria));
        System.out.println("\nO resultado da soma da multiplicação dos elementos da diagonal principal pela média\n " +
                "da diagonal secundária é: " + decimal.format(resultMult));
    }
}
