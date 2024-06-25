package Lista7.Quadrados;

import java.util.Scanner;

public class TestaQuadrado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();

        System.out.print("qual valor do lado do quadrado: ");
        int valor = ler.nextInt();
        quadrado.setLadoDoQuadrado(valor);

        System.out.printf("A area do quadrado é: %.1f\n", quadrado.getAreaQuadrado());
        System.out.printf("O perimetro do quadrado é: %.1f\n", quadrado.getPerimetroQuadrado());
        System.out.printf("A diagonal do quadrado é: %.1f", quadrado.getdiagonalQuadrado());
    }
}
