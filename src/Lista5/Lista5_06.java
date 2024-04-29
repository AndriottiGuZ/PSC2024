package Lista5;

import java.util.Scanner;

public class Lista5_06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int linhas = 6;
        int colunas = 6;

        int[][] matrizM = new int[linhas][colunas];
        int[] vetorV = new int[linhas * colunas];

        System.out.println("Digite os elementos da matriz M:");
        for(int i = 0; i < linhas; i++){
            for( int j = 0; j < colunas; j++){
                matrizM[i][j] = ler.nextInt();
            }
        }

        System.out.print("Digite o valor de A: ");
        int valorA = ler.nextInt();

        int indice = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                vetorV[indice++] = matrizM[i][j] * valorA;
            }
        }

        System.out.println("\nresultados da multiplicação dos valores de M por " + valorA);
        imprimirVetor(vetorV);
    }

    private static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            if ((i + 1) % 6 == 0) {
                System.out.println();
            }
        }
    }
}


