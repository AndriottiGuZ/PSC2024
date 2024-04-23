package Lista2;

import java.util.Scanner;

public class Lista2_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite um número inteiro: ");
        num1 = ler.nextInt();
        num2 = num1 % 2;

        if (num2 < 1){ System.out.println("Esse número eh par!");}
        else { System.out.println("Esse número eh impar!");
        }
    }
}
