package Lista3;

import java.util.Scanner;

public class Lista3_11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idafem, idamasc, mediamasc, mediafem, masc=0, fem=0, r=1, M=0, F=0;
        String Ma="M", Fe="F";

        while (r == 1) {

            System.out.print("\ndigire seu sexo masculino(M) ou feminino(F): ");
            String sex = ler.next();

            if (sex.equals((Ma)) || (sex.equals(Fe))) {
                if (sex.equals(Ma)) {
                    System.out.print("Digite a sua idade: ");
                    idamasc = ler.nextInt();
                    masc += idamasc;
                    M++;
                }
                if (sex.equals(Fe)) {
                    System.out.print("Digite a sua idade: ");
                    idafem = ler.nextInt();
                    fem += idafem;
                    F++;
                }
            } else {
                mediafem = fem / F;
                mediamasc = masc / M;
                System.out.println("\n\no total de mulheres eh: " + F);
                System.out.println("a media as idades femininas eh: " + mediafem);
                System.out.println("o total de homens eh: " + M);
                System.out.println("a media as idades masculinas eh: " + mediamasc);
                break;
            }
        }
    }
}