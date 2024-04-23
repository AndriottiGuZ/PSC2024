package Lista4;

import java.util.Scanner;

public class Lista4_09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        int a=0, b=0;

        for (int i=0; i < vetorA.length; i++){
            vetorA[i]=a;
            System.out.print("digite um numero para o vetorA["+i+"]: ");
            a = ler.nextInt();

            vetorB[i]=b;
            System.out.print("digite um numero para o vetorB["+i+"]: ");
            b = ler.nextInt();}

        for (int i=0; i < vetorA.length; i++){

            vetorC[i]= vetorB[i] + vetorA[i];
            System.out.printf("\nvetorA[%d] (%d) X vetorB[%d] (%d) = vetorC[%d] (%d)",
                    i,vetorA[i],i,vetorB[i],i,vetorC[i]);
        }
    }

}
