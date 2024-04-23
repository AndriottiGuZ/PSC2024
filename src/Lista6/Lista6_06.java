package Lista6;

import java.util.Scanner;

public class Lista6_06 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i=0;i<vetorA.length;i++){
            System.out.print("\nDigite o valor de A: ");
            vetorA[i] = ler.nextInt();
            System.out.print("Digite o valor de B: ");
            vetorB[i] = ler.nextInt();

            vetorC[i] = calculadora(vetorA[i],vetorB[i]);
        }

        System.out.println("");

        for (int i=0; i<vetorC.length;i++){
            System.out.printf("VetorA %d + VetorB %d = %d\n",i,i,vetorC[i]);
        }
    }

    private static int calculadora(int i, int i1) {
        return i * i1;
    }
}
