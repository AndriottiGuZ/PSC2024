package Lista1;

import java.util.Scanner;

public class Lista04 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int x;

        System.out.println("Digite um número x: ");
        x = ler.nextInt();

        System.out.printf("1. o valor de x é: %d\n", x);
        System.out.printf("2. o valor de x² é: %d\n", (x * x));
        System.out.printf("3. o resto do valor de x por 3 é: %d\n", (x % 3));
        System.out.printf("4. o valor da metade de x é: %.1f\n", (float) (x / 2));
        System.out.printf("5. o valor do produto de x pela sua metade é: %.2f\n", (float) (x * (x / 2)));

    }
}
