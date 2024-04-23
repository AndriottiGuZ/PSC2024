package Lista4;

import java.util.Arrays;
import java.util.Scanner;

public class Lista4_11 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[20];

        System.out.println("Digite 20 números interiros: ");
        for (int i=0; i<vetor.length;i++){
            vetor[i]= ler.nextInt();
        }
        System.out.println("\nVetor em ordem crescente:\n");
        Arrays.sort(vetor);
        for (int i=0; i<vetor.length;i++){
            System.out.println(vetor[i]);
        }

    }
}
