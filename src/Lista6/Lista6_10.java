package Lista6;

import java.util.Random;

public class Lista6_10 {
    public static void main(String[] args) {
        int linhas = 6;
        int colunas = 8;

        int[][] matriz = gerarMatrizAleatoria(linhas, colunas);
        int[] vetorC = contarNegativosPorLinha(matriz);

        imprimirMatriz(matriz);
        imprimirVetorContagem(vetorC);
    }

    public static int[][] gerarMatrizAleatoria(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(201) - 100;
            }
        }
        return matriz;
    }

    public static int[] contarNegativosPorLinha(int[][] matriz) {
        int linhas = matriz.length;
        int[] vetorC = new int[linhas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    vetorC[i]++;
                }
            }
        }
        return vetorC;
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz gerada aleatoriamente:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void imprimirVetorContagem(int[] vetorC) {
        System.out.println("\nVetor de contagem de elementos negativos por linha:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("Linha " + (i + 1) + ": " + vetorC[i]);
        }

    }
}
