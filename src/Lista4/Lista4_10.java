package Lista4;

import java.util.Scanner;

public class Lista4_10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] par = new int[10];
        int[] impar = new int[10];
        int num, c = 0, c1 = 0;

        System.out.println("Digite alguns numeros: ");

        for (int i = 0; i < 20; i++) {
            num = ler.nextInt();

            if ((c < 10) & (c1 < 10) & (num > 0)) {
                if (num % 2 == 0) {
                    par[c] = num;
                    c++;
                } else {
                    impar[c1] = num;
                    c1++;
                }

            } else {
                break;
            }
        }
        System.out.println("\nnumeros pares: ");
        for (int i=0;i<par.length;i++){
        System.out.println(par[i]);}

        System.out.println("\nnumeros impares: ");
        for (int i=0;i<impar.length;i++){
            System.out.println(impar[i]);}

    }
}

