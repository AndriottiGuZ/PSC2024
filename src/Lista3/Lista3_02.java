package Lista3;

import java.util.Scanner;

public class Lista3_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int A, B, i, t = 0, T = 0;

        System.out.print("digite um numero inteiro: ");
        A = ler.nextInt();

        System.out.print("digite outro numero inteiro maior que o primeiro: ");
        B = ler.nextInt();
        while (B<A){System.out.print("digite outro numero inteiro maior que o primeiro: ");
            B = ler.nextInt();}

        System.out.println("\nos numeros divisiveis por 5 são:\n");

        for (i = A; i <= B;i++) {
            if (i % 5 == 0) {
                System.out.printf("%d eh divisivel por 5...\n", i);
                T++;
                t += i;
            }
        }

        System.out.printf("\n\no total de numeros encontrados eh: %d\n", T);
        System.out.printf("o soma desses numeros eh: %d\n", t);
        }
    }
