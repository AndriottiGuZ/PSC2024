package Lista6;

import java.util.Scanner;

public class Lista6_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        do {
        System.out.print("Digite um numero inteiro: ");
        num = ler.nextInt();
        calculadoraParOuImpar(num);}while (num>0);

    }

    private static void calculadoraParOuImpar(int num) {
        if (num % 2 == 0) {
            System.out.println("Esse numero eh par...");
        } else {
            System.out.println("Esse numero eh impar...");
        }
    }
}