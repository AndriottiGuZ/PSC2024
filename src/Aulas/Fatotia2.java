package Aulas;

import java.util.Scanner;

public class Fatotia2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        do {
            System.out.print("\nDigite um numero inteiro maior que 0 para descobrir seu fatorial,\n" +
                    "ou um numero menor que 0 para encerrar o programa: ");
            n = ler.nextInt();

            if(n<1){System.out.println("\nencerrando programa...");break;}
            getFatorial(n);
        } while (n>=1);
    }

    private static void getFatorial(int n) {
        long fator = 1;
        for (int i = 1;i<= n;i++){
            fator = fator * i;
        }
        System.out.print("\nO fatorial desse numero é: " + fator +  "\n");
    }
}
