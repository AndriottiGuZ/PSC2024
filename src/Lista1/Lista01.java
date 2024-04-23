package Lista1;

import java.util.Scanner;

public class Lista01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int Num1, Num2, Resutado;

        System.out.println("Digite um número: ");
        Num1 = ler.nextInt();
        System.out.println("Digite outro número: ");
        Num2 = ler.nextInt();

        Resutado = Num1 * Num2;

        System.out.printf("O resultado da soma é: %d", Resutado);
    }
}
