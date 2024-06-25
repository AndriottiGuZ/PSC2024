package Testes;

import java.util.Scanner;

public class Fatorial {

    // Método para calcular o fatorial de um número usando long
    public static Double calcularFatorial(int n) {
        Double fatorial = 1.0;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            // Solicita um número ao usuário
            System.out.print("Digite um número para calcular o fatorial ou -1 para sair: ");
            numero = scanner.nextInt();

            // Verifica se o usuário deseja sair
            if (numero == -1) {
                System.out.println("Encerrando o programa...");
                break;
            }

            // Calcula o fatorial e verifica se é maior que zero
            if (numero < 0) {
                System.out.println("Número inválido. Por favor, digite um número não negativo.");
            } else {
                Double resultado = calcularFatorial(numero);
                System.out.println("O fatorial de " + numero + " é " + resultado);
            }
        } while (true);

        scanner.close();
    }
}
