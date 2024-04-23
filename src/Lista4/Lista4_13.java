package Lista4;

import java.util.Arrays;
import java.util.Scanner;

public class Lista4_13 {
    public static void main(String[] args) {

        int[] vetorA = new int[30];
        int[] vetorB = new int[30];
        int[] vetorC;
        int contador = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os 30 valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }

        System.out.println("Informe os 30 valores do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            for (int y = 0; y < vetorB.length; y++) {
                if (vetorA[i] == vetorB[y]) {
                    contador++;
                    break;
                }
            }
        }

        vetorC = new int[contador];
        int cIndex = 0;
        System.out.println("Os valores que coexistem nos vetores A e B são: ");

        for (int i = 0; i < vetorA.length; i++) {
            for (int y = 0; y < vetorB.length; y++) {
                if (vetorA[i] == vetorB[y]) {
                    vetorC[cIndex] = vetorA[i];
                    cIndex++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(vetorC));
    }
}