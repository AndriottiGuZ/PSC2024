package Lista5;

import java.util.Random;

public class Lista5_2 {
    public static void main(String[] args){


        int[][] M = new int[6][8];
        int[] C = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                M[i][j] = random.nextInt(21) - 10;
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                if (M[i][j] < 0) {
                    C[i]++;
                }
            }
        }

        System.out.println("Matriz M:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nVetor C:");
        for (int i = 0; i < 6; i++) {
            System.out.print(C[i] + " ");
        }
    }
}

