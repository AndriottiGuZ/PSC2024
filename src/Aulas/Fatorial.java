package Aulas;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite um número para calcular o seu fatorial: ");
            int numero = scanner.nextInt();

            // Calculando o fatorial usando BigInteger

            BigInteger fatorial = BigInteger.ONE;
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial.multiply(BigInteger.valueOf(i));
            }

            System.out.println("O fatorial de " + numero + " é " + fatorial);

            // Pergunta se o usuário quer continuar

            System.out.print("Deseja calcular outro fatorial? (s/n): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }
}