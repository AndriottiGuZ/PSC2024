package Lista6;

import java.util.Random;

public class Lista6_09 {
    public static void main(String[] args) {
        int linhas = 7;
        int colunas = 9;

        int[][] matriz = gerarMatrizAleatoria(linhas, colunas);
        imprimirMatriz(matriz);
        int soma = calcularSomaMatriz(matriz);
        System.out.println("\nSoma dos elementos da matriz: " + soma);
    }

    public static int[][] gerarMatrizAleatoria(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        return matriz;
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

    public static int calcularSomaMatriz(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
}
