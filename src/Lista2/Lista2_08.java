package Lista2;

import java.util.Scanner;

public class Lista2_08 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int A, B, C;

        System.out.println("Digite os 3 lados de um triângulo: ");
        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();


        // Triângulo isósceles: possui dois lados iguais (A=B ou A=C ou B=C).
        // Triângulo escaleno: possui todos os lados diferentes (A<>B e B<>C e A<>C).
        // Triângulo equilátero: possui todos os lados iguais (A=B e B=C).

        if ((A < B + C) & (B < A + C) & (C < A + B)){
            if ((A==B) & (B==C)){
                System.out.println("eh um triãngulo equilátero!");
            }
            if (((A==B) & (A!=C)) || ((A==C) & (A!=B)) || (B==C) & (B!=A)){
                System.out.println("eh um triãngulo isósceles!");
            }
            if ((A!=B) & (B!=C) & (A!=C)){
                System.out.println("eh um triãngulo escaleno!");
               }
            }
        else{ System.out.println("não é um triangulo!");
        }
    }
}




