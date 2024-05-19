package Lista6;

import java.util.Scanner;

public class Lista6_11 {
    public static void main(String[] args) {

                Scanner ler = new Scanner(System.in);

                int linhas = 10;
                int colunas = 10;

                int[][] matriz = new int[linhas][colunas];

                System.out.println("Digite os elementos da matriz:");
                lerMatriz(ler, matriz);

                double mediaDiagonal = calcularMediaDiagonalPrincipal(matriz);

                System.out.println("A média dos elementos da diagonal principal é: " + mediaDiagonal);
            }

            private static void lerMatriz(Scanner ler, int[][] matriz) {
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        System.out.print("Matriz[" + i + "][" + j + "]: ");
                        matriz[i][j] = ler.nextInt();
                    }
                }
            }

            private static double calcularMediaDiagonalPrincipal(int[][] matriz) {
                double soma = 0;
                for (int i = 0; i < matriz.length; i++) {
                    soma += matriz[i][i];
                }
                return soma / matriz.length;
            }
        }
