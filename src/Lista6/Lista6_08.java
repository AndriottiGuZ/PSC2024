package Lista6;

import java.util.ArrayList;
import java.util.Random;

public class Lista6_08 {
            public static void main(String[] args) {
                int[] vetorA = new int[30];
                int[] vetorB = new int[30];
                ArrayList<Integer> vetorC = new ArrayList<>();

                gerarMatriz (vetorA, vetorB);

                imprimirVetor(vetorA, vetorB);

                intersecaoVetorC(vetorA,vetorB,vetorC);
                System.out.println("\nElementos da interseção (vetor C):");
                for (int elemento : vetorC) {
                    System.out.print(elemento + " ");
                }
            }

            private static void gerarMatriz(int[] vetorA, int[] vetorB) {
                Random gerador = new Random();
                for (int i = 0; i < 30; i++) {
                    vetorA[i] = gerador.nextInt(100);
                }
                for (int i = 0; i < 30; i++) {
                    vetorB[i] = gerador.nextInt(100);
                }
            }

            private static void imprimirVetor(int[] vetorA, int[] vetorB) {
                System.out.println("Vetor A: ");
                for (int i = 0; i < vetorA.length; i++) {
                    System.out.printf("%d ", vetorA[i]);
                }
                System.out.println("\nVetor B: ");
                for (int i = 0; i < vetorB.length; i++) {
                    System.out.printf("%d ",vetorB[i]);
                }
            }

            private static void intersecaoVetorC(int[] vetorA, int[] vetorB, ArrayList<Integer> vetorC) {
                for (int i = 0; i < 30; i++) {
                    for (int j = 0; j < 30; j++) {
                        if (vetorA[i] == vetorB[j]) {
                            vetorC.add(vetorA[i]);
                            break;
                        }
                    }
                }
            }

        }

