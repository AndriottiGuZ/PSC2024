package Lista1;

import java.util.Scanner;

public class Lista03_1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int Numeroslidos = 4;
        float Num1, Num2, Num3, Num4, soma, media;

        System.out.println("Digite quatro números: ");
        Num1 = ler.nextFloat();
        Num2 = ler.nextFloat();
        Num3 = ler.nextFloat();
        Num4 = ler.nextFloat();

        soma = Num1 + Num2 + Num3 + Num4;
        media = soma / Numeroslidos;

        System.out.printf("A media desses números é: %.2f (%f / %d", media, soma, Numeroslidos);

    }
}
