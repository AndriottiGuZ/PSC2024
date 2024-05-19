package Lista6;

import java.util.Arrays;
import java.util.Scanner;

public class Lista6_07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorX = new int[10];
        int[] vetorY = new int[10];

        // Ler os elementos do vetor X
        System.out.println("Digite os 10 elementos do vetor X:");
        for (int i = 0; i < 10; i++) {
            vetorX[i] = leitor.nextInt();
        }

        preencherVetorY(vetorX,vetorY);

        System.out.println("Vetor Y resultante:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorY[i] + " ");
        }
    }

    private static void preencherVetorY(int[] vetorX, int[] vetorY) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vetorY[i] = vetorX[i] * 2;
            } else {
                vetorY[i] = vetorX[i] * 3;
            }
        }
    }
}
