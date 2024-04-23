package Lista2;

import java.util.Scanner;

public class Lista2_06 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int A,B,C;

        System.out.println("Digite os 3 lados de um triângulo: ");
        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();

        if ((A < B + C) & (B < A + C) & (C < A + B)){
            System.out.println("È um triângulo!");}
            else{ System.out.println("Não eh um triângulo!");
        }
    }
}
