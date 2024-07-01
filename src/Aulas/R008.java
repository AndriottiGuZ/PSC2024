package Aulas;

import java.util.Scanner;

public class R008 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero, fatorial;

        System.out.print("Número: ");
        numero = ler.nextInt();

        fatorial = getFatorial(numero);

        System.out.println("Fatorial: " + fatorial);
    }

    private static int getFatorial(int numero) {

        int fatorial = 1,
                contador = 1;

        while (contador <= numero) {
            fatorial = fatorial * contador;
            contador = contador + 1;
        }
        return fatorial;
    }
}

