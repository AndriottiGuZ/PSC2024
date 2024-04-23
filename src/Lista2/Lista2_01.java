package Lista2;

import java.util.Scanner;

public class Lista2_01 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num1;

        System.out.print("Digite um número inteiro: ");
        num1 = ler.nextInt();

        if (num1 > 100){ System.out.println("Esse número eh maior que 100!");}
        else { System.out.println("Esse número eh menor que 100!");
        }
    }
}
