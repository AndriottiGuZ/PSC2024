package Lista1;

import java.util.Scanner;

public class Lista03 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int Numeroslidos = 4;
        int Num1, Num2, Num3, Num4, soma, media;

        System.out.println("Digite quatro números: ");
        Num1 = ler.nextInt();
        Num2 = ler.nextInt();
        Num3 = ler.nextInt();
        Num4 = ler.nextInt();

        soma = Num1 + Num2 + Num3 + Num4;
        media = soma / Numeroslidos;

        System.out.printf("A media desses números é: %d (%d / %d", media, soma, Numeroslidos);
    }
}
