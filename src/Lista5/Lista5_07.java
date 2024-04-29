package Lista5;

import java.util.Scanner;

public class Lista5_07 {
    public static void main(String[] args) {


    Scanner leitor = new Scanner(System.in);
    int[][] matrizM = new int[5][5];
    int somaLinha4 = 0, somacoluna2 = 0, diagonalPrincipal = 0, somaTotal = 0;

            System.out.println("Inicializar a Matriz M: ");
        for (int i = 0; i < 5; i++) {

            System.out.println("Digite os elementos da linha " + (i + 1) + ":");
        for (int j = 0; j < 5; j++) {
            matrizM[i][j] = leitor.nextInt();
        }
    }
        System.out.println("\nMatriz M:");
        for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.printf("%d ", matrizM[i][j]);
        }

        System.out.println("");
    }

        for (int j = 0; j < 5; j++) {
        somaLinha4 += matrizM[3][j];
    }

        System.out.printf("O valor da soma dos elementos da linha 4 é: %d\n", somaLinha4);

        for (int i = 0; i < 5; i++){
        somacoluna2 += matrizM[i][1];
    }

        System.out.printf("O valor da soma dos elementos da caoluna 2 é: %d\n", somacoluna2);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    diagonalPrincipal += matrizM[i][j];
                }
            }
        }

            System.out.printf("O valor da diagonal principal é: %d\n", diagonalPrincipal);


        for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            somaTotal += matrizM[i][j];
            }
        }

        System.out.printf("O valor da soma de todos elementos é: %d\n", somaTotal);
    }
}
