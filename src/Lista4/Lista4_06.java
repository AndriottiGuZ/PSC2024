package Lista4;

import java.util.Scanner;

public class Lista4_06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int[30];

        for(int i=0; i<num.length;i++){
            int a;
            System.out.print("digite um numero: ");
            a = ler.nextInt();
            num[i] = a;
        }
        System.out.println("");
        System.out.print("os numeros prositivos são:\n");

        for (int i=0; i< num.length;i++) {
            if (num[i] >= 0) {
                System.out.printf("vetor[%d] = %d",i,num[i]);

            }
        }
    }
}